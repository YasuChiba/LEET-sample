package com.leet.leet_sample.utils;

import android.app.Application;

/**
 * Created by YasuhiraChiba on 2017/10/31.
 */

public class UtilCommon extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ContextManager.onCreateApplication(getApplicationContext());
    }

}
