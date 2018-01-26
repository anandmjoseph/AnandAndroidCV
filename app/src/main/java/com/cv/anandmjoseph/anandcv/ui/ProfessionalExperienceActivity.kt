package com.cv.anandmjoseph.anandcv.ui

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.NavigationView
import android.support.design.widget.Snackbar
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View

import com.cv.anandmjoseph.anandcv.R
import com.cv.anandmjoseph.anandcv.adapter.ExperienceAdapter
import com.cv.anandmjoseph.anandcv.data.ExperienceData

import java.util.ArrayList

/**
 * Created by Anand M Joseph on 1/3/2018.
 */

class ProfessionalExperienceActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private var mExperienceData: MutableList<ExperienceData> = ArrayList()
    private var mAdapter: ExperienceAdapter? = null

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_experince)
        updatedata()
        init()

    }

    private fun init() {
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        val fab = findViewById<View>(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        val toggle = ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer.addDrawerListener(toggle)
        toggle.syncState()
        val navigationView = findViewById<View>(R.id.nav_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(this@ProfessionalExperienceActivity)

        val rv = findViewById<View>(R.id.recycler_view) as RecyclerView
        rv.setHasFixedSize(true)
        mAdapter = ExperienceAdapter(mExperienceData)
        val mLayoutManager = LinearLayoutManager(applicationContext)
        rv.layoutManager = mLayoutManager
        rv.itemAnimator = DefaultItemAnimator()
        rv.adapter = mAdapter


    }

    private fun updatedata() {

        mExperienceData = ArrayList()
        mExperienceData.add(ExperienceData(R.string.com_name_neva, R.string.nv_role, R.string.nv_des, R.string.nv_per, R.drawable.nevaic))
        mExperienceData.add(ExperienceData(R.string.com_name_ec, R.string.ec_role, R.string.ec_des, R.string.ec_per, R.drawable.ecic))
        mExperienceData.add(ExperienceData(R.string.com_name_ns, R.string.ns_role, R.string.ns_des, R.string.ns_per, R.drawable.nsic))
        mExperienceData.add(ExperienceData(R.string.com_name_so, R.string.so_role, R.string.so_des, R.string.so_per, R.drawable.soic))
        mExperienceData.add(ExperienceData(R.string.com_name_Lnt, R.string.ln_role, R.string.ln_des, R.string.ln_per, R.drawable.lnic))
        mExperienceData.add(ExperienceData(R.string.com_name_so, R.string.so_role_on, R.string.so_des_on, R.string.so_per_on, R.drawable.soic))
        mExperienceData.add(ExperienceData(R.string.com_name_ay, R.string.ay_role, R.string.ay_des, R.string.ay_per, R.drawable.ayic))
    }

    override fun onBackPressed() {
        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.landing, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.

        val i: Intent
        val id = item.itemId

        if (id == R.id.nav_camera) {

            i = Intent(this@ProfessionalExperienceActivity, LandingActivity::class.java)
            startActivity(i)
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            finish()
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {
            i = Intent(this@ProfessionalExperienceActivity, CareerInterests::class.java)
            startActivity(i)
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            finish()
        } else if (id == R.id.nav_manage) {
            i = Intent(this@ProfessionalExperienceActivity, ProjectsActivity::class.java)
            startActivity(i)
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            finish()
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return true
    }
}
