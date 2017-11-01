package com.leet.leet_sample.screens.account.model;

import com.leet.leet_sample.utils.authentication.FirebaseAuthManager;
import com.leet.leet_sample.utils.database.FirebaseDatabaseManager;

/**
 * Created by YasuhiraChiba on 2017/10/31.
 */

public class AccountModel {

    public String getEmail() {
        return FirebaseAuthManager.getEmail();
    }

    public void setUserData(String text) {
        FirebaseDatabaseManager.setUserData(text);
    }
}
