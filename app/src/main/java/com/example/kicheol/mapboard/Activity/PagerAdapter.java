package com.example.kicheol.mapboard.Activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.kicheol.mapboard.Fragment.First_tab;
import com.example.kicheol.mapboard.Fragment.Second_tab;
import com.example.kicheol.mapboard.Fragment.Third_tab;

public class PagerAdapter extends FragmentStatePagerAdapter {
    private int mPageCount;

    public PagerAdapter(FragmentManager fm, int pageCount) {
        super(fm);
        this.mPageCount = pageCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0 :
                First_tab first_tab = new First_tab();
                return first_tab;
            case 1 :
                Second_tab second_tab = new Second_tab();
                return second_tab;
            case 2 :
                Third_tab third_tab = new Third_tab();
                return third_tab;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mPageCount;
    }
}
