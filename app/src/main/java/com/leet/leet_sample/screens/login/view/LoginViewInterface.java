package com.leet.leet_sample.screens.login.view;

import com.leet.leet_sample.common.ViewBaseInterface;

/**
 * Created by YasuhiraChiba on 2017/10/31.
 */

public interface LoginViewInterface extends ViewBaseInterface {

    interface LoginViewListener {
        /**
         * This callback will be invoked when "createAccount" button is being clicked
         */
        void createAccountClick(String emai, String password);

        void loginClick(String emai, String password);
    }


    /**
     * Set a listener that will be notified by this MVC view
     * @param listener listener that should be notified; null to clear
     */
    void setListener(LoginViewListener listener);
}
