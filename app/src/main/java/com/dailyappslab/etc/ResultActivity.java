package com.dailyappslab.etc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.startad.lib.SADView;

/**
 * Created by GreenQ on 01.07.2015.
 */
public class ResultActivity extends Activity {

    RelativeLayout optional;
    TextView tvScore;
    TextView tvDescription;
    EditText etName;
    String[] scoresArray;
    String[] namesArray;
    Preferences preferences;
    SADView sadView;
    RelativeLayout okLayout;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);

        // getWindow().setFlags(ActionBar.LayoutParams.FLAG_NOT_TOUCH_);
        setContentView(R.layout.result);
        preferences = new Preferences(this);
        scoresArray = preferences.GetHighscores();
        namesArray = preferences.GetNames();
        optional = (RelativeLayout) findViewById(R.id.optional);
        etName = (EditText) findViewById(R.id.etName);
        okLayout = (RelativeLayout) findViewById(R.id.ok);
        tvScore = (TextView) findViewById(R.id.tvScoresAmount);
        tvDescription = (TextView) findViewById(R.id.tvDescription);

        SetTypefaces();

        int animalType = AnimalGradation.GetAnimalType(Globals.Score);
        tvDescription.setText(getResources().getString(getResources().getIdentifier("a" + animalType, "string", getPackageName())));
        tvScore.setText(String.valueOf(Globals.Score));
        DisplayPicture();
        setFinishOnTouchOutside(false);

        //if (Globals.mode == Mode.CLASSIC) {
            if (IsInsertPossible()) {
                optional.setVisibility(View.VISIBLE);
            }
        //}
        if(Globals.mode == Mode.TIMED)
        {
            optional.setVisibility(View.GONE);
        }
        
        ShowRateUs();

        if(Globals.interstitialAd.isLoaded())
            Globals.interstitialAd.show();

        ShowAd();




//        etName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if (hasFocus) {
//                    if (etName.getText().toString().trim().length() < 5) {
//                        etName.setError("Failed");
//                    } else {
//                        // your code here
//                        etName.setError(null);
//                    }
//                } else {
//                    if (etName.getText().toString().trim().length() < 5) {
//                        etName.setError("Failed");
//                    } else {
//                        // your code here
//                        etName.setError(null);
//                    }
//                }
//
//            }
//        });
    }

    public void ClickOk(View view)
    {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.record_enter);
        anim.setDuration(200);
//        okLayout.setAnimation(anim);
//        okLayout.startAnimation(anim);
        if (etName.getText().toString().trim().length() == 0) {
            etName.setError("Поле не может быть пустым");
        }
        else if(etName.getText().toString().trim().length() > 14)
        {
            etName.setError("Длина имени - не более 14 символов");
        }
        else
        {
            InputMethodManager imm = (InputMethodManager)getSystemService(
                    Context.INPUT_METHOD_SERVICE);
//txtName is a reference of an EditText Field
            imm.hideSoftInputFromWindow(etName.getWindowToken(), 0);
            Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        optional.setVisibility(View.GONE);
                    }
                }, 200);
            optional.setAnimation(anim);
            optional.startAnimation(anim);
            InsertNewScore();
        }
    }

    public void DisplayPicture()
    {
        int animalId = AnimalGradation.GetAnimalType(Globals.Score);
        ImageView imgViewTemp = (ImageView) findViewById(R.id.img_animal);
        imgViewTemp.setBackgroundResource(getResources().getIdentifier("animal_" + animalId, "drawable", this.getPackageName()));

    }

    public boolean IsInsertPossible()
    {
        if(Integer.valueOf(scoresArray[9]) < Globals.Score)
            return true;
        else
            return false;
    }

    public void InsertNewScore()
    {
        int i = 0;
        while(i < scoresArray.length && Integer.valueOf(scoresArray[i]) > Globals.Score){
            i++;
        }
        if(i < scoresArray.length){
            //you found a place to insert the score
            for(int j = scoresArray.length-1; j > i; j--){
                scoresArray[j] = scoresArray[j - 1];
                namesArray[j] = namesArray[j-1];
            }
            scoresArray[i] = String.valueOf(Globals.Score);
            namesArray[i] = etName.getText().toString();
        }
        preferences.SetHighscores(scoresArray);
        preferences.SetNames(namesArray);
    }

    public void PressClose(View view)
    {
//        if(optional.getVisibility() == View.VISIBLE)
//        {
//            InsertNewScore();
//        }
        Globals.GameAct.finish();
        finish();
    }

    public void PressRestart(View view)
    {
//        if(IsInsertPossible())
//        {
//            InsertNewScore();
//        }
        Globals.GameAct.finish();
        finish();
        startActivity(Globals.RestartingIntent);
    }

    @Override
    public void onBackPressed()
    {
        Globals.GameAct.finish();
        finish();
    }
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        if(MotionEvent.ACTION_OUTSIDE == event.getAction())
//        {
//            Globals.GameAct.finish();
//            finish();
//        }
//        return super.onTouchEvent( event);
//    }

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

    public void ShowRateUs()
    {
        Globals.TimesShown++;
        boolean s = preferences.AskForRate();
        if(preferences.AskForRate()) {

            if(Globals.TimesShown > 10) {
                Intent i = new Intent(ResultActivity.this, RateUsActivity.class);
                startActivity(i);
            }

        }
    }

    public void SetTypefaces()
    {
        TextView tvHeader = (TextView) findViewById(R.id.tvHeader);
        TextView tvYourScore = (TextView) findViewById(R.id.tvYourScore);
        TextView tvScore = (TextView) findViewById(R.id.tvScoresAmount);
        TextView tvNewHighscore = (TextView) findViewById(R.id.tvNewScore);
        TextView tvYourName = (TextView) findViewById(R.id.tvYourName);
        //EditText etName = (EditText) findViewById(R.id.etName);
        TextView tvOk = (TextView) findViewById(R.id.tvOk);
        //TextView tvDescription = (TextView) findViewById(R.id.tvDescription);
        TextView tvNewGame = (TextView) findViewById(R.id.tvNewGame);
        TextView tvBack = (TextView) findViewById(R.id.tvBack);

        tvHeader.setTypeface(Globals.DefaultTypeface);
        tvYourScore.setTypeface(Globals.DefaultTypeface);
        tvScore.setTypeface(Globals.DefaultTypeface);
        tvNewHighscore.setTypeface(Globals.DefaultTypeface);
        tvYourName.setTypeface(Globals.DefaultTypeface);
        etName.setTypeface(Globals.DefaultTypeface);
        tvOk.setTypeface(Globals.DefaultTypeface);
        tvDescription.setTypeface(Globals.DefaultTypeface);
        tvNewGame.setTypeface(Globals.DefaultTypeface);
        tvBack.setTypeface(Globals.DefaultTypeface);
    }
}
