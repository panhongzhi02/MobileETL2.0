package com.taiji.library.ui.activity;

import android.support.annotation.Nullable;

import com.facebook.react.ReactActivity;

/**
 * 作者：panho on 2017-2-26 09:16
 * 邮箱: panhongzhi02@163.com
 * 功能描述：
 */

public class ReactNativeActivity extends ReactActivity{

    @Nullable
    @Override
    protected String getMainComponentName() {
        return "mobile_etl";
    }

}
