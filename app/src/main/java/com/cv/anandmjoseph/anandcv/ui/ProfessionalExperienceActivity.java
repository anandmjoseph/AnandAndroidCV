package com.cv.anandmjoseph.anandcv.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.cv.anandmjoseph.anandcv.R;
import com.cv.anandmjoseph.anandcv.adapter.ExperienceAdapter;
import com.cv.anandmjoseph.anandcv.data.ExperienceData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anand M Joseph on 1/3/2018.
 */

public class ProfessionalExperienceActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private List<ExperienceData> mExperienceData = new ArrayList<>();
    private ExperienceAdapter mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experince);
        updatedata();
        init();

    }

    private void init(){
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
        navigationView.setNavigationItemSelectedListener(ProfessionalExperienceActivity.this);

        RecyclerView rv = (RecyclerView)findViewById(R.id.recycler_view);
        rv.setHasFixedSize(true);
        mAdapter=new ExperienceAdapter(mExperienceData);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(mLayoutManager);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(mAdapter);


    }

    private void updatedata(){

        mExperienceData = new ArrayList<>();
        mExperienceData.add(new ExperienceData(R.string.com_name_neva,R.string.nv_role,R.string.nv_des,R.string.nv_per, R.drawable.nevaic));
        mExperienceData.add(new ExperienceData(R.string.com_name_ec,R.string.ec_role,R.string.ec_des,R.string.ec_per, R.drawable.ecic));
        mExperienceData.add(new ExperienceData(R.string.com_name_ns,R.string.ns_role,R.string.ns_des,R.string.ns_per, R.drawable.nsic));
        mExperienceData.add(new ExperienceData(R.string.com_name_so,R.string.so_role,R.string.so_des,R.string.so_per, R.drawable.soic));
        mExperienceData.add(new ExperienceData(R.string.com_name_Lnt,R.string.ln_role,R.string.ln_des,R.string.ln_per, R.drawable.lnic));
        mExperienceData.add(new ExperienceData(R.string.com_name_so,R.string.so_role_on,R.string.so_des_on,R.string.so_per_on, R.drawable.soic));
        mExperienceData.add(new ExperienceData(R.string.com_name_ay,R.string.ay_role,R.string.ay_des,R.string.ay_per, R.drawable.ayic));
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

        Intent i;
        int id = item.getItemId();

        if (id == R.id.nav_camera) {

            i= new Intent(ProfessionalExperienceActivity.this, LandingActivity.class);
            startActivity(i);
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            finish();
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {
            i = new Intent(ProfessionalExperienceActivity.this, CareerInterests.class);
            startActivity(i);
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            finish();
        } else if (id == R.id.nav_manage) {
             i = new Intent(ProfessionalExperienceActivity.this, ProjectsActivity.class);
            startActivity(i);
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            finish();
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
