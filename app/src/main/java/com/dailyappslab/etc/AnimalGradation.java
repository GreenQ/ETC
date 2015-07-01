package com.dailyappslab.etc;

import android.view.View;

/**
 * Created by GreenQ on 01.07.2015.
 */
public class AnimalGradation {

    /*
    0 - woman;
    1 - predator;
    2 - eagle;
    3 - panther;
    4 - wolf;
    5 - O_X pirate;
    6 - ant;
    7 - mole;
     */
    public static int GetAnimalType(int score)
    {
        if(score >= 95)
        {
            return 0; // woman
        }
        else if(score >= 75)
        {
            return 1; // predator
        }
        else if(score >= 55)
        {
            return 2; // eagle
        }
        else if(score >= 37)
        {
            return 3; // panther
        }
        else if(score >= 22)
        {
            return 4; // wolf
        }
        else if(score >= 12)
        {
            return 5; // o_x pirate
        }
        else if(score >= 5)
        {
            return 6; // ant
        }
        else if(score >= 0)
        {
            return 7; // mole
        }

        return 7;
    }
}
