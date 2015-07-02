package com.dailyappslab.etc;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by GreenQ on 27.06.2015.
 */
public class ColorsHandler {
    
    public static int ReduceColorOpacity(int color, int reduceAmount) {
//        Random rand = new Random();
//
//        int a = rand.nextInt(255);
//        int r = rand.nextInt(255);
//        int g = rand.nextInt(255);
//        int b        = rand.nextInt(255);


        return Color.argb(Color.alpha(color) - reduceAmount, Color.red(color), Color.green(color), Color.blue(color));

        //Color.argb()
        //Color randomColor = new Color();
       // return Color.rgb(a, r, g, b);


       // int randNum = rand.nextInt(16777); // Generates a random number between 0x10 and 0x20
        //System.out.printf("%x\n",randNum); // Prints it in hex, such as "0x14"
// or....
        //return randNum; // Random hex number in result
    }

    public static int GetRandomColor()
    {
        Random rand = new Random();
//
        //int a = rand.nextInt(56);
        int r = rand.nextInt(155);
        int g = rand.nextInt(155);
        int b = rand.nextInt(155);

        return Color.argb(255, r + 55, g + 55, b + 55);
    }
}
