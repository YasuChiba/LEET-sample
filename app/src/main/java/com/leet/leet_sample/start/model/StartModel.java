package com.leet.leet_sample.start.model;

import com.leet.leet_sample.utils.SharedPrefManager;
import com.leet.leet_sample.utils.authentication.FirebaseAuthManager;

/**
 * Created by YasuhiraChiba on 2017/10/31.
 */

public class StartModel {

    public boolean isFirstLaunch() {
        return SharedPrefManager.getInstance().isFirstLaunch();
    }

    public boolean isLoggedIn() {
        return FirebaseAuthManager.isLoggedIn();
    }
}
