package com.dailyappslab.etc;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by GreenQ on 28.06.2015.
 */
public class HighscoresActivity extends Activity {
    Preferences preferences;
    String[] scores;
    String[] names;
    Button exit;

    TextView num_1;
    TextView num_2;
    TextView num_3;
    TextView num_4;
    TextView num_5;
    TextView num_6;
    TextView num_7;
    TextView num_8;
    TextView num_9;
    TextView num_10;

    TextView sc_1;
    TextView sc_2;
    TextView sc_3;
    TextView sc_4;
    TextView sc_5;
    TextView sc_6;
    TextView sc_7;
    TextView sc_8;
    TextView sc_9;
    TextView sc_10;

    ImageView animal_1;
    ImageView animal_2;
    ImageView animal_3;
    ImageView animal_4;
    ImageView animal_5;
    ImageView animal_6;
    ImageView animal_7;
    ImageView animal_8;
    ImageView animal_9;
    ImageView animal_10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.highscores);
        InstantiateViews();
        preferences = new Preferences(this);

        scores = preferences.GetHighscores();
        names = preferences.GetNames();

        //InsertNewResult();
        DisplayScores();
        DisplayNames();
    }

    public void InsertNewResult()
    {
        String tempName;
        String tempScore;
        String[] tempArrayScores;
        String[] tempArrayNames;

        tempArrayScores = scores;
        tempArrayNames = names;

        int newVal = 52;
        int i = 0;
        while(i < scores.length && Integer.valueOf(scores[i]) > newVal){
            i++;
        }
        if(i < scores.length){
            //you found a place to insert the score
            for(int j = scores.length-1; j > i; j--){
                scores[j] = scores[j - 1];
                names[j] = names[j-1];
            }
            scores[i] = String.valueOf(newVal);
            names[i] = "Work7";
        }
        preferences.SetHighscores(scores);
        preferences.SetNames(names);
    }

    public void DisplayScores()
    {
        TextView tempTextView;

        for(int i = 0; i < 10; i++)
        {
            tempTextView = (TextView) findViewById(getResources().getIdentifier("sc_" + (i+1), "id", this.getPackageName()));
            tempTextView.setText(scores[i]);
            DisplayPictures(AnimalGradation.GetAnimalType(Integer.valueOf(scores[i])), i);
        }
    }

    public void DisplayNames()
    {
        TextView tempTextView;

        for(int i = 0; i < 10; i++)
        {
            tempTextView = (TextView) findViewById(getResources().getIdentifier("place_" + (i+1), "id", this.getPackageName()));
            tempTextView.setText(names[i]);
        }
    }

    public void DisplayPictures(int animalId, int viewId)
    {
        ImageView imgViewTemp = (ImageView) findViewById(getResources().getIdentifier("img_high_" + (viewId + 1), "id", this.getPackageName()));
        imgViewTemp.setBackgroundResource(getResources().getIdentifier("animal_" + animalId, "drawable", this.getPackageName()));

    }

    public void InstantiateViews()
    {
        sc_1 = (TextView) findViewById(R.id.sc_1);
        sc_2 = (TextView) findViewById(R.id.sc_2);
        sc_3 = (TextView) findViewById(R.id.sc_3);
        sc_4 = (TextView) findViewById(R.id.sc_4);
        sc_5 = (TextView) findViewById(R.id.sc_5);
        sc_6 = (TextView) findViewById(R.id.sc_6);
        sc_7 = (TextView) findViewById(R.id.sc_7);
        sc_8 = (TextView) findViewById(R.id.sc_8);
        sc_9 = (TextView) findViewById(R.id.sc_9);
        sc_10 = (TextView) findViewById(R.id.sc_10);

        num_1 = (TextView) findViewById(R.id.place_1);
        num_2 = (TextView) findViewById(R.id.place_2);
        num_3 = (TextView) findViewById(R.id.place_3);
        num_4 = (TextView) findViewById(R.id.place_4);
        num_5 = (TextView) findViewById(R.id.place_5);
        num_6 = (TextView) findViewById(R.id.place_6);
        num_7 = (TextView) findViewById(R.id.num_7);
        num_8 = (TextView) findViewById(R.id.num_8);
        num_9 = (TextView) findViewById(R.id.num_9);
        num_10 = (TextView) findViewById(R.id.num_10);

        animal_1 = (ImageView) findViewById(R.id.img_high_1);
        animal_2 = (ImageView) findViewById(R.id.img_high_2);
        animal_3 = (ImageView) findViewById(R.id.img_high_3);
        animal_4 = (ImageView) findViewById(R.id.img_high_4);
        animal_5 = (ImageView) findViewById(R.id.img_high_5);
        animal_6 = (ImageView) findViewById(R.id.img_high_6);
        animal_7 = (ImageView) findViewById(R.id.img_high_7);
        animal_8 = (ImageView) findViewById(R.id.img_high_8);
        animal_9 = (ImageView) findViewById(R.id.img_high_9);
        animal_10 = (ImageView) findViewById(R.id.img_high_10);
    }
}
