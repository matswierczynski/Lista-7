package com.company;

/**
 * Created by Mati on 2017-04-18.
 */
class InsertSort {
    private final int [] array;
    public InsertSort(int [] _array){
        array = new int[_array.length];
        System.arraycopy(_array,0,array,0,_array.length);
    }
    public long sort()
    {
        long beginSort = System.nanoTime();
        int i,j,k,elem;
        for(i=1;i<array.length;i++)
        {
            j=0;
            elem=array[i]; // i-th element will be added
            while(j<i && array[j]<=elem)// search first greater
                j++;
            for(k=i;k>j;k--) // shift elements
                array[k]=array[k-1];
            array[j]=elem;

        }

        return System.nanoTime()-beginSort;
    }
}
