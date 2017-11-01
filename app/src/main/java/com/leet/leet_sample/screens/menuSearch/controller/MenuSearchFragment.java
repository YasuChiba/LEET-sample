package com.leet.leet_sample.screens.menuSearch.controller;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.leet.leet_sample.R;
import com.leet.leet_sample.screens.menuSearch.model.MenuSearchModel;
import com.leet.leet_sample.screens.menuSearch.view.MenuSearchView;

public class MenuSearchFragment extends Fragment {

    private MenuSearchView mView;
    private MenuSearchModel mModel;

    public MenuSearchFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
          //  mParam1 = getArguments().getString(ARG_PARAM1);
           // mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mModel = new MenuSearchModel();
        mView = new MenuSearchView(inflater, container);
        String[] texts = {"A","B","C"};
        mView.setupListView(getContext(),texts);

        mModel.getMenu(null);



        return mView.getRootView();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);


    }

    @Override
    public void onDetach() {
        super.onDetach();

    }
}
