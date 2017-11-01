package com.leet.leet_sample.screens.menuSearch.model;

import android.util.Log;

import com.leet.leet_sample.utils.database.FirebaseDatabaseManager;
import com.leet.leet_sample.utils.database.entities.menu.MenuEntity;

import java.util.ArrayList;

/**
 * Created by YasuhiraChiba on 2017/10/31.
 */

public class MenuSearchModel {

    public void getMenu(final FirebaseDatabaseManager.FirebaseDBGetMenuCallback callback) {
        FirebaseDatabaseManager.getMenuData(new FirebaseDatabaseManager.FirebaseDBGetMenuCallback() {
            @Override
            public void getMenuData(ArrayList<MenuEntity> data) {
                for(MenuEntity tes : data) {
                    Log.d("loadddd", "name: " + tes.getName());
                    Log.d("loadddd", tes.getPrice());
                }
                if(callback != null) {
                    callback.getMenuData(data);
                }
            }
        });
    }
}
