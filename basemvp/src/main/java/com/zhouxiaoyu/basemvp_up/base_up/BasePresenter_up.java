package com.zhouxiaoyu.basemvp_up.base_up;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/8/15 0015
 *
 */
public abstract class BasePresenter_up<V extends BaseActivity_up, M extends BaseMoudle_up,CONTRACT> extends SuperBase<CONTRACT> {

    public V mView;
    public M mModle;

    public BasePresenter_up() {
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
