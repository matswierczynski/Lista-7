package com.company;

/**
 * Created by Mati on 2017-04-18.
 */
class SelectSort {
    private final int [] array;
    public SelectSort(int [] _array){
        array = new int[_array.length];
        System.arraycopy(_array,0,array,0,_array.length);
    }


    public long sort()
    {
        long beginSort = System.nanoTime();
        int i,j,minIdx,minElem;
        for(i=0;i<array.length-1;i++)
        {
            minIdx=i; // minimum search
            minElem=array[i];
            for(j=i;j<array.length;j++)
                if(array[j]<minElem)
                {
                    minElem=array[j];
                    minIdx=j;
                }
            array[minIdx]=array[i];
            array[i]=minElem;

        }
        return System.nanoTime()-beginSort;
    }
}
