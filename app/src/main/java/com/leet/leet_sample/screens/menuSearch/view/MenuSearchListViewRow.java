package com.leet.leet_sample.screens.menuSearch.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.leet.leet_sample.R;

/**
 * TODO: document your custom view class.
 */
public class MenuSearchListViewRow extends LinearLayout {

    private TextView name;
    private TextView name2;

    public MenuSearchListViewRow(Context context) {
        super(context);
        initialiseView(context);
    }

    public MenuSearchListViewRow(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialiseView(context);
    }

    public MenuSearchListViewRow(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initialiseView(context);
    }

    private void initialiseView(Context context) {
        View.inflate(context, R.layout.customview_menu_search_list_view_row, this);

        name = (TextView)this.findViewById(R.id.name);
        name2 = (TextView)this.findViewById(R.id.name2);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }


    public void setText(String text1, String text2) {
        name.setText(text1);
        name2.setText(text2);
    }
}
