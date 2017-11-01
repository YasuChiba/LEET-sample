package com.leet.leet_sample.screens.menuSearch;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.leet.leet_sample.screens.menuSearch.view.MenuSearchListViewRow;
import com.leet.leet_sample.screens.menuSearch.view.MenuSearchView;

/**
 * Created by YasuhiraChiba on 2017/10/31.
 */

public class MenuSearchListViewAdapter extends BaseAdapter {

    private Context context;
    private String[] texts;

    public MenuSearchListViewAdapter(Context context, String[] texts) {
        this.context = context;
        this.texts = texts;
    }

    @Override
    public int getCount() {
        return texts.length;
    }

    @Override
    public Object getItem(int i) {
        return texts[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null) {
            MenuSearchListViewRow row = new MenuSearchListViewRow(context);
            row.setText("INDEX  : "+i, texts[i]);
            return row;
        } else {
            ((MenuSearchListViewRow)view).setText("INDEX  : "+i, texts[i]);
            return view;
        }
    }
}
