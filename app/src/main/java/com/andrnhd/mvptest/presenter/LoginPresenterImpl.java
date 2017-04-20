package com.andrnhd.mvptest.presenter;

import android.view.View;

import com.andrnhd.baselibrary.network.MvpListener;
import com.andrnhd.mvptest.api.HttpResult;
import com.andrnhd.mvptest.contract.LoginContract;

/**
 * Created by nhd on 2017/4/20.
 */

public class LoginPresenterImpl extends LoginContract.LoginPresenter {
    @Override
    public void loadData(final View view, String mobile) {
        final LoginContract.LoginView mView = getView();
        if (mView == null) {
            return;
        }
        mView.showLoading(view);
        mModel.loadLogin(mobile, new MvpListener<HttpResult>() {
            @Override
            public void onSuccess(HttpResult data) {
                mView.hideLoading(view);
                mView.setData(data);
            }

            @Override
            public void onFailure(String error) {
                mView.hideLoading(view);
            }
        });
    }
}
