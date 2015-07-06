package com.dailyappslab.etc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by GreenQ on 06.07.2015.
 */
public class TutorialActivity extends Activity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);

        // getWindow().setFlags(ActionBar.LayoutParams.FLAG_NOT_TOUCH_);
        setContentView(R.layout.learn);

        final Preferences preferences = new Preferences(getApplicationContext());

        boolean s = preferences.AskForRate();
        RelativeLayout btnDismiss = (RelativeLayout) findViewById(R.id.close);
        btnDismiss.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });

        RelativeLayout btnCloseForever = (RelativeLayout) findViewById(R.id.never);
        btnCloseForever.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                preferences.EditAskForTutorial();
            }
        });
    }


}
