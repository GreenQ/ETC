package com.dailyappslab.etc;

import java.util.Random;

/**
 * Created by GreenQ on 28.06.2015.
 */
public class RandomGenerator {

    public static String GetRandSquareName(int size)
    {
        Random rand = new Random();
//
        int column, row;
        //do {
            column = rand.nextInt((size - 1) + 1) + 1;
            //column = rand.nextInt(size);
        //} while(column < 0 && column >3);

        //do {
            row = rand.nextInt((size - 1) + 1) + 1;
        //} while(row < 0 && row > 3);

        //int row = rand.nextInt(size-1) + 1;
        return "iw" + size + "x" + size + "_" + String.valueOf(column) + String.valueOf(row);
    }
}
