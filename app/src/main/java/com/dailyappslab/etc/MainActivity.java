package com.dailyappslab.etc;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.startad.lib.SADView;
//import com.tapfortap.TapForTap;
//import com.chartboost.sdk.*;


public class MainActivity extends Activity {

    int differColor;
    int mainColor;
    SADView sadView;
    TextView tvClassic;
    TextView tvTimed;
    TextView tvHighscores;
    TextView tvAbout;
    TextView tv1, tv2, tv3, tv4, tv5, tv6;
    Preferences preferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.menu);
        ShowAd();
        //ShowTap4Tap();
        SetTypefaces();

        preferences = new Preferences(this);

        //        ImageView vw = (ImageView) findViewById(R.id.imageView);
//        vw.setBackgroundColor(14717843);
//        ImageView vw1 = (ImageView) findViewById(R.id.imageView1);
//       // ColorsHandler.ReduceColorOpacity(vw1.get)
//        vw1.setBackgroundColor(ColorsHandler.ReduceColorOpacity(((ColorDrawable) vw.getBackground()).getColor(), 20));
//       // ColorsHandler.ReduceColorOpacity(((ColorDrawable) vw.getBackground()).getColor())
//        //vw1.setBackgroundColor(((ColorDrawable)vw.getBackground()).getColor() + 50);
    }

    public void SetTypefaces()
    {
        tvClassic = (TextView) findViewById(R.id.tvClassic);
        tvTimed = (TextView) findViewById(R.id.tvTimed);
        tvHighscores = (TextView) findViewById(R.id.tvHighscores);
        tvAbout = (TextView) findViewById(R.id.tvAbout);

        tvClassic.setTypeface(Globals.DefaultTypeface);
        tvTimed.setTypeface(Globals.DefaultTypeface);
        tvHighscores.setTypeface(Globals.DefaultTypeface);
        tvAbout.setTypeface(Globals.DefaultTypeface);
    }
    public void PressAboutUsButton(View v)
    {
        Intent i = new Intent (MainActivity.this, AboutUsActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, AboutUsActivity.class);
                startActivityForResult(i, 1);
                overridePendingTransition(R.anim.layout_on, R.anim.layout_off);
                //finish();
            }
        }, 0);
    }

    public void PressHighscoresButton(View v)
    {
        Intent i = new Intent (MainActivity.this, HighscoresActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, HighscoresActivity.class);
                startActivityForResult(i, 1);
                overridePendingTransition(R.anim.layout_on, R.anim.layout_off);
                //finish();
            }
        }, 0);
    }

    public void PressPlayTimedButton(View v)
    {
//        if(preferences.AskForTutorial())
//    {
//        StartTutorialActivity();
//    }
        Intent i = new Intent (MainActivity.this, GameActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Globals.mode = Mode.TIMED;
                Intent i = new Intent(MainActivity.this, GameActivity.class);
                startActivityForResult(i, 1);
                overridePendingTransition(R.anim.layout_on, R.anim.layout_off);
                //finish();
            }
        }, 0);
    }

    public void PressPlayClassicButton(View v)
    {
        Intent i = new Intent (MainActivity.this, GameActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Globals.mode = Mode.CLASSIC;
                Intent i = new Intent(MainActivity.this, GameActivity.class);
                startActivityForResult(i, 1);
                overridePendingTransition(R.anim.layout_on, R.anim.layout_off);
                //finish();
            }
        }, 0);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void ShowTap4Tap()
    {
//        TapForTap.enableTapForTap();
//        TapForTap.initialize(this, "c0b616d201e1d00d940daebb3f831374");
    }

    public void ShowAd()
    {
        try
        {
            sadView = new SADView(this, getResources().getString(R.string.sadViewMiniBanner));
            RelativeLayout layout = (RelativeLayout)findViewById(R.id.admob);

            // Add the adView to it
            layout.addView(this.sadView);
            sadView.loadAd(SADView.LANGUAGE_RU);
        }
        catch (Exception ex) {
        }
    }

    private void StartTutorialActivity()
    {

        Intent i = new Intent(MainActivity.this, TutorialActivity.class);
        startActivity(i);

    }
}
