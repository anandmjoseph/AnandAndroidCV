package com.cv.anandmjoseph.anandcv.ui


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.cv.anandmjoseph.anandcv.R

/**
 * Created by Anand M Joseph on 12/29/2017.
 */

class AboutmeOne : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.about_me_one, container, false)
    }
}
