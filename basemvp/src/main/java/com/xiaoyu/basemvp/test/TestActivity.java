package com.xiaoyu.basemvp.test;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.xiaoyu.basemvp.BaseActivity;
import com.xiaoyu.basemvp.R;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/8/19 0019
 *
 */
public class TestActivity extends BaseActivity<TextPresenter,ITest.VP> {


    private TextView login;
    private EditText name;
    private EditText pwd;

    @Override
    protected ITest.VP getContract() {
        return new ITest.VP() {
            @Override
            public void requestTest(String name, String pwd) {
                Log.e("act中判断数据", "requestTest: " );
                mPresenter.getContract().requestTest(name,pwd);

            }

            @Override
            public void requestSussed(boolean isSussed) {
                if (isSussed){
                    Toast.makeText(TestActivity.this, "成功", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(TestActivity.this, "失败", Toast.LENGTH_SHORT).show();
                }

            }
        };
    }

    @Override
    protected TextPresenter setPresenter() {
        return new TextPresenter(this);
    }

    @Override
    protected void initDate() {

    }

    @Override
    protected void initView() {
        login = findViewById(R.id.test1);
        name = findViewById(R.id.edit1);
        pwd = findViewById(R.id.edit1);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getContract().requestTest(name.getText().toString(),pwd.getText().toString());
            }
        });

    }

    @Override
    protected int setContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onActDestory() {
        Log.e("走了销毁方法", "onActDestory: " );


    }
}
