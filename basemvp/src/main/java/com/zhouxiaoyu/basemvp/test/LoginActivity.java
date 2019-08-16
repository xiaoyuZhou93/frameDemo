package com.zhouxiaoyu.basemvp.test;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.zhouxiaoyu.basemvp.R;
import com.zhouxiaoyu.basemvp.base.BaseActivity;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/8/15 0015
 *
 */
public class LoginActivity extends BaseActivity<LoginPresenter> implements ILogin.VP{

    private EditText name;
    private EditText pwd;
    private TextView button;

    @Override
    protected LoginPresenter setMyPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected void initDate() {

    }

    @Override
    protected void initListener() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requestLogin(name.getText().toString(),pwd.getText().toString());
            }
        });
    }

    @Override
    protected void initView() {
        name = findViewById(R.id.name);
        pwd = findViewById(R.id.pwd);
        button = findViewById(R.id.button);
    }

    @Override
    protected int getContentLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void destroy() {

    }

    @Override
    public void requestLogin(String name, String pwd) {
        myPresenter.requestLogin(name,pwd);

    }

    @Override
    public void requestSussed(boolean sussed) {
        if (sussed) {
            Toast.makeText(this, "成功", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "失败", Toast.LENGTH_SHORT).show();

        }

    }
}
