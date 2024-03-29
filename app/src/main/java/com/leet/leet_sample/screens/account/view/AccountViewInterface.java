package com.leet.leet_sample.screens.account.view;

import com.leet.leet_sample.common.ViewBaseInterface;

/**
 * Created by YasuhiraChiba on 2017/10/31.
 */

public interface AccountViewInterface extends ViewBaseInterface {

    interface AccountViewListener {
          void logoutClick();
          void setUserData(String text);
    }

    void setListener(AccountViewListener listener);
}
