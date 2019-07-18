package com.example.mvcdeom.modle;

/***
 *   为 C 提供业务逻辑的实现方法
 *   规定了C 持有 M的方法
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/7/18 0018
 *
 */
public interface IuserModel {
    void login(String user, String pwd, OnLoginListener loginListener);

    void exit(String user, OnExitListener exitListener);
    void test();



}
