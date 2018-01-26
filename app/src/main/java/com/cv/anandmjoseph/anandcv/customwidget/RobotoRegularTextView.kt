/**
 * Copyright (C) 2015-2016 Neva ventures .
 */
package com.cv.anandmjoseph.anandcv.customwidget

import android.content.Context
import android.graphics.Typeface
import android.support.v7.widget.AppCompatTextView
import android.util.AttributeSet
import android.widget.TextView

/**
 * Custom TextView with Roboto Regular font Created by neva coders on 15/11/2016.
 */
class RobotoRegularTextView : AppCompatTextView {

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context) : super(context) {
        init()
    }

    private fun init() {
        val tf = Typeface.createFromAsset(context.assets, "fonts/Roboto-Regular.ttf")
        typeface = tf
    }

}
