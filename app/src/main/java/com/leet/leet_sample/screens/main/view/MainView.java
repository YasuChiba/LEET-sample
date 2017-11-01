package com.leet.leet_sample.screens.main.view;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;

import com.leet.leet_sample.R;
import com.leet.leet_sample.screens.main.MainViewViewPagerAdapter;

/**
 * Created by YasuhiraChiba on 2017/10/31.
 */

public class MainView implements MainViewInterface {

    private View mRootView;

    private TabLayout tabLayout;
    private ViewPager viewPager;

    public MainView(LayoutInflater inflater, ViewGroup container) {
        mRootView = inflater.inflate(R.layout.view_main, container, false);
        initialize();
    }

    private void initialize() {
        tabLayout = (TabLayout)mRootView.findViewById(R.id.tab_layout);
        viewPager = (ViewPager)mRootView.findViewById(R.id.view_pager);
    }

    public void setupTabs(Fragment[] fragments, String[] tabTitles, FragmentManager fm) {
        MainViewViewPagerAdapter viewPagerAdapter = new MainViewViewPagerAdapter(fm, fragments, tabTitles);
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public View getRootView() {
        return mRootView;
    }
}
