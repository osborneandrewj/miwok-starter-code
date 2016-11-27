package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by Zark on 11/22/2016.
 */

public class FragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {

    /** The number of fragments in the app **/
    private final int FRAGMENT_COUNT = 4;


    public FragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * @param position of the view pager
     * @return the {@link Fragment} that should be displayed for the given page number
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new FamilyFragment();
        } else if (position == 2) {
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    /**
     * @return the total number of pages
     */
    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Numbers";
        } else if (position == 1) {
            return "Family";
        } else if (position == 2) {
            return "Colors";
        } else {
            return "Phrases";
        }
    }
}
