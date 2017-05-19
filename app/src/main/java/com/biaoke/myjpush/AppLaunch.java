package com.biaoke.myjpush;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by hasee on 2017/5/19.
 */

public class AppLaunch extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true); 	// 设置开启日志,发布时请关闭日志
        JPushInterface.init(this);     		// 初始化 JPush
    }
}
