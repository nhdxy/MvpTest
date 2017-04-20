package com.andrnhd.mvptest.model;

import com.andrnhd.baselibrary.network.MvpListener;
import com.andrnhd.mvptest.api.HttpResult;
import com.andrnhd.mvptest.api.HttpUtils;
import com.andrnhd.mvptest.contract.LoginContract;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by nhd on 2017/4/20.
 */

public class LoginModelImpl implements LoginContract.LoginModel {
    @Override
    public void loadLogin(String mobile, final MvpListener<HttpResult> listener) {
        HttpUtils.getInstance().check_mobile_exists(mobile)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HttpResult>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        if (null != listener) {
                            listener.onFailure(e.getMessage());
                        }
                    }

                    @Override
                    public void onNext(HttpResult httpResult) {
                        if (null != listener) {
                            listener.onSuccess(httpResult);
                        }
                    }
                });
    }
}
