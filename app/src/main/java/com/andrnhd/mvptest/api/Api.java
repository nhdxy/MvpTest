package com.andrnhd.mvptest.api;


import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * api文档
 * Created by nhd on 2017/3/10.
 */

public interface Api {
    String BASE_URL = "https://test.yalln.com/";
    //用户
    //检查手机号是否已存在
    String checkMobileExist = "/user/check_mobile_exist";

    //检查手机号是否已存在
    @POST(checkMobileExist)
    @FormUrlEncoded
    Observable<HttpResult> check_mobile_exists(@Field("mobile") String mobile);
}
