package com.andrnhd.mvptest.ui.activity;

import android.view.View;
import android.widget.Toast;

import com.andrnhd.baselibrary.base.BaseMvpActivity;
import com.andrnhd.mvptest.R;
import com.andrnhd.mvptest.api.HttpResult;
import com.andrnhd.mvptest.contract.LoginContract;
import com.andrnhd.mvptest.model.LoginModelImpl;
import com.andrnhd.mvptest.presenter.LoginPresenterImpl;

public class MainActivity extends BaseMvpActivity<LoginPresenterImpl, LoginModelImpl> implements LoginContract.LoginView {

    @Override
    public void setData(HttpResult result) {
        Toast.makeText(this, result.getCode() + "", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.loadData(v, "18115329549");
            }
        });
    }

    @Override
    protected void loadData() {

    }
}
