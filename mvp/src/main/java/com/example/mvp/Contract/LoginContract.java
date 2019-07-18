package com.example.mvp.Contract;

/***
 *  契约类 ( 约定 V 和 P  的另一种方法 便于看出来两者的关系)
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/7/18 0018
 *
 */
public interface LoginContract {

    public interface LoginView {

        String getUserName();

        String getPassword();

        void clearUserName();

        void clearPassword();

        void showLoading();

        void hideLoading();

        void toMainActivity();

        void showFailedError();
    }

    public interface LoginPresenter {

        void login();

        void clear();
    }
}