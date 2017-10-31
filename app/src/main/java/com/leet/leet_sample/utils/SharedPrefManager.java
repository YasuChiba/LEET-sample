package com.leet.leet_sample.utils;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by YasuhiraChiba on 2017/10/31.
 */

//class for using shared preference
public class SharedPrefManager {


    private static SharedPreferences prefs =  PreferenceManager.getDefaultSharedPreferences(ContextManager.getInstance().getApplicationContext());
    private static SharedPreferences.Editor editor = prefs.edit();

    private static String keyForIsFirstLaunch = "isFirstLaunch";

    //return true and set false if first launch.
    public static  boolean isFirstLaunch() {
        if(prefs.getBoolean(keyForIsFirstLaunch, true) == true) {
            editor = prefs.edit();
            editor.putBoolean(keyForIsFirstLaunch,false);
            editor.apply();
            return true;
        }
        return false;
    }
}
