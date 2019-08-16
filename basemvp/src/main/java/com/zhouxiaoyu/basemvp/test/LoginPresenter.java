package com.zhouxiaoyu.basemvp.test;

import com.zhouxiaoyu.basemvp.base.BasePresenter;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/8/15 0015
 *
 */
public class LoginPresenter extends BasePresenter<LoginActivity,LoginMoudle> implements ILogin.VP{
    @Override
    public LoginMoudle setMyModle() {
        return new LoginMoudle(this);
    }


    @Override
    public void requestLogin(String name, String pwd) {
        //判断数据
        mModle.requestLogin(name,pwd);
    }

    @Override
    public void requestSussed(boolean sussed) {
        //解析数据
//        ...
            mView.requestSussed(sussed);
    }
}
