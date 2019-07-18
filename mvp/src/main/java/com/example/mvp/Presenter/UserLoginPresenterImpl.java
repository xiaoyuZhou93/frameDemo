package com.example.mvp.Presenter;

import android.os.Handler;

import com.example.mvp.Modle.IUserModel;
import com.example.mvp.Modle.UserModelImpl;
import com.example.mvp.View.IUserLoginView;

/***
 *  P 的实现类
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/7/18 0018
 *
 * 在 P 中初始化Model的实现类 因为M 掌控着实行步骤
 *    说明 : p是控制拿到业务逻辑的结果 用 V 的实例去调整界面
 */
public class UserLoginPresenterImpl implements IUserLoginPresenter, IUserModel.OnLoginListener {

    private IUserLoginView mIUserLoginView;
    private IUserModel mIUserModel;

    private Handler mHandler = new Handler();

    public UserLoginPresenterImpl(IUserLoginView IUserLoginView) {
        mIUserLoginView = IUserLoginView;
        //初始化Model的实现类
        mIUserModel = new UserModelImpl(this);
}

    @Override
    public void doLogin() {
        String username = mIUserLoginView.getUserName();
        String password = mIUserLoginView.getPassword();
        mIUserLoginView.showLoading();
        mIUserModel.login(username, password, this);
    }

    @Override
    public void loginSuccess() {
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                mIUserLoginView.hideLoading();
                mIUserLoginView.toMainActivity();
            }
        });
    }

    @Override
    public void loginFailed() {
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                mIUserLoginView.hideLoading();
                mIUserLoginView.showFailedError();
            }
        });
    }

    @Override
    public void clear() {
        mIUserLoginView.clearUserName();
        mIUserLoginView.clearPassword();
    }
}