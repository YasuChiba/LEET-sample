package com.leet.leet_sample.screens.login.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.leet.leet_sample.R;

/**
 * Created by YasuhiraChiba on 2017/10/31.
 */

public class LoginView implements LoginViewInterface, View.OnClickListener {

    private View mRootView;
    private LoginViewListener mListener;

    private EditText etEmail;
    private EditText etPassword;
    private Button btCreateAccount;
    private Button btLogin;

    public LoginView(LayoutInflater inflater, ViewGroup container) {
        mRootView = inflater.inflate(R.layout.view_login, container, false);

        initialize();
    }

    private void initialize() {
        etEmail = (EditText) mRootView.findViewById(R.id.et_email);
        etPassword = (EditText) mRootView.findViewById(R.id.et_password);
        btCreateAccount = (Button)mRootView.findViewById(R.id.bt_createaccount);
        btLogin = (Button)mRootView.findViewById(R.id.bt_login);

        btCreateAccount.setOnClickListener(this);
        btLogin.setOnClickListener(this);
    }

    public void setDefaultValues(String email, String password) {
        etEmail.setText(email);
        etPassword.setText(password);
    }


    //-------start  LoginViewInterface-----
    @Override
    public View getRootView() {
        return mRootView;
    }


    @Override
    public void setListener(LoginViewListener listener) {
        mListener = listener;
    }
    //------end  LoginViewInterface------


    //------start View.OnClickListner------
    @Override
    public void onClick(View view) {



    }

    //------end View.OnClickListner-----

}
