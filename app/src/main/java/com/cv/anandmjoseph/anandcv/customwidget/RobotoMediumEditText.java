/**
 * Copyright (C) 2015-2016 Neva ventures .
 */
package com.cv.anandmjoseph.anandcv.customwidget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Custom EditText with Roboto Bold font Created by neva coders Created on 15/11/2016.
 */
public class RobotoMediumEditText extends EditText {

	public RobotoMediumEditText(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}

	public RobotoMediumEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public RobotoMediumEditText(Context context) {
		super(context);
		init();
	}

	private void init() {
		Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Medium.ttf");
		setTypeface(tf);
	}
}
