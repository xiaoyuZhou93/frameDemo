package com.example.mvcdeom.modle;

/***
 *    回掉给 C 的结果
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/7/18 0018
 *
 */
public interface OnExitListener {

    void onExitSuccess(String str);

    void onExitFailed(String msg);


}
