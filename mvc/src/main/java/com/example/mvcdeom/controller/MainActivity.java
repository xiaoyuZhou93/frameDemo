package com.example.mvcdeom.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.mvcdeom.R;
import com.example.mvcdeom.modle.OnExitListener;
import com.example.mvcdeom.modle.OnLoginListener;
import com.example.mvcdeom.modle.User;
import com.example.mvcdeom.modle.UserModel;

//  网络借鉴
//
// M：数据库层，数据模型层，网络请求管理，数据存储类的东西，都可以属于M层，简单点理解就是数据层，或者叫基础层。
// V：这一层在Android当中其实是XML，也就是RES资源文件下的LAYOUT们。可不是ACTIVITY。
// C：这一层在Android当中才是ACTIVITY，控制层，用于控制界面与数据进行交互的，相信看到这里，大部分开发者回想自己的代码实现的方式的时候基本就明白了，为什么ACTIVITY是控制层了。
/**
 *  MVC 里面的 C 层(准确的说既是 C 又是 V )
 */
public class MainActivity extends AppCompatActivity implements OnLoginListener, OnExitListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserModel userModel = new UserModel();
        userModel.login("123", "123", this);
        userModel.exit("123", this);
    }

    // 登录的回调
    @Override
    public void onSuccess(User user) {

    }

    @Override
    public void onFailed() {

    }


    // 退出的回调
    @Override
    public void onExitSuccess(String str) {

    }

    @Override
    public void onExitFailed(String msg) {

    }
}
