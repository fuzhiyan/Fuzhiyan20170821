package com.baway.fuzhiyan.fuzhiyan20170821;

import android.app.Application;

/**
 * Created by Administrator on 2017/8/21.
 * time:
 * author:付智焱
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
    }
}
