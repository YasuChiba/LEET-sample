package com.leet.leet_sample.screens.menuSearch.model;

import android.util.Log;

import com.leet.leet_sample.utils.database.FirebaseDatabaseManager;
import com.leet.leet_sample.utils.database.entities.menu.MenuEntity;

import java.util.ArrayList;

/**
 * Created by YasuhiraChiba on 2017/10/31.
 */

public class MenuSearchModel {

    public void getMenu(final FirebaseDatabaseManager.FirebaseDBArrayCallback callback) {
        FirebaseDatabaseManager.getMenuData(new FirebaseDatabaseManager.FirebaseDBArrayCallback() {
            @Override
            public void getData(ArrayList data) {
                for(Object tes : data) {
                    MenuEntity tmp = (MenuEntity)tes;
                    Log.d("loadddd", "name: " + tmp.getName());
                    Log.d("loadddd", tmp.getPrice());
                }
                if(callback != null) {
                    callback.getData(data);
                }
            }
        });
    }
}
