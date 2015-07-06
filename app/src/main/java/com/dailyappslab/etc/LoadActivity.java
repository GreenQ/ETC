package com.dailyappslab.etc;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.RelativeLayout;

/**
 * Created by GreenQ on 27.06.2015.
 */
public class LoadActivity extends Activity {

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
        setContentView(R.layout.load);

        Globals.TimesShown = 0;
        Globals.DefaultTypeface = Typeface.createFromAsset(getAssets(), "fonts/aFuturicaBook.ttf");

        RelativeLayout rootLayout = (RelativeLayout)findViewById(R.id.rlLoadRoot);
        AndroidTypefaceUtility.SetTypefaceOfViewGroup(rootLayout, Globals.DefaultTypeface);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(LoadActivity.this, MainActivity.class);
                startActivity(i);

          //      overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
