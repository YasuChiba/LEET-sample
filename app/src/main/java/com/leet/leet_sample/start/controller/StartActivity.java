package com.leet.leet_sample.start.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.leet.leet_sample.R;
import com.leet.leet_sample.start.model.StartModel;
import com.leet.leet_sample.start.view.StartView;

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

        Log.d("aaaaa", "is first launch???   :   "+mModel.isFirstLaunch());
        Log.d("aaaaa", "is logged in???   :   "+mModel.isLoggedIn());


    }


}
