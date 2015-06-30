package com.dailyappslab.etc;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;


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

    int score;
    TextView txtScore;

    Animation anim;
    Animation anim2;
    Animation anim3;
    Animation anim4;
    Animation anim5;


    Animation anim_r;
    Animation anim2_r;
    Animation anim3_r;
    Animation anim4_r;
    Animation anim5_r;

    //region #Definition of views
    RelativeLayout rl2x2;
    RelativeLayout rl3x3;
    RelativeLayout rl4x4;
    RelativeLayout rl5x5;
    RelativeLayout rl6x6;
    RelativeLayout rl7x7;
    RelativeLayout rl8x8;

    ImageView iw2x2_11;
    ImageView iw2x2_12;
    ImageView iw2x2_21;
    ImageView iw2x2_22;

    ImageView iw3x3_11;
    ImageView iw3x3_12;
    ImageView iw3x3_13;
    ImageView iw3x3_21;
    ImageView iw3x3_22;
    ImageView iw3x3_23;
    ImageView iw3x3_31;
    ImageView iw3x3_32;
    ImageView iw3x3_33;

    ImageView iw4x4_11;
    ImageView iw4x4_12;
    ImageView iw4x4_13;
    ImageView iw4x4_14;
    ImageView iw4x4_21;
    ImageView iw4x4_22;
    ImageView iw4x4_23;
    ImageView iw4x4_24;
    ImageView iw4x4_31;
    ImageView iw4x4_32;
    ImageView iw4x4_33;
    ImageView iw4x4_34;
    ImageView iw4x4_41;
    ImageView iw4x4_42;
    ImageView iw4x4_43;
    ImageView iw4x4_44;

    ImageView iw5x5_11;
    ImageView iw5x5_12;
    ImageView iw5x5_13;
    ImageView iw5x5_14;
    ImageView iw5x5_15;
    ImageView iw5x5_21;
    ImageView iw5x5_22;
    ImageView iw5x5_23;
    ImageView iw5x5_24;
    ImageView iw5x5_25;
    ImageView iw5x5_31;
    ImageView iw5x5_32;
    ImageView iw5x5_33;
    ImageView iw5x5_34;
    ImageView iw5x5_35;
    ImageView iw5x5_41;
    ImageView iw5x5_42;
    ImageView iw5x5_43;
    ImageView iw5x5_44;
    ImageView iw5x5_45;
    ImageView iw5x5_51;
    ImageView iw5x5_52;
    ImageView iw5x5_53;
    ImageView iw5x5_54;
    ImageView iw5x5_55;

    ImageView iw6x6_11;
    ImageView iw6x6_12;
    ImageView iw6x6_13;
    ImageView iw6x6_14;
    ImageView iw6x6_15;
    ImageView iw6x6_16;
    ImageView iw6x6_21;
    ImageView iw6x6_22;
    ImageView iw6x6_23;
    ImageView iw6x6_24;
    ImageView iw6x6_25;
    ImageView iw6x6_26;
    ImageView iw6x6_31;
    ImageView iw6x6_32;
    ImageView iw6x6_33;
    ImageView iw6x6_34;
    ImageView iw6x6_35;
    ImageView iw6x6_36;
    ImageView iw6x6_41;
    ImageView iw6x6_42;
    ImageView iw6x6_43;
    ImageView iw6x6_44;
    ImageView iw6x6_45;
    ImageView iw6x6_46;
    ImageView iw6x6_51;
    ImageView iw6x6_52;
    ImageView iw6x6_53;
    ImageView iw6x6_54;
    ImageView iw6x6_55;
    ImageView iw6x6_56;
    ImageView iw6x6_61;
    ImageView iw6x6_62;
    ImageView iw6x6_63;
    ImageView iw6x6_64;
    ImageView iw6x6_65;
    ImageView iw6x6_66;

    ImageView iw7x7_11;
    ImageView iw7x7_12;
    ImageView iw7x7_13;
    ImageView iw7x7_14;
    ImageView iw7x7_15;
    ImageView iw7x7_16;
    ImageView iw7x7_17;
    ImageView iw7x7_21;
    ImageView iw7x7_22;
    ImageView iw7x7_23;
    ImageView iw7x7_24;
    ImageView iw7x7_25;
    ImageView iw7x7_26;
    ImageView iw7x7_27;
    ImageView iw7x7_31;
    ImageView iw7x7_32;
    ImageView iw7x7_33;
    ImageView iw7x7_34;
    ImageView iw7x7_35;
    ImageView iw7x7_36;
    ImageView iw7x7_37;
    ImageView iw7x7_41;
    ImageView iw7x7_42;
    ImageView iw7x7_43;
    ImageView iw7x7_44;
    ImageView iw7x7_45;
    ImageView iw7x7_46;
    ImageView iw7x7_47;
    ImageView iw7x7_51;
    ImageView iw7x7_52;
    ImageView iw7x7_53;
    ImageView iw7x7_54;
    ImageView iw7x7_55;
    ImageView iw7x7_56;
    ImageView iw7x7_57;
    ImageView iw7x7_61;
    ImageView iw7x7_62;
    ImageView iw7x7_63;
    ImageView iw7x7_64;
    ImageView iw7x7_65;
    ImageView iw7x7_66;
    ImageView iw7x7_67;
    ImageView iw7x7_71;
    ImageView iw7x7_72;
    ImageView iw7x7_73;
    ImageView iw7x7_74;
    ImageView iw7x7_75;
    ImageView iw7x7_76;
    ImageView iw7x7_77;

    ImageView iw8x8_11;
    ImageView iw8x8_12;
    ImageView iw8x8_13;
    ImageView iw8x8_14;
    ImageView iw8x8_15;
    ImageView iw8x8_16;
    ImageView iw8x8_17;
    ImageView iw8x8_18;
    ImageView iw8x8_21;
    ImageView iw8x8_22;
    ImageView iw8x8_23;
    ImageView iw8x8_24;
    ImageView iw8x8_25;
    ImageView iw8x8_26;
    ImageView iw8x8_27;
    ImageView iw8x8_28;
    ImageView iw8x8_31;
    ImageView iw8x8_32;
    ImageView iw8x8_33;
    ImageView iw8x8_34;
    ImageView iw8x8_35;
    ImageView iw8x8_36;
    ImageView iw8x8_37;
    ImageView iw8x8_38;
    ImageView iw8x8_41;
    ImageView iw8x8_42;
    ImageView iw8x8_43;
    ImageView iw8x8_44;
    ImageView iw8x8_45;
    ImageView iw8x8_46;
    ImageView iw8x8_47;
    ImageView iw8x8_48;
    ImageView iw8x8_51;
    ImageView iw8x8_52;
    ImageView iw8x8_53;
    ImageView iw8x8_54;
    ImageView iw8x8_55;
    ImageView iw8x8_56;
    ImageView iw8x8_57;
    ImageView iw8x8_58;
    ImageView iw8x8_61;
    ImageView iw8x8_62;
    ImageView iw8x8_63;
    ImageView iw8x8_64;
    ImageView iw8x8_65;
    ImageView iw8x8_66;
    ImageView iw8x8_67;
    ImageView iw8x8_68;
    ImageView iw8x8_71;
    ImageView iw8x8_72;
    ImageView iw8x8_73;
    ImageView iw8x8_74;
    ImageView iw8x8_75;
    ImageView iw8x8_76;
    ImageView iw8x8_77;
    ImageView iw8x8_78;
    ImageView iw8x8_81;
    ImageView iw8x8_82;
    ImageView iw8x8_83;
    ImageView iw8x8_84;
    ImageView iw8x8_85;
    ImageView iw8x8_86;
    ImageView iw8x8_87;
    ImageView iw8x8_88;
    //endregion

    int differColor;
    int mainColor;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.game);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.game);

        InstantiateViews();

        anim = AnimationUtils.loadAnimation(this, R.anim.rote);
        anim2 = AnimationUtils.loadAnimation(this, R.anim.scale);
        anim3 = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim4 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim5 = AnimationUtils.loadAnimation(this, R.anim.translate2);

        anim_r = AnimationUtils.loadAnimation(this, R.anim.rote_reverse);
        anim2_r = AnimationUtils.loadAnimation(this, R.anim.scale_reverse);
        anim3_r = AnimationUtils.loadAnimation(this, R.anim.translate_reverse);
        anim4_r = AnimationUtils.loadAnimation(this, R.anim.alpha_reverse);
        anim5_r = AnimationUtils.loadAnimation(this, R.anim.translate2_reverse);


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



//        i1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                i1.startAnimation(anim);
//                i2.startAnimation(anim2);
//                i3.startAnimation(anim3);
//                i4.startAnimation(anim4);
//
//
//                anim.setFillAfter(true);
//                anim.setDuration(350);
//
//                anim2.setFillAfter(true);
//                anim2.setDuration(350);
//
//                anim3.setFillAfter(true);
//                anim3.setDuration(350);
//
//                anim4.setFillAfter(true);
//                anim4.setDuration(350);
//
//
//                Handler handler = new Handler();
//                handler.postDelayed(new Runnable() {
//                    public void run() {
//                        RelativeLayout rl3 = (RelativeLayout) findViewById(R.id.rl_3x3);
//
//                        rl3.setVisibility(View.VISIBLE);
//                    }
//                }, 300);
//
//
//
//
//
//            }
//        }
//
//
//
//        );
//
//        i31.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                i31.startAnimation(anim);
//                i32.startAnimation(anim2);
//                i33.startAnimation(anim3);
//                i34.startAnimation(anim4);
//
//                i35.startAnimation(anim5);
//                i36.startAnimation(anim);
//                i37.startAnimation(anim2);
//                i38.startAnimation(anim3);
//                i39.startAnimation(anim4);
//
//
//                anim.setFillAfter(true);
//                anim.setDuration(350);
//
//                anim2.setFillAfter(true);
//                anim2.setDuration(350);
//
//                anim3.setFillAfter(true);
//                anim3.setDuration(350);
//
//                anim4.setFillAfter(true);
//                anim4.setDuration(350);
//
//                anim5.setFillAfter(true);
//                anim5.setDuration(350);
//
//
//                Handler handler = new Handler();
//                handler.postDelayed(new Runnable() {
//                    public void run() {
//                        RelativeLayout rl4 = (RelativeLayout) findViewById(R.id.rl_4x4);
//
//                        rl4.setVisibility(View.VISIBLE);
//                    }
//                }, 300);
//
//
//
//
//
//            }
//        });

        DrawLevel();
    }

    public void ClickCube(View view) {
        GradientDrawable bgColor = (GradientDrawable) view.getBackground();
        if(view.getTag().equals(true))
        {
            Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        DrawLevel();

                    }
                }, 300);

            Animate2x2();
            score++;
            txtScore.setText(String.valueOf(score));
            SwitchLayouts(score);
        }
//        bgColor.getAlpha();
        //Toast.makeText(this, String.valueOf(bgColor.getAlpha()), Toast.LENGTH_LONG).show();
        //view.getBackground().col
        //if(((StateListDrawable) bgColor).getColor() == differColor) {
          //  rl2x2.setVisibility(View.INVISIBLE);
            //rl3x3.setVisibility(View.VISIBLE);
        //}

    }

    public void SwitchLayouts(int score)
    {
        switch (score)
        {
            case 5:
                rl2x2.setVisibility(View.INVISIBLE);
                rl3x3.setVisibility(View.VISIBLE);
                break;
            case 12:
                rl3x3.setVisibility(View.INVISIBLE);
                rl4x4.setVisibility(View.VISIBLE);
                break;
            case 22:
                rl4x4.setVisibility(View.INVISIBLE);
                rl5x5.setVisibility(View.VISIBLE);
                break;
            case 37:
                rl5x5.setVisibility(View.INVISIBLE);
                rl6x6.setVisibility(View.VISIBLE);
                break;
            case 55:
                rl6x6.setVisibility(View.INVISIBLE);
                rl7x7.setVisibility(View.VISIBLE);
                break;
            case 75:
                rl7x7.setVisibility(View.INVISIBLE);
                rl8x8.setVisibility(View.VISIBLE);
                break;
            case 95:
                break;
        }
    }
    public void DrawLevel()
    {
//        ImageView vw = (ImageView) findViewById(R.id.iw2x2_11);
//        //vw.setBackgroundColor(14717843);
//        ImageView vw1 = (ImageView) findViewById(R.id.iw2x2_12);
        // ColorsHandler.ReduceColorOpacity(vw1.get)

        mainColor = ColorsHandler.GetRandomColor();
        ApplyColorToImgView(iw2x2_11, mainColor, 1);
        ApplyColorToImgView(iw2x2_12, mainColor, 1);
        ApplyColorToImgView(iw2x2_21, mainColor, 1);
        ApplyColorToImgView(iw2x2_22, mainColor, 1);
        differColor = ColorsHandler.ReduceColorOpacity(mainColor, 50);
       // ApplyColorToImgView(iw2x2_12, differColor, 1);

        ImageView tmp = (ImageView) findViewById(getResources().getIdentifier(RandomGenerator.GetRandSquareName(2), "id", this.getPackageName()));
        ApplyColorToImgView(tmp, differColor, 1);

        //vw.setBackgroundColor(ColorsHandler.GetRandomColor());
       // vw1.setBackgroundColor(((ColorDrawable) vw.getBackground()).getColor());
        //vw1.setBackgroundColor(ColorsHandler.ReduceColorOpacity(((ColorDrawable) vw.getBackground()).getColor(), 20));

//        int h = vw1.getHeight();
//        ShapeDrawable mDrawable = new ShapeDrawable(new RectShape());
//        mDrawable.getPaint().setShader(new LinearGradient(0, 0, 0, h, ColorsHandler.GetRandomColor(), Color.parseColor("#110000FF"), Shader.TileMode.REPEAT));
//        vw1.setBackgroundDrawable(mDrawable);

//        int colors[] = { ColorsHandler.GetRandomColor(), 0xffb6c9e2 };
//
//        GradientDrawable gradientDrawable = new GradientDrawable(
//                GradientDrawable.Orientation.TOP_BOTTOM, colors);


//        vw1.setBackgroundDrawable(gradientDrawable);

//        StateListDrawable dr = (StateListDrawable) getResources().getDrawable(R.drawable.ramka1);
//        dr.setColorFilter(ColorsHandler.GetRandomColor(), PorterDuff.Mode.DST_OVER);




        //vw.setBackgroundColor((StateListDrawable) vw);
       // vw.getBackground().setAlpha(vw1.getBackground().getAlpha());
        //vw1.setBackgroundColor(((StateListDrawable) vw.getBackground()).getAlpha());
        //vw1.setBackgroundColor(ColorsHandler.ReduceColorOpacity(((StateListDrawable) vw.getBackground()).setAlpha(vw.getBackground().getAlpha()));
        // ColorsHandler.ReduceColorOpacity(((ColorDrawable) vw.getBackground()).getColor())
        //vw1.setBackgroundColor(((ColorDrawable)vw.getBackground()).getColor() + 50);
    }

    public void ApplyColorToImgView(View view, int color, int size)
    {
        GradientDrawable gdDefault = new GradientDrawable();
        gdDefault.setColor(color);
        switch(size){
            case 1:
                gdDefault.setCornerRadius(getResources().getDimension(R.dimen.corner_radius_2x2_5x5));
                break;
            case 2:
                gdDefault.setCornerRadius(getResources().getDimension(R.dimen.corner_radius_6x6_6x8));
                break;
        }
        gdDefault.setStroke(0, 0xffb6c9e2);

        if(differColor == color)
        {
            view.setTag(true);
        }
        else
            view.setTag(false);

        view.setBackgroundDrawable(gdDefault);
    }


    // правильний метод
    public void Animate2x2()
    {
        iw2x2_11.startAnimation(anim);
        iw2x2_12.startAnimation(anim2);
        iw2x2_21.startAnimation(anim3);
        iw2x2_22.startAnimation(anim4);


        //anim.setFillAfter(true);
        anim.setDuration(350);

        //anim2.setFillAfter(true);
        anim2.setDuration(350);

        //anim3.setFillAfter(true);
        anim3.setDuration(350);

        //anim4.setFillAfter(true);
        anim4.setDuration(350);


    }


    public void Animate2x2_reverse()
    {
        iw2x2_11.startAnimation(anim_r);
        iw2x2_12.startAnimation(anim2_r);
        iw2x2_21.startAnimation(anim3_r);
        iw2x2_22.startAnimation(anim4_r);


        //anim.setFillAfter(true);
        anim_r.setDuration(350);

        //anim2.setFillAfter(true);
        anim2_r.setDuration(350);

        //anim3.setFillAfter(true);
        anim3_r.setDuration(350);

        //anim4.setFillAfter(true);
        anim4_r.setDuration(350);

    }


    public void Animate3x3()
    {


        iw3x3_11.startAnimation(anim);
        iw3x3_12.startAnimation(anim2);
        iw3x3_13.startAnimation(anim3);
        iw3x3_21.startAnimation(anim4);
        iw3x3_22.startAnimation(anim5);
        iw3x3_23.startAnimation(anim);
        iw3x3_31.startAnimation(anim2);
        iw3x3_32.startAnimation(anim3);
        iw3x3_33.startAnimation(anim4);


        //anim.setFillAfter(true);
        anim.setDuration(350);

        //anim2.setFillAfter(true);
        anim2.setDuration(350);

        //anim3.setFillAfter(true);
        anim3.setDuration(350);

        //anim4.setFillAfter(true);
        anim4.setDuration(350);

        //anim5.setFillAfter(true);
        anim5.setDuration(350);


    }


    public void Animate3x3_reverse()
    {

        iw3x3_11.startAnimation(anim_r);
        iw3x3_12.startAnimation(anim2_r);
        iw3x3_13.startAnimation(anim3_r);
        iw3x3_21.startAnimation(anim4_r);
        iw3x3_22.startAnimation(anim5_r);
        iw3x3_23.startAnimation(anim_r);
        iw3x3_31.startAnimation(anim2_r);
        iw3x3_32.startAnimation(anim3_r);
        iw3x3_33.startAnimation(anim4_r);


        //anim.setFillAfter(true);
        anim_r.setDuration(350);

        //anim2.setFillAfter(true);
        anim2_r.setDuration(350);

        //anim3.setFillAfter(true);
        anim3_r.setDuration(350);

        //anim4.setFillAfter(true);
        anim4_r.setDuration(350);

        //anim5.setFillAfter(true);
        anim5_r.setDuration(350);

    }



    public void Animate4x4()
    {

        iw4x4_11.startAnimation(anim);
        iw4x4_12.startAnimation(anim2);
        iw4x4_13.startAnimation(anim3);
        iw4x4_14.startAnimation(anim4);
        iw4x4_21.startAnimation(anim5);
        iw4x4_22.startAnimation(anim);
        iw4x4_23.startAnimation(anim2);
        iw4x4_24.startAnimation(anim3);
        iw4x4_31.startAnimation(anim4);
        iw4x4_32.startAnimation(anim5);
        iw4x4_33.startAnimation(anim);
        iw4x4_34.startAnimation(anim2);
        iw4x4_41.startAnimation(anim3);
        iw4x4_42.startAnimation(anim4);
        iw4x4_43.startAnimation(anim5);
        iw4x4_44.startAnimation(anim);


        //anim.setFillAfter(true);
        anim.setDuration(350);

        //anim2.setFillAfter(true);
        anim2.setDuration(350);

        //anim3.setFillAfter(true);
        anim3.setDuration(350);

        //anim4.setFillAfter(true);
        anim4.setDuration(350);

        //anim5.setFillAfter(true);
        anim5.setDuration(350);


    }


    public void Animate4x4_reverse()
    {

        iw4x4_11.startAnimation(anim_r);
        iw4x4_12.startAnimation(anim2_r);
        iw4x4_13.startAnimation(anim3_r);
        iw4x4_14.startAnimation(anim4_r);
        iw4x4_21.startAnimation(anim5_r);
        iw4x4_22.startAnimation(anim_r);
        iw4x4_23.startAnimation(anim2_r);
        iw4x4_24.startAnimation(anim3_r);
        iw4x4_31.startAnimation(anim4_r);
        iw4x4_32.startAnimation(anim5_r);
        iw4x4_33.startAnimation(anim_r);
        iw4x4_34.startAnimation(anim2_r);
        iw4x4_41.startAnimation(anim3_r);
        iw4x4_42.startAnimation(anim4_r);
        iw4x4_43.startAnimation(anim5_r);
        iw4x4_44.startAnimation(anim_r);


        //anim.setFillAfter(true);
        anim_r.setDuration(350);

        //anim2.setFillAfter(true);
        anim2_r.setDuration(350);

        //anim3.setFillAfter(true);
        anim3_r.setDuration(350);

        //anim4.setFillAfter(true);
        anim4_r.setDuration(350);

        //anim5.setFillAfter(true);
        anim5_r.setDuration(350);

    }


    public void Animate5x5()
    {


        iw5x5_11.startAnimation(anim);
        iw5x5_12.startAnimation(anim2);
        iw5x5_13.startAnimation(anim3);
        iw5x5_14.startAnimation(anim4);
        iw5x5_15.startAnimation(anim5);
        iw5x5_21.startAnimation(anim);
        iw5x5_22.startAnimation(anim2);
        iw5x5_23.startAnimation(anim3);
        iw5x5_24.startAnimation(anim4);
        iw5x5_25.startAnimation(anim5);
        iw5x5_31.startAnimation(anim);
        iw5x5_32.startAnimation(anim2);
        iw5x5_33.startAnimation(anim3);
        iw5x5_34.startAnimation(anim4);
        iw5x5_35.startAnimation(anim5);
        iw5x5_41.startAnimation(anim);
        iw5x5_42.startAnimation(anim2);
        iw5x5_43.startAnimation(anim3);
        iw5x5_44.startAnimation(anim4);
        iw5x5_45.startAnimation(anim5);
        iw5x5_51.startAnimation(anim);
        iw5x5_52.startAnimation(anim2);
        iw5x5_53.startAnimation(anim3);
        iw5x5_54.startAnimation(anim4);
        iw5x5_55.startAnimation(anim5);


        //anim.setFillAfter(true);
        anim.setDuration(350);

        //anim2.setFillAfter(true);
        anim2.setDuration(350);

        //anim3.setFillAfter(true);
        anim3.setDuration(350);

        //anim4.setFillAfter(true);
        anim4.setDuration(350);

        //anim5.setFillAfter(true);
        anim5.setDuration(350);


    }


    public void Animate5x5_reverse()
    {

        iw5x5_11.startAnimation(anim_r);
        iw5x5_12.startAnimation(anim2_r);
        iw5x5_13.startAnimation(anim3_r);
        iw5x5_14.startAnimation(anim4_r);
        iw5x5_15.startAnimation(anim5_r);
        iw5x5_21.startAnimation(anim_r);
        iw5x5_22.startAnimation(anim2_r);
        iw5x5_23.startAnimation(anim3_r);
        iw5x5_24.startAnimation(anim4_r);
        iw5x5_25.startAnimation(anim5_r);
        iw5x5_31.startAnimation(anim_r);
        iw5x5_32.startAnimation(anim2_r);
        iw5x5_33.startAnimation(anim3_r);
        iw5x5_34.startAnimation(anim4_r);
        iw5x5_35.startAnimation(anim5_r);
        iw5x5_41.startAnimation(anim_r);
        iw5x5_42.startAnimation(anim2_r);
        iw5x5_43.startAnimation(anim3_r);
        iw5x5_44.startAnimation(anim4_r);
        iw5x5_45.startAnimation(anim5_r);
        iw5x5_51.startAnimation(anim_r);
        iw5x5_52.startAnimation(anim2_r);
        iw5x5_53.startAnimation(anim3_r);
        iw5x5_54.startAnimation(anim4_r);
        iw5x5_55.startAnimation(anim5_r);


        //anim.setFillAfter(true);
        anim_r.setDuration(350);

        //anim2.setFillAfter(true);
        anim2_r.setDuration(350);

        //anim3.setFillAfter(true);
        anim3_r.setDuration(350);

        //anim4.setFillAfter(true);
        anim4_r.setDuration(350);

        //anim5.setFillAfter(true);
        anim5_r.setDuration(350);

    }


    public void Animate6x6()
    {

        iw6x6_11.startAnimation(anim);
        iw6x6_12.startAnimation(anim2);
        iw6x6_13.startAnimation(anim3);
        iw6x6_14.startAnimation(anim4);
        iw6x6_15.startAnimation(anim5);
        iw6x6_16.startAnimation(anim);
        iw6x6_21.startAnimation(anim2);
        iw6x6_22.startAnimation(anim3);
        iw6x6_23.startAnimation(anim4);
        iw6x6_24.startAnimation(anim5);
        iw6x6_25.startAnimation(anim);
        iw6x6_26.startAnimation(anim2);
        iw6x6_31.startAnimation(anim3);
        iw6x6_32.startAnimation(anim4);
        iw6x6_33.startAnimation(anim5);
        iw6x6_34.startAnimation(anim);
        iw6x6_35.startAnimation(anim2);
        iw6x6_36.startAnimation(anim3);
        iw6x6_41.startAnimation(anim4);
        iw6x6_42.startAnimation(anim5);
        iw6x6_43.startAnimation(anim);
        iw6x6_44.startAnimation(anim2);
        iw6x6_45.startAnimation(anim3);
        iw6x6_46.startAnimation(anim4);
        iw6x6_51.startAnimation(anim5);
        iw6x6_52.startAnimation(anim);
        iw6x6_53.startAnimation(anim2);
        iw6x6_54.startAnimation(anim3);
        iw6x6_55.startAnimation(anim4);
        iw6x6_56.startAnimation(anim5);
        iw6x6_61.startAnimation(anim);
        iw6x6_62.startAnimation(anim2);
        iw6x6_63.startAnimation(anim3);
        iw6x6_64.startAnimation(anim4);
        iw6x6_65.startAnimation(anim5);
        iw6x6_66.startAnimation(anim);

        //anim.setFillAfter(true);
        anim.setDuration(350);

        //anim2.setFillAfter(true);
        anim2.setDuration(350);

        //anim3.setFillAfter(true);
        anim3.setDuration(350);

        //anim4.setFillAfter(true);
        anim4.setDuration(350);

        //anim5.setFillAfter(true);
        anim5.setDuration(350);


    }


    public void Animate6x6_reverse()
    {

        iw6x6_11.startAnimation(anim_r);
        iw6x6_12.startAnimation(anim2_r);
        iw6x6_13.startAnimation(anim3_r);
        iw6x6_14.startAnimation(anim4_r);
        iw6x6_15.startAnimation(anim5_r);
        iw6x6_16.startAnimation(anim_r);
        iw6x6_21.startAnimation(anim2_r);
        iw6x6_22.startAnimation(anim3_r);
        iw6x6_23.startAnimation(anim4_r);
        iw6x6_24.startAnimation(anim5_r);
        iw6x6_25.startAnimation(anim_r);
        iw6x6_26.startAnimation(anim2_r);
        iw6x6_31.startAnimation(anim3_r);
        iw6x6_32.startAnimation(anim4_r);
        iw6x6_33.startAnimation(anim5_r);
        iw6x6_34.startAnimation(anim_r);
        iw6x6_35.startAnimation(anim2_r);
        iw6x6_36.startAnimation(anim3_r);
        iw6x6_41.startAnimation(anim4_r);
        iw6x6_42.startAnimation(anim5_r);
        iw6x6_43.startAnimation(anim_r);
        iw6x6_44.startAnimation(anim2_r);
        iw6x6_45.startAnimation(anim3_r);
        iw6x6_46.startAnimation(anim4_r);
        iw6x6_51.startAnimation(anim5_r);
        iw6x6_52.startAnimation(anim_r);
        iw6x6_53.startAnimation(anim2_r);
        iw6x6_54.startAnimation(anim3_r);
        iw6x6_55.startAnimation(anim4_r);
        iw6x6_56.startAnimation(anim5_r);
        iw6x6_61.startAnimation(anim_r);
        iw6x6_62.startAnimation(anim2_r);
        iw6x6_63.startAnimation(anim3_r);
        iw6x6_64.startAnimation(anim4_r);
        iw6x6_65.startAnimation(anim5_r);
        iw6x6_66.startAnimation(anim_r);


        //anim.setFillAfter(true);
        anim_r.setDuration(350);

        //anim2.setFillAfter(true);
        anim2_r.setDuration(350);

        //anim3.setFillAfter(true);
        anim3_r.setDuration(350);

        //anim4.setFillAfter(true);
        anim4_r.setDuration(350);

        //anim5.setFillAfter(true);
        anim5_r.setDuration(350);

    }


    public void Animate7x7()
    {

        iw7x7_11.startAnimation(anim);
        iw7x7_12.startAnimation(anim2);
        iw7x7_13.startAnimation(anim3);
        iw7x7_14.startAnimation(anim4);
        iw7x7_15.startAnimation(anim5);
        iw7x7_16.startAnimation(anim);
        iw7x7_17.startAnimation(anim2);
        iw7x7_21.startAnimation(anim3);
        iw7x7_22.startAnimation(anim4);
        iw7x7_23.startAnimation(anim5);
        iw7x7_24.startAnimation(anim);
        iw7x7_25.startAnimation(anim2);
        iw7x7_26.startAnimation(anim3);
        iw7x7_27.startAnimation(anim4);
        iw7x7_31.startAnimation(anim5);
        iw7x7_32.startAnimation(anim);
        iw7x7_33.startAnimation(anim2);
        iw7x7_34.startAnimation(anim3);
        iw7x7_35.startAnimation(anim4);
        iw7x7_36.startAnimation(anim5);
        iw7x7_37.startAnimation(anim);
        iw7x7_41.startAnimation(anim2);
        iw7x7_42.startAnimation(anim3);
        iw7x7_43.startAnimation(anim4);
        iw7x7_44.startAnimation(anim5);
        iw7x7_45.startAnimation(anim);
        iw7x7_46.startAnimation(anim2);
        iw7x7_47.startAnimation(anim3);
        iw7x7_51.startAnimation(anim4);
        iw7x7_52.startAnimation(anim5);
        iw7x7_53.startAnimation(anim);
        iw7x7_54.startAnimation(anim2);
        iw7x7_55.startAnimation(anim3);
        iw7x7_56.startAnimation(anim4);
        iw7x7_57.startAnimation(anim5);
        iw7x7_61.startAnimation(anim);
        iw7x7_62.startAnimation(anim2);
        iw7x7_63.startAnimation(anim3);
        iw7x7_64.startAnimation(anim4);
        iw7x7_65.startAnimation(anim5);
        iw7x7_66.startAnimation(anim);
        iw7x7_67.startAnimation(anim2);
        iw7x7_71.startAnimation(anim3);
        iw7x7_72.startAnimation(anim4);
        iw7x7_73.startAnimation(anim5);
        iw7x7_74.startAnimation(anim);
        iw7x7_75.startAnimation(anim2);
        iw7x7_76.startAnimation(anim3);
        iw7x7_77.startAnimation(anim4);

        //anim.setFillAfter(true);
        anim.setDuration(350);

        //anim2.setFillAfter(true);
        anim2.setDuration(350);

        //anim3.setFillAfter(true);
        anim3.setDuration(350);

        //anim4.setFillAfter(true);
        anim4.setDuration(350);

        //anim5.setFillAfter(true);
        anim5.setDuration(350);


    }


    public void Animate7x7_reverse()
    {

        iw7x7_11.startAnimation(anim_r);
        iw7x7_12.startAnimation(anim2_r);
        iw7x7_13.startAnimation(anim3_r);
        iw7x7_14.startAnimation(anim4_r);
        iw7x7_15.startAnimation(anim5_r);
        iw7x7_16.startAnimation(anim_r);
        iw7x7_17.startAnimation(anim2_r);
        iw7x7_21.startAnimation(anim3_r);
        iw7x7_22.startAnimation(anim4_r);
        iw7x7_23.startAnimation(anim5_r);
        iw7x7_24.startAnimation(anim_r);
        iw7x7_25.startAnimation(anim2_r);
        iw7x7_26.startAnimation(anim3_r);
        iw7x7_27.startAnimation(anim4_r);
        iw7x7_31.startAnimation(anim5_r);
        iw7x7_32.startAnimation(anim_r);
        iw7x7_33.startAnimation(anim2_r);
        iw7x7_34.startAnimation(anim3_r);
        iw7x7_35.startAnimation(anim4_r);
        iw7x7_36.startAnimation(anim5_r);
        iw7x7_37.startAnimation(anim_r);
        iw7x7_41.startAnimation(anim2_r);
        iw7x7_42.startAnimation(anim3_r);
        iw7x7_43.startAnimation(anim4_r);
        iw7x7_44.startAnimation(anim5_r);
        iw7x7_45.startAnimation(anim_r);
        iw7x7_46.startAnimation(anim2_r);
        iw7x7_47.startAnimation(anim3_r);
        iw7x7_51.startAnimation(anim4_r);
        iw7x7_52.startAnimation(anim5_r);
        iw7x7_53.startAnimation(anim_r);
        iw7x7_54.startAnimation(anim2_r);
        iw7x7_55.startAnimation(anim3_r);
        iw7x7_56.startAnimation(anim4_r);
        iw7x7_57.startAnimation(anim5_r);
        iw7x7_61.startAnimation(anim_r);
        iw7x7_62.startAnimation(anim2_r);
        iw7x7_63.startAnimation(anim3_r);
        iw7x7_64.startAnimation(anim4_r);
        iw7x7_65.startAnimation(anim5_r);
        iw7x7_66.startAnimation(anim_r);
        iw7x7_67.startAnimation(anim2_r);
        iw7x7_71.startAnimation(anim3_r);
        iw7x7_72.startAnimation(anim4_r);
        iw7x7_73.startAnimation(anim5_r);
        iw7x7_74.startAnimation(anim_r);
        iw7x7_75.startAnimation(anim2_r);
        iw7x7_76.startAnimation(anim3_r);
        iw7x7_77.startAnimation(anim4_r);


        //anim.setFillAfter(true);
        anim_r.setDuration(350);

        //anim2.setFillAfter(true);
        anim2_r.setDuration(350);

        //anim3.setFillAfter(true);
        anim3_r.setDuration(350);

        //anim4.setFillAfter(true);
        anim4_r.setDuration(350);

        //anim5.setFillAfter(true);
        anim5_r.setDuration(350);

    }

    public void Animate8x8()
    {

        iw8x8_11.startAnimation(anim);
        iw8x8_12.startAnimation(anim2);
        iw8x8_13.startAnimation(anim3);
        iw8x8_14.startAnimation(anim4);
        iw8x8_15.startAnimation(anim5);
        iw8x8_16.startAnimation(anim);
        iw8x8_17.startAnimation(anim2);
        iw8x8_18.startAnimation(anim3);
        iw8x8_21.startAnimation(anim4);
        iw8x8_22.startAnimation(anim5);
        iw8x8_23.startAnimation(anim);
        iw8x8_24.startAnimation(anim2);
        iw8x8_25.startAnimation(anim3);
        iw8x8_26.startAnimation(anim4);
        iw8x8_27.startAnimation(anim5);
        iw8x8_28.startAnimation(anim);
        iw8x8_31.startAnimation(anim2);
        iw8x8_32.startAnimation(anim3);
        iw8x8_33.startAnimation(anim4);
        iw8x8_34.startAnimation(anim5);
        iw8x8_35.startAnimation(anim);
        iw8x8_36.startAnimation(anim2);
        iw8x8_37.startAnimation(anim3);
        iw8x8_38.startAnimation(anim4);
        iw8x8_41.startAnimation(anim5);
        iw8x8_42.startAnimation(anim);
        iw8x8_43.startAnimation(anim2);
        iw8x8_44.startAnimation(anim3);
        iw8x8_45.startAnimation(anim4);
        iw8x8_46.startAnimation(anim5);
        iw8x8_47.startAnimation(anim);
        iw8x8_48.startAnimation(anim2);
        iw8x8_51.startAnimation(anim3);
        iw8x8_52.startAnimation(anim4);
        iw8x8_53.startAnimation(anim5);
        iw8x8_54.startAnimation(anim);
        iw8x8_55.startAnimation(anim2);
        iw8x8_56.startAnimation(anim3);
        iw8x8_57.startAnimation(anim4);
        iw8x8_58.startAnimation(anim5);
        iw8x8_61.startAnimation(anim);
        iw8x8_62.startAnimation(anim2);
        iw8x8_63.startAnimation(anim3);
        iw8x8_64.startAnimation(anim4);
        iw8x8_65.startAnimation(anim5);
        iw8x8_66.startAnimation(anim);
        iw8x8_67.startAnimation(anim2);
        iw8x8_68.startAnimation(anim3);
        iw8x8_71.startAnimation(anim4);
        iw8x8_72.startAnimation(anim5);
        iw8x8_73.startAnimation(anim);
        iw8x8_74.startAnimation(anim2);
        iw8x8_75.startAnimation(anim3);
        iw8x8_76.startAnimation(anim4);
        iw8x8_77.startAnimation(anim5);
        iw8x8_78.startAnimation(anim);
        iw8x8_81.startAnimation(anim2);
        iw8x8_82.startAnimation(anim3);
        iw8x8_83.startAnimation(anim4);
        iw8x8_84.startAnimation(anim5);
        iw8x8_85.startAnimation(anim);
        iw8x8_86.startAnimation(anim2);
        iw8x8_87.startAnimation(anim3);
        iw8x8_88.startAnimation(anim4);


        //anim.setFillAfter(true);
        anim.setDuration(350);

        //anim2.setFillAfter(true);
        anim2.setDuration(350);

        //anim3.setFillAfter(true);
        anim3.setDuration(350);

        //anim4.setFillAfter(true);
        anim4.setDuration(350);

        //anim5.setFillAfter(true);
        anim5.setDuration(350);


    }


    public void Animate8x8_reverse()
    {

        iw8x8_11.startAnimation(anim_r);
        iw8x8_12.startAnimation(anim2_r);
        iw8x8_13.startAnimation(anim3_r);
        iw8x8_14.startAnimation(anim4_r);
        iw8x8_15.startAnimation(anim5_r);
        iw8x8_16.startAnimation(anim_r);
        iw8x8_17.startAnimation(anim2_r);
        iw8x8_18.startAnimation(anim3_r);
        iw8x8_21.startAnimation(anim4_r);
        iw8x8_22.startAnimation(anim5_r);
        iw8x8_23.startAnimation(anim_r);
        iw8x8_24.startAnimation(anim2_r);
        iw8x8_25.startAnimation(anim3_r);
        iw8x8_26.startAnimation(anim4_r);
        iw8x8_27.startAnimation(anim5_r);
        iw8x8_28.startAnimation(anim_r);
        iw8x8_31.startAnimation(anim2_r);
        iw8x8_32.startAnimation(anim3_r);
        iw8x8_33.startAnimation(anim4_r);
        iw8x8_34.startAnimation(anim5_r);
        iw8x8_35.startAnimation(anim_r);
        iw8x8_36.startAnimation(anim2_r);
        iw8x8_37.startAnimation(anim3_r);
        iw8x8_38.startAnimation(anim4_r);
        iw8x8_41.startAnimation(anim5_r);
        iw8x8_42.startAnimation(anim_r);
        iw8x8_43.startAnimation(anim2_r);
        iw8x8_44.startAnimation(anim3_r);
        iw8x8_45.startAnimation(anim4_r);
        iw8x8_46.startAnimation(anim5_r);
        iw8x8_47.startAnimation(anim_r);
        iw8x8_48.startAnimation(anim2_r);
        iw8x8_51.startAnimation(anim3_r);
        iw8x8_52.startAnimation(anim4_r);
        iw8x8_53.startAnimation(anim5_r);
        iw8x8_54.startAnimation(anim_r);
        iw8x8_55.startAnimation(anim2_r);
        iw8x8_56.startAnimation(anim3_r);
        iw8x8_57.startAnimation(anim4_r);
        iw8x8_58.startAnimation(anim5_r);
        iw8x8_61.startAnimation(anim_r);
        iw8x8_62.startAnimation(anim2_r);
        iw8x8_63.startAnimation(anim3_r);
        iw8x8_64.startAnimation(anim4_r);
        iw8x8_65.startAnimation(anim5_r);
        iw8x8_66.startAnimation(anim_r);
        iw8x8_67.startAnimation(anim2_r);
        iw8x8_68.startAnimation(anim3_r);
        iw8x8_71.startAnimation(anim4_r);
        iw8x8_72.startAnimation(anim5_r);
        iw8x8_73.startAnimation(anim_r);
        iw8x8_74.startAnimation(anim2_r);
        iw8x8_75.startAnimation(anim3_r);
        iw8x8_76.startAnimation(anim4_r);
        iw8x8_77.startAnimation(anim5_r);
        iw8x8_78.startAnimation(anim_r);
        iw8x8_81.startAnimation(anim2_r);
        iw8x8_82.startAnimation(anim3_r);
        iw8x8_83.startAnimation(anim4_r);
        iw8x8_84.startAnimation(anim5_r);
        iw8x8_85.startAnimation(anim_r);
        iw8x8_86.startAnimation(anim2_r);
        iw8x8_87.startAnimation(anim3_r);
        iw8x8_88.startAnimation(anim4_r);


        //anim.setFillAfter(true);
        anim_r.setDuration(350);

        //anim2.setFillAfter(true);
        anim2_r.setDuration(350);

        //anim3.setFillAfter(true);
        anim3_r.setDuration(350);

        //anim4.setFillAfter(true);
        anim4_r.setDuration(350);

        //anim5.setFillAfter(true);
        anim5_r.setDuration(350);

    }




    public void InstantiateViews()
    {
        txtScore = (TextView) findViewById(R.id.score);
        rl2x2 = (RelativeLayout) findViewById(R.id.rl_2x2);
        rl3x3 = (RelativeLayout) findViewById(R.id.rl_3x3);
        rl4x4 = (RelativeLayout) findViewById(R.id.rl_4x4);
        rl5x5 = (RelativeLayout) findViewById(R.id.rl_5x5);
        rl6x6 = (RelativeLayout) findViewById(R.id.rl_6x6);
        rl7x7 = (RelativeLayout) findViewById(R.id.rl_7x7);
        rl8x8 = (RelativeLayout) findViewById(R.id.rl_8x8);

        iw2x2_11 = (ImageView) findViewById(R.id.iw2x2_11);
        iw2x2_12 = (ImageView) findViewById(R.id.iw2x2_12);
        iw2x2_21 = (ImageView) findViewById(R.id.iw2x2_21);
        iw2x2_22 = (ImageView) findViewById(R.id.iw2x2_22);






    }

}
