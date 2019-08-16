package com.zhouxiaoyu.basemvp.test;

import android.text.TextUtils;

import com.zhouxiaoyu.basemvp.base.BaseMoudle;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/8/15 0015
 *
 */
public class LoginMoudle extends BaseMoudle<LoginPresenter> implements ILogin.M{

    public LoginMoudle(LoginPresenter presenter) {
        super(presenter);
    }

    @Override
    public void requestLogin(String name, String pwd) {
        //网络请求
        if(TextUtils.equals(name,"123")|| TextUtils.equals(pwd,"123")){
            mPresenter.requestSussed(true);
        }else{

            mPresenter.requestSussed(false);
        }

    }
}
