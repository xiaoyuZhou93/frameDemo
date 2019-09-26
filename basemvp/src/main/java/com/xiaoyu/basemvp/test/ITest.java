package com.xiaoyu.basemvp.test;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/8/19 0019
 *
 */
public interface ITest {
    interface M {
        void requestTest(String name, String pwd);


    }

    interface VP {
        void requestTest(String name, String pwd);

        void requestSussed(boolean isSussed);


    }


}
