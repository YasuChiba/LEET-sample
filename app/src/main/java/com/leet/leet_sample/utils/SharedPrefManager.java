package com.leet.leet_sample.utils;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.leet.leet_sample.common.ContextManager;

/**
 * Created by YasuhiraChiba on 2017/10/31.
 */

//class for using shared preference
public class SharedPrefManager {


    private static SharedPreferences prefs =  PreferenceManager.getDefaultSharedPreferences(ContextManager.getInstance().getApplicationContext());
    private static SharedPreferences.Editor editor = prefs.edit();

    private final static String keyForIsFirstLaunch = "isFirstLaunch";

    //return true and set false if first launch.
    public static  boolean loadIsFirstLaunch() {
        if(prefs.getBoolean(keyForIsFirstLaunch, true) == true) {
            saveIsFirstLaunch(false);
            return true;
        }
        return false;
    }

    public static void saveIsFirstLaunch(boolean val) {
        editor = prefs.edit();
        editor.putBoolean(keyForIsFirstLaunch,val);
        editor.apply();
    }
}
