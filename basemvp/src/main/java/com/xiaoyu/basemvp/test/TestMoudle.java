package com.xiaoyu.basemvp.test;

import android.text.TextUtils;
import android.util.Log;

import com.xiaoyu.basemvp.BaseMoudle;

/***
 *
 * @Author: Zhou xiaoyu
 * @CreateDate: 2019/8/19 0019
 *
 */
public class TestMoudle extends BaseMoudle<TextPresenter, ITest.M> {

    public TestMoudle(TextPresenter presenter) {
        super(presenter);
    }

    @Override
    public ITest.M getContract() {
        return new ITest.M() {
            @Override
            public void requestTest(String name, String pwd) {
                Log.e("moudle中处理数据", "requestTest: ");
                if (TextUtils.equals("123",name)) {
                    mpresenter.getContract().requestSussed(true);
                } else {
                    mpresenter.getContract().requestSussed(false);
                }
            }
        };
    }
}
