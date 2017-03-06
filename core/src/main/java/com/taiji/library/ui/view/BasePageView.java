package com.taiji.library.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.taiji.library.ui.activity.BaseActivity;

/**
 * 描述：TabLayout内的自定义控件基类
 * 创建人： panho
 * 创建时间： 2016-11-18
 */

public abstract class BasePageView extends LinearLayout{

    protected BaseActivity mActivity;

    public BasePageView(BaseActivity context) {
        this(context,null);
    }

    public BasePageView(BaseActivity context, AttributeSet attrs) {
        super(context, attrs);
        this.mActivity = context;
    }

    public abstract void onResume();

    public abstract void onPause();

    public abstract void onDestory();

    /**
     * 传递参数
     * @param param
     */
    public abstract void onRefreshData(String...param);

}
