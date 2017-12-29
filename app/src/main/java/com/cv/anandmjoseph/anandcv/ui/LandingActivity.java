package com.cv.anandmjoseph.anandcv.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.cv.anandmjoseph.anandcv.R;
import com.cv.anandmjoseph.anandcv.adapter.ViewPagerAdapter;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public class LandingActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private ViewPagerAdapter mViewPagerAdapter;
    private RelativeLayout mPagerDotOne,mPagerDotTwo,mPagerDotThree,mPagerDotfour;
    private AboutmeOne one;
    private Aboutmetwo two;
    private Aboutmethree three;
    private Aboutmefour four;
    private ViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        mPager=(ViewPager)findViewById(R.id.view_pager);
        mPagerDotOne=(RelativeLayout)findViewById(R.id.pagerDotOne);
        mPagerDotTwo=(RelativeLayout)findViewById(R.id.pagerDotTwo);
        mPagerDotThree=(RelativeLayout)findViewById(R.id.pagerDotThree);
        mPagerDotfour=(RelativeLayout)findViewById(R.id.pagerDotfour);

        init();
    }

    private void init(){

        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        one = new AboutmeOne();
         two = new Aboutmetwo();
         three = new Aboutmethree();
         four = new Aboutmefour();

        mViewPagerAdapter.addFragment(one,getString(R.string.pageone_fragment_text));
        mViewPagerAdapter.addFragment(two,getString(R.string.pagetwo_fragment_text));
        mViewPagerAdapter.addFragment(three,getString(R.string.pagethree_fragment_text));
        mViewPagerAdapter.addFragment(four,getString(R.string.pagefour_fragment_text));

        mPager.setAdapter(mViewPagerAdapter);
        mPager.setCurrentItem(0);

        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                setPagerDotBg(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void setPagerDotBg(int position) {
        switch (position){
            case 0:
                showpageActive();
                break;
            case 1:
                showtwoActive();
                break;
            case 2:
                showthreeActive();
                break;
            default:
                showfourActive();
                break;
        }
    }

    private void showpageActive() {
        final int sdk = android.os.Build.VERSION.SDK_INT;
        if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            mPagerDotOne.setBackgroundDrawable( getResources().getDrawable(R.drawable.walkthrough_active_bg) );
            mPagerDotTwo.setBackgroundDrawable( getResources().getDrawable(R.drawable.walkthrough_inactive_bg) );
            mPagerDotThree.setBackgroundDrawable( getResources().getDrawable(R.drawable.walkthrough_inactive_bg) );
            mPagerDotfour.setBackgroundDrawable( getResources().getDrawable(R.drawable.walkthrough_inactive_bg) );
        } else {
            mPagerDotOne.setBackground( getResources().getDrawable(R.drawable.walkthrough_active_bg));
            mPagerDotTwo.setBackground( getResources().getDrawable(R.drawable.walkthrough_inactive_bg));
            mPagerDotThree.setBackground( getResources().getDrawable(R.drawable.walkthrough_inactive_bg));
            mPagerDotfour.setBackgroundDrawable( getResources().getDrawable(R.drawable.walkthrough_inactive_bg) );
        }
    }

    private void showtwoActive() {
        final int sdk = android.os.Build.VERSION.SDK_INT;
        if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            mPagerDotOne.setBackgroundDrawable( getResources().getDrawable(R.drawable.walkthrough_inactive_bg) );
            mPagerDotTwo.setBackgroundDrawable( getResources().getDrawable(R.drawable.walkthrough_active_bg) );
            mPagerDotThree.setBackgroundDrawable( getResources().getDrawable(R.drawable.walkthrough_inactive_bg) );
            mPagerDotfour.setBackgroundDrawable( getResources().getDrawable(R.drawable.walkthrough_inactive_bg) );
        } else {
            mPagerDotOne.setBackground( getResources().getDrawable(R.drawable.walkthrough_inactive_bg));
            mPagerDotTwo.setBackground( getResources().getDrawable(R.drawable.walkthrough_active_bg));
            mPagerDotThree.setBackground( getResources().getDrawable(R.drawable.walkthrough_inactive_bg));
            mPagerDotfour.setBackgroundDrawable( getResources().getDrawable(R.drawable.walkthrough_inactive_bg) );
        }
    }

    private void showfourActive() {
        final int sdk = android.os.Build.VERSION.SDK_INT;
        if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            mPagerDotOne.setBackgroundDrawable( getResources().getDrawable(R.drawable.walkthrough_inactive_bg) );
            mPagerDotTwo.setBackgroundDrawable( getResources().getDrawable(R.drawable.walkthrough_inactive_bg) );
            mPagerDotThree.setBackgroundDrawable( getResources().getDrawable(R.drawable.walkthrough_inactive_bg) );
            mPagerDotfour.setBackgroundDrawable( getResources().getDrawable(R.drawable.walkthrough_active_bg) );
        } else {
            mPagerDotOne.setBackground( getResources().getDrawable(R.drawable.walkthrough_inactive_bg));
            mPagerDotTwo.setBackground( getResources().getDrawable(R.drawable.walkthrough_inactive_bg));
            mPagerDotThree.setBackground( getResources().getDrawable(R.drawable.walkthrough_inactive_bg));
            mPagerDotfour.setBackgroundDrawable( getResources().getDrawable(R.drawable.walkthrough_active_bg) );
        }
    }

    private void showthreeActive() {
        final int sdk = android.os.Build.VERSION.SDK_INT;
        if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            mPagerDotOne.setBackgroundDrawable( getResources().getDrawable(R.drawable.walkthrough_inactive_bg) );
            mPagerDotTwo.setBackgroundDrawable( getResources().getDrawable(R.drawable.walkthrough_inactive_bg) );
            mPagerDotThree.setBackgroundDrawable( getResources().getDrawable(R.drawable.walkthrough_active_bg) );
            mPagerDotfour.setBackgroundDrawable( getResources().getDrawable(R.drawable.walkthrough_inactive_bg) );
        } else {
            mPagerDotOne.setBackground( getResources().getDrawable(R.drawable.walkthrough_inactive_bg));
            mPagerDotTwo.setBackground( getResources().getDrawable(R.drawable.walkthrough_inactive_bg));
            mPagerDotThree.setBackground( getResources().getDrawable(R.drawable.walkthrough_active_bg));
            mPagerDotfour.setBackgroundDrawable( getResources().getDrawable(R.drawable.walkthrough_inactive_bg) );
        }
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.landing, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
