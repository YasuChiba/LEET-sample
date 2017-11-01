package com.leet.leet_sample.screens.main.controller;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.leet.leet_sample.screens.main.model.MainModel;
import com.leet.leet_sample.screens.main.view.MainView;
import com.leet.leet_sample.screens.menuSearch.controller.MenuSearchFragment;

public class MainActivity extends AppCompatActivity {

    private MainView mView;
    private MainModel mModel;

    private Fragment[] fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mModel = new MainModel();
        mView = new MainView(LayoutInflater.from(this), null);

        fragments = new Fragment[1];
        fragments[0] = new MenuSearchFragment();
        mView.setupTabs(fragments,mModel.tabTitles,getSupportFragmentManager());

        setContentView(mView.getRootView());
    }
}
