package com.leet.leet_sample.utils;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by YasuhiraChiba on 2017/10/31.
 */

//singleton class for using shared preference
public class SharedPrefManager {

    private static SharedPrefManager mSingleton = new SharedPrefManager();

    private SharedPrefManager(){
    }

    public static SharedPrefManager getInstance(){
        return mSingleton;
    }


//-------------------------------------------------------------
    private SharedPreferences prefs =  PreferenceManager.getDefaultSharedPreferences(ContextManager.getInstance().getApplicationContext());
    private SharedPreferences.Editor editor = prefs.edit();

    private String keyForIsFirstLaunch = "isFirstLaunch";


    //return true and set false if first launch.
    public boolean isFirstLaunch() {
        if(prefs.getBoolean(keyForIsFirstLaunch, true) == true) {
            editor = prefs.edit();
            editor.putBoolean(keyForIsFirstLaunch,false);
            return true;
        }
        return false;
    }

}
