package com.zhouxiaoyu.basemvp_up.base_up;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/8/15 0015
 *
 */
public abstract class BaseActivity_up<P extends BasePresenter_up, CONTRACT> extends AppCompatActivity {

    public abstract CONTRACT getContract(); //要求子类提供泛型类型

    protected P myPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getContentLayout());
        initView();
        initDate();
        setMyPresenter();
        initListener();
        myPresenter = setMyPresenter();
        myPresenter.bindView(this);
    }

    /**
     * 设置presenter
     *
     * @return
     */
    protected abstract P setMyPresenter();

    /**
     * 初始化数据
     */
    protected abstract void initDate();

    /**
     * 初始化监听
     */
    protected abstract void initListener();

    /**
     * 初始化view
     */
    protected abstract void initView();

    /**
     * 设置布局
     *
     * @return
     */
    protected abstract int getContentLayout();


    @Override
    protected void onDestroy() {
        super.onDestroy();
        destroy();
    }

    /**
     * 销毁
     */
    protected abstract void destroy();
}
