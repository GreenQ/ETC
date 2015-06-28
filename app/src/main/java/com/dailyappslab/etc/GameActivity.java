package com.dailyappslab.etc;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;


import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by GreenQ on 27.06.2015.
 */
public class GameActivity extends Activity {

    Animation anim;
    Animation anim2;
    Animation anim3;
    Animation anim4;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.game);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.game);

        anim = AnimationUtils.loadAnimation(this, R.anim.rote);
        anim2 = AnimationUtils.loadAnimation(this, R.anim.scale);
        anim3 = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim4 = AnimationUtils.loadAnimation(this, R.anim.alpha);


        final ImageView i1 = (ImageView) findViewById(R.id.iw2x2_11);
        final ImageView i2 = (ImageView) findViewById(R.id.iw2x2_12);
        final ImageView i3 = (ImageView) findViewById(R.id.iw2x2_21);
        final ImageView i4 = (ImageView) findViewById(R.id.iw2x2_22);



        final ImageView i31 = (ImageView) findViewById(R.id.iw3x3_11);
        final ImageView i32 = (ImageView) findViewById(R.id.iw3x3_12);
        final ImageView i33 = (ImageView) findViewById(R.id.iw3x3_13);

        final ImageView i34 = (ImageView) findViewById(R.id.iw3x3_21);
        final ImageView i35 = (ImageView) findViewById(R.id.iw3x3_22);
        final ImageView i36 = (ImageView) findViewById(R.id.iw3x3_23);

        final ImageView i37 = (ImageView) findViewById(R.id.iw3x3_31);
        final ImageView i38 = (ImageView) findViewById(R.id.iw3x3_32);
        final ImageView i39 = (ImageView) findViewById(R.id.iw3x3_33);



        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1.startAnimation(anim);
                i2.startAnimation(anim2);
                i3.startAnimation(anim3);
                i4.startAnimation(anim4);


                anim.setFillAfter(true);
                anim.setDuration(350);

                anim2.setFillAfter(true);
                anim2.setDuration(350);

                anim3.setFillAfter(true);
                anim3.setDuration(350);

                anim4.setFillAfter(true);
                anim4.setDuration(350);


                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        RelativeLayout rl3 = (RelativeLayout) findViewById(R.id.rl_3x3);

                        rl3.setVisibility(View.VISIBLE);
                    }
                }, 300);





            }
        }



        );

        i31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i31.startAnimation(anim);
                i32.startAnimation(anim2);
                i33.startAnimation(anim3);
                i34.startAnimation(anim4);

                i35.startAnimation(anim);
                i36.startAnimation(anim2);
                i37.startAnimation(anim3);
                i38.startAnimation(anim4);
                i39.startAnimation(anim);


                anim.setFillAfter(true);
                anim.setDuration(350);

                anim2.setFillAfter(true);
                anim2.setDuration(350);

                anim3.setFillAfter(true);
                anim3.setDuration(350);

                anim4.setFillAfter(true);
                anim4.setDuration(350);


                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        RelativeLayout rl4 = (RelativeLayout) findViewById(R.id.rl_4x4);

                        rl4.setVisibility(View.VISIBLE);
                    }
                }, 300);





            }
        });

    }


}
