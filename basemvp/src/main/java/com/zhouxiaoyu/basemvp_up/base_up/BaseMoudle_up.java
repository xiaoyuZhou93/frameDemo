package com.zhouxiaoyu.basemvp_up.base_up;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/8/15 0015
 *
 */
public abstract class BaseMoudle_up<P extends BasePresenter_up,CONTRACT> extends SuperBase<CONTRACT>{
    protected P mPresenter;
    public BaseMoudle_up(P presenter) {
        this.mPresenter = presenter;
    }
}
