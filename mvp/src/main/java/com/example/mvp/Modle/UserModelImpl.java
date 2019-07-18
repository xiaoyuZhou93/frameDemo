package com.example.mvp.Modle;

import com.example.mvp.Presenter.IUserLoginPresenter;
/***
 *  实现业务逻辑 并且把结果返回到 P
 *  说明 : 此处进行耗时操作 并且把结果返回到 P
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/7/18 0018
 *
 */
public class UserModelImpl implements IUserModel{

    private IUserLoginPresenter mIUserLoginPresenter;

    public UserModelImpl(IUserLoginPresenter IUserLoginPresenter) {
        mIUserLoginPresenter = IUserLoginPresenter;
    }

    @Override
    public void login(final String username, final String password,final IUserModel.OnLoginListener listener) {
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if("123".equals(username)&&"123".equals(password)){
                    User user = new User();
                    user.setUsername(username);
                    user.setPassword(password);
                    listener.loginSuccess();
                }else{
                    listener.loginFailed();
                }
            }
        }.start();
    }
}