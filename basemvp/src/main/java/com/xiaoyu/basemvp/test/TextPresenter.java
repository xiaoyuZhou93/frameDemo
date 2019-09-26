package com.xiaoyu.basemvp.test;

import android.util.Log;

import com.xiaoyu.basemvp.BasePresenter;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/8/19 0019
 *
 */
public class TextPresenter extends BasePresenter<TestMoudle,TestActivity,ITest.VP> {


    public TextPresenter(TestActivity mView) {
        super(mView);
    }

    @Override
    protected TestMoudle setMyModle() {
        return new TestMoudle(this);
    }


    @Override
    public ITest.VP getContract() {
        return new ITest.VP() {
            @Override
            public void requestTest(String name, String pwd) {
                Log.e("presenter中判断数据", "requestTest: " );
                mMoudle.getContract().requestTest(name,pwd);

            }

            @Override
            public void requestSussed(boolean isSussed) {
                Log.e("presenter返回数据", "requestTest: " );
                    mView.getContract().requestSussed(isSussed);

            }
        };
    }
}
