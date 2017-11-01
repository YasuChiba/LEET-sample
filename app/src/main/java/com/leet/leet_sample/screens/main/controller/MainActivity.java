package com.leet.leet_sample.screens.main.controller;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.leet.leet_sample.screens.account.AccountInterface;
import com.leet.leet_sample.screens.account.controller.AccountFragment;
import com.leet.leet_sample.screens.login.controller.LoginActivity;
import com.leet.leet_sample.screens.main.model.MainModel;
import com.leet.leet_sample.screens.main.view.MainView;
import com.leet.leet_sample.screens.menuSearch.controller.MenuSearchFragment;

public class MainActivity extends AppCompatActivity implements AccountInterface {

    private MainView mView;
    private MainModel mModel;

    private Fragment[] fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mModel = new MainModel();
        mView = new MainView(LayoutInflater.from(this), null);

        AccountFragment accountFragment = new AccountFragment();
        accountFragment.setupFragment(this);
        MenuSearchFragment menuSearchFragment = new MenuSearchFragment();
        fragments = new Fragment[2];
        fragments[0] = menuSearchFragment;
        fragments[1] = accountFragment;

        mView.setupTabs(fragments,mModel.tabTitles,getSupportFragmentManager());

        setContentView(mView.getRootView());
    }

    @Override
    public void backToLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
