package com.leet.leet_sample.utils.database;

import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.leet.leet_sample.utils.database.entities.MenuEntity;

import java.util.ArrayList;

/**
 * Created by YasuhiraChiba on 2017/10/31.
 */

public class FirebaseDatabaseManager {

    private static DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();


    public interface FirebaseDBGetMenuDataInterface {
        public void getMenuData(ArrayList<MenuEntity> data);
    }
    public static void getMenuData(final FirebaseDBGetMenuDataInterface callback) {

        mDatabase.child("menu")
                .child("64 Degrees (Revelle College)")
                .child("Friday, November 03, 2017")
                .child("dinnerMenu")
                .addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                ArrayList<MenuEntity> result = new ArrayList<MenuEntity>();
                for(DataSnapshot snap :dataSnapshot.getChildren()){
                    MenuEntity ent = snap.getValue(MenuEntity.class);  //automatically parse json to object
                    ent.setName(snap.getKey());
                    result.add(ent);
                }
                callback.getMenuData(result);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
