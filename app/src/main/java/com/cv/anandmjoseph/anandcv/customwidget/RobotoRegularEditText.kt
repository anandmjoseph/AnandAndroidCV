/**
 * Copyright (C) 2015-2016 Neva ventures .
 */
package com.cv.anandmjoseph.anandcv.customwidget

import android.content.Context
import android.graphics.Typeface
import android.support.v7.widget.AppCompatEditText
import android.text.InputType
import android.util.AttributeSet

/**
 * Custom EditText with Roboto Bold font Created by neva coders on 15/11/2016.
 */
class RobotoRegularEditText : AppCompatEditText {

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

    override fun setInputType(type: Int) {
        super.setInputType(InputType.TYPE_TEXT_FLAG_CAP_SENTENCES)
    }

}
