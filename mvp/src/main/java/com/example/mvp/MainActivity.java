package com.example.mvp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.mvp.Presenter.UserLoginPresenterImpl;
import com.example.mvp.View.IUserLoginView;


/***
 * view的实现类
 * 简介 : mvp 中把 mvc 在 activityt 中的 C抽离出去
 * 说明 : 或者说这里只剩下 V
 * 功能 : 负责创建 P 实例以及创建 View(Fragment)，并将二者联系起来
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/7/18 0018
 *
 */
public class MainActivity extends AppCompatActivity implements IUserLoginView {

    private UserLoginPresenterImpl mIUserLoginPresenter;
    private EditText mEdtUsername;
    private EditText mEdtPwd;
    private Button mBtnClear;
    private Button mBtnLogin;
    private ProgressBar mLoading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        //创建p的时候吧view 实例传过去方便在p里面获取 v 的数据
        mIUserLoginPresenter = new UserLoginPresenterImpl(this);
        mEdtUsername = findViewById(R.id.input_account);
        mEdtPwd = findViewById(R.id.input_password);

        mBtnClear = findViewById(R.id.btn_clear);
        mBtnLogin = findViewById(R.id.btn_login);

        mLoading = findViewById(R.id.pb_loading);

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIUserLoginPresenter.doLogin();
            }
        });

        mBtnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIUserLoginPresenter.clear();
            }
        });

    }

    @Override
    public String getUserName() {
        return mEdtUsername.getText().toString();
    }

    @Override
    public String getPassword() {
        return mEdtPwd.getText().toString();
    }

    @Override
    public void clearUserName() {
        mEdtUsername.setText("");
    }

    @Override
    public void clearPassword() {
        mEdtPwd.setText("");
    }

    @Override
    public void showLoading() {
        mLoading.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        mLoading.setVisibility(View.GONE);
    }

    @Override
    public void toMainActivity() {
        Toast.makeText(this,"login success, to MainActivity",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showFailedError() {
        Toast.makeText(this,"Login failed",Toast.LENGTH_SHORT).show();
    }

}
