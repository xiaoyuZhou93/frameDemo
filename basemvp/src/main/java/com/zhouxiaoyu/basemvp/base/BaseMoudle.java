package com.zhouxiaoyu.basemvp.base;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/8/15 0015
 *
 */
public class BaseMoudle<P extends BasePresenter> {
    protected P mPresenter;

    public BaseMoudle(P presenter) {
        this.mPresenter = presenter;
    }
}
