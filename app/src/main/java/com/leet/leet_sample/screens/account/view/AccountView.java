package com.leet.leet_sample.screens.account.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.leet.leet_sample.R;

/**
 * Created by YasuhiraChiba on 2017/10/31.
 */

public class AccountView implements AccountViewInterface, View.OnClickListener  {

    private View mRootView;
    private AccountViewListener mListner;

    private TextView tvEmail;
    private Button btLogout;


    public AccountView(LayoutInflater inflater, ViewGroup container) {
        mRootView = inflater.inflate(R.layout.view_account, container, false);

        initialize();
    }

    private void initialize() {
        tvEmail = (TextView)mRootView.findViewById(R.id.account_tv_email);
        btLogout = (Button)mRootView.findViewById(R.id.account_bt_logout);
        btLogout.setOnClickListener(this);
    }

    public void setText(String email) {
        tvEmail.setText(email);
    }


    @Override
    public void setListener(AccountViewListener listener) {
        this.mListner = listener;
    }

    @Override
    public View getRootView() {
        return mRootView;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.account_bt_logout:
                mListner.logoutClick();
                break;
        }
    }
}
