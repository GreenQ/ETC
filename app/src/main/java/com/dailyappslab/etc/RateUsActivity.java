package com.dailyappslab.etc;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by GreenQ on 05.07.2015.
 */
public class RateUsActivity extends Activity {
    RelativeLayout rlRateUsRoot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rate_us);

        RelativeLayout rateUs = (RelativeLayout) findViewById(R.id.btnRate);
        rateUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("market://details?id=" + getPackageName());
                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                try {
                    startActivity(goToMarket);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
                }
            }
        });

        RelativeLayout later = (RelativeLayout) findViewById(R.id.btnLater);
        later.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        RelativeLayout forget = (RelativeLayout) findViewById(R.id.btnForget);
        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Preferences storedPreferences = new Preferences(getBaseContext());
                storedPreferences.EditAskForRate();
                finish();
            }
        });

        rlRateUsRoot = (RelativeLayout)findViewById(R.id.rlRateUsRoot);
        AndroidTypefaceUtility.SetTypefaceOfViewGroup(rlRateUsRoot, Globals.DefaultTypeface);

    }
}