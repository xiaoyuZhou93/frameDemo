package com.example.mvp.View;

/***
 * 规范 view 中的方法  (推荐更换为契约类方法实现)
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/7/18 0018
 *
 */
public interface IUserLoginView {

    String getUserName();

    String getPassword();

    void clearUserName();

    void clearPassword();

    void showLoading();

    void hideLoading();

    void toMainActivity();

    void showFailedError();

}