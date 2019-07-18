package com.example.mvcdeom.modle;

import android.text.TextUtils;
import android.widget.Toast;

/***
 *   被 C 持有的 M 对象
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/7/18 0018
 *
 */
public class UserModel implements IuserModel {

    @Override
    public void login(String name, String pwd, OnLoginListener loginListener) {
        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(pwd)) {
            return;
        }
        if ("123".equals(name) && "123".equals(pwd)) {
            loginListener.onSuccess(new User(name, pwd));
        } else {
            loginListener.onFailed();
        }
    }

    @Override
    public void exit(String user, OnExitListener exitListener) {
        if (TextUtils.equals("123", user)) {
            exitListener.onExitSuccess("成功");
        } else {
            exitListener.onExitFailed("失败");

        }

    }


    @Override
    public void test() {

    }
}
