package com.xiaoyu.basemvp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/8/19 0019
 *
 */
public abstract class BaseActivity<P extends BasePresenter,CONTRACT> extends AppCompatActivity {

protected  P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setContentViewId());
        initView();
        this.mPresenter = setPresenter();
        initDate();
        mPresenter.bindView(this);

    }

    protected abstract CONTRACT getContract();

    /**
     * 初始化presenter
     */
    protected abstract P setPresenter();

    protected abstract void initDate();

    protected abstract void initView();


    /**
     * 指定xml
     *
     * @return
     */
    protected abstract int setContentViewId();


    @Override
    protected void onDestroy() {
        super.onDestroy();
        onActDestory();
    }

    protected abstract void onActDestory();
}
