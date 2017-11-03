package com.leet.leet_sample.screens.account.view;

import com.leet.leet_sample.common.ViewBaseInterface;
import com.leet.leet_sample.utils.database.entities.user.UserProfileEntity;

/**
 * Created by YasuhiraChiba on 2017/10/31.
 */

public interface AccountViewInterface extends ViewBaseInterface {

    interface AccountViewListener {
          void logoutClick();
          void setUserData(UserProfileEntity userProfile);
    }

    void setListener(AccountViewListener listener);
}
