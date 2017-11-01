package com.leet.leet_sample.screens.login.controller;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.leet.leet_sample.screens.login.view.LoginView;
import com.leet.leet_sample.screens.login.view.LoginViewInterface;
import com.leet.leet_sample.screens.main.controller.MainActivity;
import com.leet.leet_sample.screens.start.view.StartView;
import com.leet.leet_sample.utils.DialogManager;
import com.leet.leet_sample.utils.ProgressDialogManager;
import com.leet.leet_sample.utils.authentication.FirebaseAuthManager;

public class LoginActivity extends AppCompatActivity implements LoginViewInterface.LoginViewListener, OnCompleteListener {

    private LoginView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mView = new LoginView(LayoutInflater.from(this), null);
        setContentView(mView.getRootView());

        mView.setListener(this);
        mView.setDefaultValues("test@gmail.com","testtest");
    }


    //--------start loginListner----------
    @Override
    public void createAccountClick(String email, String password) {
        ProgressDialogManager.showProgressDialog(this);
        FirebaseAuthManager.signUpNewUser(email, password, this);
    }

    @Override
    public void loginClick(String email, String password) {
        ProgressDialogManager.showProgressDialog(this);
        FirebaseAuthManager.signIn(email,password,this);
    }

    //--------end loginListner----------

    //-----start OnCompleteListner
    @Override
    public void onComplete(@NonNull Task task) {
        ProgressDialogManager.hideProgressDialog();
        if (!task.isSuccessful()){
            DialogManager.simpleDialog(this, "FAIL", task.getException().getMessage(), new DialogManager.DialogTappListner() {
                @Override
                public void okButtonTapped() {
                }
            });
        } else {
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
    }
    //-----end OnCompleteListner---
}
