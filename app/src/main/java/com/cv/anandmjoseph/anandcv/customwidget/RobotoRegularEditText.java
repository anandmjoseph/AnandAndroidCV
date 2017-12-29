/**
 * Copyright (C) 2015-2016 Neva ventures .
 */
package com.cv.anandmjoseph.anandcv.customwidget;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatEditText;
import android.text.InputType;
import android.util.AttributeSet;
/**
 * Custom EditText with Roboto Bold font Created by neva coders on 15/11/2016.
 */
public class RobotoRegularEditText extends AppCompatEditText {

	public RobotoRegularEditText(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}

	public RobotoRegularEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public RobotoRegularEditText(Context context) {
		super(context);
		init();
	}

	private void init() {
		Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Regular.ttf");
		setTypeface(tf);
	}

	@Override
	public void setInputType(int type) {
		super.setInputType(InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
	}

}
