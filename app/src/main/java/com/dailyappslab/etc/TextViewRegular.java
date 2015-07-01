package com.dailyappslab.etc;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by TOPAC on 01.07.2015.
 */
public class TextViewRegular extends TextView {

    public TextViewRegular(Context context) {
        this(context, null, 0);
    }

    public TextViewRegular(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }


    public TextViewRegular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setFont(context);
    }

    private void setFont(Context context) {
        Typeface face = Typefaces.get(context, context.getText(R.string.font2).toString());
        setTypeface(face);
    }
}