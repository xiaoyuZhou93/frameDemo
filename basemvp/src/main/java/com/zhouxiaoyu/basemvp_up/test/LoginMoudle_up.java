package com.zhouxiaoyu.basemvp_up.test;

import android.text.TextUtils;

import com.zhouxiaoyu.basemvp_up.base_up.BaseMoudle_up;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/8/15 0015
 *
 */
public class LoginMoudle_up extends BaseMoudle_up<LoginPresenter_up, ILogin.M> {

    public LoginMoudle_up(LoginPresenter_up presenter) {
        super(presenter);
    }


    @Override
    public ILogin.M getContract() {
        return new ILogin.M() {
            @Override
            public void requestLogin(String name, String pwd) {
                //网络请求
                if(TextUtils.equals(name,"123")|| TextUtils.equals(pwd,"123")){
                    mPresenter.getContract().requestSussed(true);
//                    mPresenter.requestSussed(true);
                }else{
                    mPresenter.getContract().requestSussed(false);
//                    mPresenter.requestSussed(false);
                }

            }
        };
    }
}
