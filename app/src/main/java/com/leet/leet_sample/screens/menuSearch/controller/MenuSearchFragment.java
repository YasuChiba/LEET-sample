package com.leet.leet_sample.screens.menuSearch.controller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leet.leet_sample.screens.menuSearch.model.MenuSearchModel;
import com.leet.leet_sample.screens.menuSearch.view.MenuSearchView;
import com.leet.leet_sample.utils.database.FirebaseDatabaseManager;
import com.leet.leet_sample.utils.database.entities.menu.MenuEntity;

import java.util.ArrayList;

public class MenuSearchFragment extends Fragment {

    private MenuSearchView mView;
    private MenuSearchModel mModel;

    public MenuSearchFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mModel = new MenuSearchModel();
        mView = new MenuSearchView(inflater, container);

        //set list of menu to listview after load from firebase
        mModel.getMenu(new FirebaseDatabaseManager.FirebaseDBArrayCallback() {
            @Override
            public void getData(ArrayList data) {
                mView.setupListView(getContext(),data);
            }
        });

        return mView.getRootView();
    }
}
