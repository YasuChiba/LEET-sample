package com.leet.leet_sample.screens.account.controller;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leet.leet_sample.screens.account.AccountInterface;
import com.leet.leet_sample.screens.account.model.AccountModel;
import com.leet.leet_sample.screens.account.view.AccountView;
import com.leet.leet_sample.screens.account.view.AccountViewInterface;
import com.leet.leet_sample.utils.authentication.FirebaseAuthManager;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccountFragment extends Fragment implements AccountViewInterface.AccountViewListener {

    private AccountView mView;
    private AccountModel mModel;

    private AccountInterface mListner;

    public AccountFragment() {}

    public void setupFragment(AccountInterface listner) {
        this.mListner = listner;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mModel = new AccountModel();

        mView = new AccountView(inflater,container);
        mView.setListener(this);
        mView.setText(mModel.getEmail());
        return mView.getRootView();
    }

    @Override
    public void logoutClick() {
        FirebaseAuthManager.logout();
        mListner.backToLogin();
    }

    @Override
    public void setUserData(String text) {
        mModel.setUserData(text);
    }
}
