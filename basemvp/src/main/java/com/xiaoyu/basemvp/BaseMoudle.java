package com.xiaoyu.basemvp;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/8/19 0019
 *
 */
public abstract class BaseMoudle<P extends BasePresenter,CONTRACT> extends MPBase<CONTRACT>{
    protected P mpresenter;

    public BaseMoudle(P presenter) {
        this.mpresenter = presenter;


    }
}
