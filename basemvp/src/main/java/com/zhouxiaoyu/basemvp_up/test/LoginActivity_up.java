package com.zhouxiaoyu.basemvp_up.test;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.zhouxiaoyu.basemvp.R;
import com.zhouxiaoyu.basemvp_up.base_up.BaseActivity_up;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/8/15 0015
 *
 */
public class LoginActivity_up extends BaseActivity_up<LoginPresenter_up,ILogin.VP>{

    private EditText name;
    private EditText pwd;
    private TextView button;

    @Override
    public ILogin.VP getContract() {
        return new ILogin.VP() {
            @Override
            public void requestLogin(String name, String pwd) {
//                myPresenter.requestLogin(name,pwd);
                myPresenter.getContract().requestLogin(name,pwd);

            }

            @Override
            public void requestSussed(boolean sussed) {
                if (sussed) {
                    Toast.makeText(LoginActivity_up.this, "成功", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(LoginActivity_up.this, "失败", Toast.LENGTH_SHORT).show();

                }
            }
        };
    }

    @Override
    protected LoginPresenter_up setMyPresenter() {
        return new LoginPresenter_up();
    }

    @Override
    protected void initDate() {

    }

    @Override
    protected void initListener() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getContract().requestLogin(name.getText().toString(),pwd.getText().toString());


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

}
