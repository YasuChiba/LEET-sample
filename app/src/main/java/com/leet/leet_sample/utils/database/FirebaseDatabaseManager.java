package com.leet.leet_sample.utils.database;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.leet.leet_sample.utils.authentication.FirebaseAuthManager;
import com.leet.leet_sample.utils.database.entities.menu.MenuEntity;
import com.leet.leet_sample.utils.database.entities.user.UserProfileEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by YasuhiraChiba on 2017/10/31.
 */

public class FirebaseDatabaseManager {

    private static DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();

    //T is generic.  google it :)
    public interface FirebaseDBArrayCallback<T> {
        public void getData(ArrayList<T> data);
    }

    public interface FirebaseDBObjectCallback<T> {
        public void getData(T data);
    }

    public static void getMenuData(final FirebaseDBArrayCallback callback) {

        mDatabase.child("menu")
                .child("64 Degrees (Revelle College)")
                .child("11012017")
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
                callback.getData(result);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                callback.getData(new ArrayList<MenuEntity>());
            }
        });
    }

    public static void getUserProfile(final FirebaseDBObjectCallback callback) {
        mDatabase.child("userdata")
                .child(FirebaseAuthManager.getUserId())
                .child("userProfile")
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        UserProfileEntity ent = dataSnapshot.getValue(UserProfileEntity.class);
                        callback.getData(ent);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });


    }


    public static void setData(String text) {
        //push() generate unique id.
        mDatabase.child("userdata")
                .child(FirebaseAuthManager.getUserId())
                .child("datas").push().setValue(text);
    }

    public static void setUserProfile(UserProfileEntity userProfile) {
        Map<String, Object> data = new HashMap<>();
        data.put("userProfile",userProfile);
        mDatabase.child("userdata")
                .child(FirebaseAuthManager.getUserId())
                .updateChildren(data);
    }
}
