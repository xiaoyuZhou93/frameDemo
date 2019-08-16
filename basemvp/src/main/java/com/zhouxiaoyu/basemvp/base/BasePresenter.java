package com.zhouxiaoyu.basemvp.base;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/8/15 0015
 *
 */
public abstract class BasePresenter<V extends BaseActivity, M extends BaseMoudle> {

    public V mView;
    public M mModle;

    public BasePresenter() {
        this.mModle = setMyModle();

    }

    public void bindView(V view) {
        this.mView = view;


    }

    public void unBindView() {
        mView = null;
    }

    public abstract M setMyModle();
}
