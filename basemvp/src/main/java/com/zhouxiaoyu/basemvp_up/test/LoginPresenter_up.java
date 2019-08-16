package com.zhouxiaoyu.basemvp_up.test;

import com.zhouxiaoyu.basemvp_up.base_up.BasePresenter_up;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/8/15 0015
 *
 */
public class LoginPresenter_up extends BasePresenter_up<LoginActivity_up, LoginMoudle_up, ILogin.VP> {
    @Override
    public LoginMoudle_up setMyModle() {
        return new LoginMoudle_up(this);
    }



    @Override
    public ILogin.VP getContract() {
        return new ILogin.VP() {
            @Override
            public void requestLogin(String name, String pwd) {
                mModle.getContract().requestLogin(name,pwd);
//                mModle.requestLogin(name,pwd);
            }

            @Override
            public void requestSussed(boolean sussed) {
                mView.getContract().requestSussed(sussed);
//                mView.requestSussed(sussed);
            }
        };
    }
}
