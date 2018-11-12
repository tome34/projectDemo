package com.fecmobile.distribution.base;

import com.fec.core.base.BaseApplication;

/**
 * @author tome
 * @date 2018/7/24  10:22
 * @describe ${初始化application}
 */
public class MyApplication extends BaseApplication {
    private static MyApplication myApplication;

    public static MyApplication getInstance() {
        return myApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this ;

    }
}
