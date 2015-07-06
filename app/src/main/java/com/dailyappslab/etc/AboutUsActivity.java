package com.dailyappslab.etc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by GreenQ on 28.06.2015.
 */
public class AboutUsActivity extends Activity {
    TextView tvHeader;
    TextView tvAbout;
    TextView tvBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.about);
        SetFonts();
    }

    public void SetFonts()
    {
        tvHeader = (TextView) findViewById(R.id.tvHeader);
        tvAbout = (TextView) findViewById(R.id.tvAbout);
        tvBack = (TextView) findViewById(R.id.tvBack);

        tvHeader.setTypeface(Globals.DefaultTypeface);
        tvAbout.setTypeface(Globals.DefaultTypeface);
        tvBack.setTypeface(Globals.DefaultTypeface);
    }

    public void PressBack(View view)
    {
        finish();
    }
}
