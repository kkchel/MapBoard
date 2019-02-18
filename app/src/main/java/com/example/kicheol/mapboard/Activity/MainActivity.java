package com.example.kicheol.mapboard.Activity;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kicheol.mapboard.R;

public class MainActivity extends AppCompatActivity {
    private Context mContext;

    private TabLayout mTabLayout;

    private ViewPager mViewPager;
    private PagerAdapter mPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = getApplicationContext();

        mTabLayout = (TabLayout) findViewById(R.id.layout_tab);
        mTabLayout.addTab(mTabLayout.newTab().setText("asdf"));
        mTabLayout.addTab(mTabLayout.newTab().setText("asdf1"));
        mTabLayout.addTab(mTabLayout.newTab().setText("asdf11"));

        mViewPager = (ViewPager)findViewById(R.id.pager_content);
        mPagerAdapter = new PagerAdapter(getSupportFragmentManager(), mTabLayout.getTabCount());
        mViewPager.setAdapter(mPagerAdapter);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                mViewPager.setCurrentItem(tab.getPosition());

            }


            @Override

            public void onTabUnselected(TabLayout.Tab tab) {


            }


            @Override

            public void onTabReselected(TabLayout.Tab tab) {


            }

        });

    }


}
