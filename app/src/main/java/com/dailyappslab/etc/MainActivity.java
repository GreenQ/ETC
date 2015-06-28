package com.dailyappslab.etc;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.PaintDrawable;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;


public class MainActivity extends Activity {

    int differColor;
    int mainColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.menu);
//        ImageView vw = (ImageView) findViewById(R.id.imageView);
//        vw.setBackgroundColor(14717843);
//        ImageView vw1 = (ImageView) findViewById(R.id.imageView1);
//       // ColorsHandler.ReduceColorOpacity(vw1.get)
//        vw1.setBackgroundColor(ColorsHandler.ReduceColorOpacity(((ColorDrawable) vw.getBackground()).getColor(), 20));
//       // ColorsHandler.ReduceColorOpacity(((ColorDrawable) vw.getBackground()).getColor())
//        //vw1.setBackgroundColor(((ColorDrawable)vw.getBackground()).getColor() + 50);
    }

    public void PressPlayButton(View v)
    {
        Intent i = new Intent (MainActivity.this, GameActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, GameActivity.class);
                startActivityForResult(i, 1);
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
}
