package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Mati on 2017-04-18.
 */
public class SortArray {
    private int [] randomArray;

    public SortArray(){
        rand(getSize());
    }

    private int getSize(){
        int size=0;
        while(size<500) {
            System.out.println("Podaj ilość liczb do wylosowania");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                size = scan.nextInt();
            }
        }

        return size;
    }

    private void rand (int size){
        randomArray = new int[size];
        Random rand = new Random();
        for (int i=0;i<size;i++)
            randomArray[i]=rand.nextInt();
    }

    public int [] getRandomArray(){ return randomArray;}
}
