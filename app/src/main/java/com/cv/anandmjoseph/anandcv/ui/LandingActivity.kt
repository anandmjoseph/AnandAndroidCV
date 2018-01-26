package com.cv.anandmjoseph.anandcv.ui

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v4.view.ViewPager
import android.view.View
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.RelativeLayout

import com.cv.anandmjoseph.anandcv.R
import com.cv.anandmjoseph.anandcv.adapter.ViewPagerAdapter
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class LandingActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private var mViewPagerAdapter: ViewPagerAdapter? = null
    private var mPagerDotOne: RelativeLayout? = null
    private var mPagerDotTwo: RelativeLayout? = null
    private var mPagerDotThree: RelativeLayout? = null
    private var mPagerDotfour: RelativeLayout? = null
    private var one: AboutmeOne? = null
    private var two: Aboutmetwo? = null
    private var three: Aboutmethree? = null
    private var four: Aboutmefour? = null
    private var mPager: ViewPager? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)
        init()
        initaction()
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
        navigationView.setNavigationItemSelectedListener(this@LandingActivity)

    }

    private fun initaction() {
        mPager = findViewById<View>(R.id.view_pager) as ViewPager
        mPagerDotOne = findViewById<View>(R.id.pagerDotOne) as RelativeLayout
        mPagerDotTwo = findViewById<View>(R.id.pagerDotTwo) as RelativeLayout
        mPagerDotThree = findViewById<View>(R.id.pagerDotThree) as RelativeLayout
        mPagerDotfour = findViewById<View>(R.id.pagerDotfour) as RelativeLayout


        mViewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        one = AboutmeOne()
        two = Aboutmetwo()
        three = Aboutmethree()
        four = Aboutmefour()

        mViewPagerAdapter!!.addFragment(one!!, getString(R.string.pageone_fragment_text))
        mViewPagerAdapter!!.addFragment(two!!, getString(R.string.pagetwo_fragment_text))
        mViewPagerAdapter!!.addFragment(three!!, getString(R.string.pagethree_fragment_text))
        mViewPagerAdapter!!.addFragment(four!!, getString(R.string.pagefour_fragment_text))

        mPager!!.adapter = mViewPagerAdapter
        mPager!!.currentItem = 0

        mPager!!.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                setPagerDotBg(position)
            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })
    }

    private fun setPagerDotBg(position: Int) {
        when (position) {
            0 -> showpageActive()
            1 -> showtwoActive()
            2 -> showthreeActive()
            else -> showfourActive()
        }
    }

    private fun showpageActive() {
        val sdk = android.os.Build.VERSION.SDK_INT
        if (sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            mPagerDotOne!!.setBackgroundDrawable(resources.getDrawable(R.drawable.walkthrough_active_bg))
            mPagerDotTwo!!.setBackgroundDrawable(resources.getDrawable(R.drawable.walkthrough_inactive_bg))
            mPagerDotThree!!.setBackgroundDrawable(resources.getDrawable(R.drawable.walkthrough_inactive_bg))
            mPagerDotfour!!.setBackgroundDrawable(resources.getDrawable(R.drawable.walkthrough_inactive_bg))
        } else {
            mPagerDotOne!!.background = resources.getDrawable(R.drawable.walkthrough_active_bg)
            mPagerDotTwo!!.background = resources.getDrawable(R.drawable.walkthrough_inactive_bg)
            mPagerDotThree!!.background = resources.getDrawable(R.drawable.walkthrough_inactive_bg)
            mPagerDotfour!!.setBackgroundDrawable(resources.getDrawable(R.drawable.walkthrough_inactive_bg))
        }
    }

    private fun showtwoActive() {
        val sdk = android.os.Build.VERSION.SDK_INT
        if (sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            mPagerDotOne!!.setBackgroundDrawable(resources.getDrawable(R.drawable.walkthrough_inactive_bg))
            mPagerDotTwo!!.setBackgroundDrawable(resources.getDrawable(R.drawable.walkthrough_active_bg))
            mPagerDotThree!!.setBackgroundDrawable(resources.getDrawable(R.drawable.walkthrough_inactive_bg))
            mPagerDotfour!!.setBackgroundDrawable(resources.getDrawable(R.drawable.walkthrough_inactive_bg))
        } else {
            mPagerDotOne!!.background = resources.getDrawable(R.drawable.walkthrough_inactive_bg)
            mPagerDotTwo!!.background = resources.getDrawable(R.drawable.walkthrough_active_bg)
            mPagerDotThree!!.background = resources.getDrawable(R.drawable.walkthrough_inactive_bg)
            mPagerDotfour!!.setBackgroundDrawable(resources.getDrawable(R.drawable.walkthrough_inactive_bg))
        }
    }

    private fun showfourActive() {
        val sdk = android.os.Build.VERSION.SDK_INT
        if (sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            mPagerDotOne!!.setBackgroundDrawable(resources.getDrawable(R.drawable.walkthrough_inactive_bg))
            mPagerDotTwo!!.setBackgroundDrawable(resources.getDrawable(R.drawable.walkthrough_inactive_bg))
            mPagerDotThree!!.setBackgroundDrawable(resources.getDrawable(R.drawable.walkthrough_inactive_bg))
            mPagerDotfour!!.setBackgroundDrawable(resources.getDrawable(R.drawable.walkthrough_active_bg))
        } else {
            mPagerDotOne!!.background = resources.getDrawable(R.drawable.walkthrough_inactive_bg)
            mPagerDotTwo!!.background = resources.getDrawable(R.drawable.walkthrough_inactive_bg)
            mPagerDotThree!!.background = resources.getDrawable(R.drawable.walkthrough_inactive_bg)
            mPagerDotfour!!.setBackgroundDrawable(resources.getDrawable(R.drawable.walkthrough_active_bg))
        }
    }

    private fun showthreeActive() {
        val sdk = android.os.Build.VERSION.SDK_INT
        if (sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            mPagerDotOne!!.setBackgroundDrawable(resources.getDrawable(R.drawable.walkthrough_inactive_bg))
            mPagerDotTwo!!.setBackgroundDrawable(resources.getDrawable(R.drawable.walkthrough_inactive_bg))
            mPagerDotThree!!.setBackgroundDrawable(resources.getDrawable(R.drawable.walkthrough_active_bg))
            mPagerDotfour!!.setBackgroundDrawable(resources.getDrawable(R.drawable.walkthrough_inactive_bg))
        } else {
            mPagerDotOne!!.background = resources.getDrawable(R.drawable.walkthrough_inactive_bg)
            mPagerDotTwo!!.background = resources.getDrawable(R.drawable.walkthrough_inactive_bg)
            mPagerDotThree!!.background = resources.getDrawable(R.drawable.walkthrough_active_bg)
            mPagerDotfour!!.setBackgroundDrawable(resources.getDrawable(R.drawable.walkthrough_inactive_bg))
        }
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
        val id = item.itemId

        if (id == R.id.nav_camera) {
            // Handle the camera

        } else if (id == R.id.nav_gallery) {
            val i = Intent(this@LandingActivity, ProfessionalExperienceActivity::class.java)
            startActivity(i)
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            finish()
        } else if (id == R.id.nav_slideshow) {
            val i = Intent(this@LandingActivity, CareerInterests::class.java)
            startActivity(i)
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            finish()
        } else if (id == R.id.nav_manage) {
            val i = Intent(this@LandingActivity, ProjectsActivity::class.java)
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
