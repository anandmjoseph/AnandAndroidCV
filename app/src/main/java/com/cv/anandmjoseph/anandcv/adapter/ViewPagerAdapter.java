package com.cv.anandmjoseph.anandcv.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.cv.anandmjoseph.anandcv.ui.AboutmeOne;
import com.cv.anandmjoseph.anandcv.ui.Aboutmetwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anand M Joseph on 12/29/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<android.support.v4.app.Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager manager) {
        super(manager);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }
}
