/**
 * Copyright (C) 2015-2016 Neva ventures .
 */
package com.cv.anandmjoseph.anandcv.customwidget;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Custom EditText with Roboto Bold font Created by neva coders Created on 15/11/2016.
 */
public class RobotoBoldEditText extends AppCompatEditText {

	public RobotoBoldEditText(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}

	public RobotoBoldEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public RobotoBoldEditText(Context context) {
		super(context);
		init();
	}

	private void init() {
		Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Bold.ttf");
		setTypeface(tf);
	}
}
