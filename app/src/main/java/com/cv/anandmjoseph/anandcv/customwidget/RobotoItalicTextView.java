/**
 * Copyright (C) 2015-2016 Neva ventures .
 */
package com.cv.anandmjoseph.anandcv.customwidget;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Custom TextView with Roboto Italic font Created by neva coders on 15/11/2016.
 */
public class RobotoItalicTextView extends AppCompatTextView {

	public RobotoItalicTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}

	public RobotoItalicTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public RobotoItalicTextView(Context context) {
		super(context);
		init();
	}

	private void init() {
		Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Italic.ttf");
		setTypeface(tf);
	}

}
