package com.zhouxiaoyu.basemvp_up.test;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/8/16 0016
 *
 */
public interface ILogin {
    public interface M {
        void requestLogin(String name, String pwd)  ;
    }

    interface VP {
        void requestLogin(String name, String pwd);

        void requestSussed(boolean sussed);


    }


}
