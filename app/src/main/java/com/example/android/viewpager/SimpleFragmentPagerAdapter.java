package com.example.android.viewpager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Provides the appropriate { Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private final FragmentManager fm;
    private String tabTitles[] = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        this.fm = fm;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MondayFragment();
        } else if (position == 1) {
            return new TuesdayFragment();
        } else if (position == 2) {
            return new WednesdayFragment();
        } else if (position == 3) {
            return new ThursdayFragment();
        } else {
            return new FridayFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

}