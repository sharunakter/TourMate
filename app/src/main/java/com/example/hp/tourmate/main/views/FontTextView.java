package com.example.hp.tourmate.main.views;

/**
 * Created by HP on 1/31/2018.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import com.rey.material.widget.TextView;

import java.io.File;

/**
 * @author Yalantis
 */
public class FontTextView extends TextView {

    public FontTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        parseAttributes(context, attrs);
    }

    public FontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        parseAttributes(context, attrs);
    }

    public FontTextView(Context context) {
        super(context);
    }

    private void parseAttributes(Context context, AttributeSet attrs) {
        setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts" + File.separator + "Roboto-Light.ttf"));
    }
}
