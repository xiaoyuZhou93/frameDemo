package com.example.mvp.Modle;
/***
 *   约定业务逻辑
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/7/18 0018
 *
 */
public interface IUserModel {

    void login(String username, String password, OnLoginListener listener);

    //回调接口，我放到IUserModel中，实际上也可以单独抽离出来，或者放到 presenter 的接口中都是可以的，毕竟这个demo功能太单一了
    public interface OnLoginListener {

        void loginSuccess();

        void loginFailed();
    }
}