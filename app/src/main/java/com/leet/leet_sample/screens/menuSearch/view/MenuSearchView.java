package com.leet.leet_sample.screens.menuSearch.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.leet.leet_sample.R;
import com.leet.leet_sample.screens.menuSearch.MenuSearchListViewAdapter;
import com.leet.leet_sample.utils.database.entities.menu.MenuEntity;

import java.util.ArrayList;

/**
 * Created by YasuhiraChiba on 2017/10/31.
 */

public class MenuSearchView implements MenuSearchViewInterface {

    private View mRootView;

    private ListView listView;

    public MenuSearchView(LayoutInflater inflater, ViewGroup container) {
        mRootView = inflater.inflate(R.layout.view_menu_search, container, false);

        initialize();
    }

    private void initialize() {
        listView = (ListView)mRootView.findViewById(R.id.menu_search_list_view);
    }

    public void setupListView(Context context, ArrayList<MenuEntity> data) {
        MenuSearchListViewAdapter adapter = new MenuSearchListViewAdapter(context);
        adapter.setData(data);
        adapter.notifyDataSetChanged();
        listView.setAdapter(adapter);
    }

    @Override
    public View getRootView() {
        return mRootView;
    }
}
