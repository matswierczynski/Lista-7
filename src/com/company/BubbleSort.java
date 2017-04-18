package com.company;

import java.lang.reflect.Array;

/**
 * Bubble sort
 */
public class BubbleSort {
    private int [] array;
    public BubbleSort(int [] _array){
        array = new int[_array.length];
        System.arraycopy(_array,0,array,0,_array.length);
    }

    public long sort(){

        long beginSort = System.nanoTime();

        for (int i=1;i<array.length;i++)
            for(int k=0;k<array.length-i;k++)
            {
                if (Comparator.compare(array[k],array[k+1])==-1)
                    swap(k,k+1);
            }
        return System.nanoTime()-beginSort;

    }


    private void swap(int leftIndex, int rightIndex){
        int temp = array[leftIndex];
        array[leftIndex]=array[rightIndex];
        array[rightIndex]=temp;
    }
}
