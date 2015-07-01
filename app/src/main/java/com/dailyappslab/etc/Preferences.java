package com.dailyappslab.etc;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Set;

/**
 * Created by GreenQ on 30.06.2015.
 */
public class Preferences {
    String defaultNames[] = {"Lisa", "Margo", "Helen", "Chewbacca", "Stewie", "Arno", "Dozer", "Mr.Proper", "Vladimir", "Noob"};
    String defaultScores[] = {"1000", "500", "100", "86", "77", "73", "65", "2", "1", "0"};
    SharedPreferences pHighscores;
    SharedPreferences pNames;

    Preferences(Context context)
    {
        pHighscores = context.getSharedPreferences("SCORES", Context.MODE_PRIVATE);
        pHighscores = context.getSharedPreferences("NAMES", Context.MODE_PRIVATE);
    }

    public void SetHighscores(String[] scores)
    {
        SharedPreferences.Editor editor = pHighscores.edit();
        //editor.putString("SCORES", defaultScores);
        editor.putInt("SCORES" +"_size", scores.length);
        for(int i=0;i<scores.length;i++)
            editor.putString("SCORES" + "_" + i, scores[i]);
        editor.commit();
    }

    public void SetNames(String[] scores)
    {
        SharedPreferences.Editor editor = pHighscores.edit();
        //editor.putString("SCORES", defaultScores);
        editor.putInt("NAMES" +"_size", scores.length);
        for(int i=0;i<scores.length;i++)
            editor.putString("NAMES" + "_" + i, scores[i]);
        editor.commit();
    }

    public String[] GetHighscores()
    {
        int size = pHighscores.getInt("SCORES" + "_size", 10);
        String array[] = new String[size];
        for(int i=0;i<size;i++)
            array[i] = pHighscores.getString("SCORES" + "_" + i, defaultScores[i]);
        return array;
    }

    public String[] GetNames()
    {
        int size = pHighscores.getInt("NAMES" + "_size", 10);
        String array[] = new String[size];
        for(int i=0;i<size;i++)
            array[i] = pHighscores.getString("NAMES" + "_" + i, defaultNames[i]);
        return array;
    }
}