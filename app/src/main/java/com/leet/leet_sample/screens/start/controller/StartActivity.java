package com.leet.leet_sample.screens.start.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.leet.leet_sample.screens.login.controller.LoginActivity;
import com.leet.leet_sample.screens.start.model.StartModel;
import com.leet.leet_sample.screens.start.view.StartView;

public class StartActivity extends AppCompatActivity {

    private StartView mView;
    private StartModel mModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //create view and attach to activity
        mView = new StartView(LayoutInflater.from(this), null);
        setContentView(mView.getRootView());

        //create model
        mModel = new StartModel();
    }

    @Override
    protected void onStart() {
        super.onStart();

        if(mModel.isLoggedIn()) {


        }else {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
    }


}
