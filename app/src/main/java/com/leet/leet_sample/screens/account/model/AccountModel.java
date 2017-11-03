package com.leet.leet_sample.screens.account.model;

import com.leet.leet_sample.utils.authentication.FirebaseAuthManager;
import com.leet.leet_sample.utils.database.FirebaseDatabaseManager;
import com.leet.leet_sample.utils.database.entities.user.UserProfileEntity;

/**
 * Created by YasuhiraChiba on 2017/10/31.
 */

public class AccountModel {

    public String getEmail() {
        return FirebaseAuthManager.getEmail();
    }

    public void setUserData(UserProfileEntity data) {
        FirebaseDatabaseManager.setUserProfile(data);
    }

    public void getUserProfile(final FirebaseDatabaseManager.FirebaseDBObjectCallback callback) {
        FirebaseDatabaseManager.getUserProfile(new FirebaseDatabaseManager.FirebaseDBObjectCallback() {
            @Override
            public void getData(Object data) {
                callback.getData(data);
            }
        });
    }

}
