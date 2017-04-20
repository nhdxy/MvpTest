package com.andrnhd.mvptest.contract;


import android.view.View;

import com.andrnhd.baselibrary.base.BaseModel;
import com.andrnhd.baselibrary.base.BaseView;
import com.andrnhd.baselibrary.base.BasePresenter;
import com.andrnhd.baselibrary.network.MvpListener;
import com.andrnhd.mvptest.api.HttpResult;

/**
 * Created by nhd on 2017/4/20.
 */

public interface LoginContract {
    interface LoginModel extends BaseModel {
        void loadLogin(String mobile, MvpListener<HttpResult> listener);
    }

    interface LoginView extends BaseView {
        void setData(HttpResult result);
    }

    abstract class LoginPresenter extends BasePresenter<LoginModel, LoginView> {
        public abstract void loadData(View view, String mobile);
    }
}
