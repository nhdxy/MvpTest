package com.andrnhd.mvptest.api;

import com.andrnhd.baselibrary.util.NoSSLv3SocketFactory;
import com.andrnhd.baselibrary.util.SSLContextUtil;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Http工具类
 * Created by nhd on 2017/3/10.
 */

public class HttpUtils {
    private static final int DEFAULT_TIMEOUT = 15;
    private Api api;

    private HttpUtils() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.MINUTES);
        builder.readTimeout(30, TimeUnit.SECONDS);
        builder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request()
                        .newBuilder()
                        .addHeader("Api-Version", "v1")
                        .build();
                Response response = chain.proceed(request);
                if (response.code() == 404) {
                    throw new RuntimeException("已与服务器断开连接");
                } else if (response.code() == 500) {
                    throw new RuntimeException("服务器异常");
                }
                return response;
            }
        });
        SSLContext sslContext = SSLContextUtil.getDefaultSLLContext();
        builder.sslSocketFactory(new NoSSLv3SocketFactory(sslContext.getSocketFactory()), SSLContextUtil.getX509TrustManager());
        builder.hostnameVerifier(new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        });
        Retrofit retrofit = new Retrofit.Builder()
                .client(builder.build())
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        api = retrofit.create(Api.class);
    }

    //在访问HttpMethods时创建单例
    private static class SingletonHolder {
        private static final HttpUtils INSTANCE = new HttpUtils();
    }

    //获取单例
    public static Api getInstance() {
        return SingletonHolder.INSTANCE.api;
    }
}
