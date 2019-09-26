package com.xiaoyu.basemvp;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/8/19 0019
 *
 */
public abstract class BasePresenter<M extends BaseMoudle, V extends BaseActivity, CONTRACT> extends MPBase<CONTRACT> {

    protected V mView;
    protected M mMoudle;

    public BasePresenter(V mView) {

        this.mMoudle = setMyModle();
    }

    public void bindView(V mView){
        this.mView = mView;
    }

    public void unBindView(V mView){
        this.mView =null;
    }


    protected abstract M setMyModle();


}
