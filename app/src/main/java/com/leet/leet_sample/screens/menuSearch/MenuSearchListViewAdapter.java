package com.leet.leet_sample.screens.menuSearch;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.leet.leet_sample.screens.menuSearch.view.MenuSearchListViewRow;
import com.leet.leet_sample.utils.database.entities.menu.MenuEntity;

import java.util.ArrayList;

/**
 * Created by YasuhiraChiba on 2017/10/31.
 */

public class MenuSearchListViewAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<MenuEntity> data;

    public MenuSearchListViewAdapter(Context context) {
        this.context = context;
    }

    public void setData(ArrayList<MenuEntity> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null) {
            MenuSearchListViewRow row = new MenuSearchListViewRow(context);
            row.setData(data.get(i));
            return row;
        } else {
            ((MenuSearchListViewRow)view).setData(data.get(i));
            return view;
        }
    }
}
