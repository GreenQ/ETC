package com.dailyappslab.etc;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by GreenQ on 01.07.2015.
 */
public class ResultActivity extends Activity {

    RelativeLayout optional;
    EditText etName;
    String[] scoresArray;
    String[] namesArray;
    Preferences preferences;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);

       // getWindow().setFlags(ActionBar.LayoutParams.FLAG_NOT_TOUCH_);
        setContentView(R.layout.result);
        preferences = new Preferences(this);
        scoresArray = preferences.GetHighscores();
        namesArray = preferences.GetNames();
        optional = (RelativeLayout) findViewById(R.id.optional);
        etName = (EditText) findViewById(R.id.input_name);
        DisplayPicture();
        setFinishOnTouchOutside(false);

        if(IsInsertPossible())
            optional.setVisibility(View.VISIBLE);

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
        if(IsInsertPossible())
        {
            InsertNewScore();
        }
        Globals.GameAct.finish();
        finish();
    }

    public void PressRestart(View view)
    {
        if(IsInsertPossible())
        {
            InsertNewScore();
        }
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
}
