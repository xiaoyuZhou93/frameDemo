package com.example.mvcdeom.modle;

/***
 *   登录 成功 失败 回掉给 C
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/7/18 0018
 *
 */
public interface  OnLoginListener {

    void onSuccess(User user);

    void onFailed();


}
