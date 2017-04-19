package com.company;

/**
 * Created by Mati on 2017-04-18.
 */
class HeapSort {
    private final int [] array;
    public HeapSort(int [] _array){
        array = new int[_array.length];
        System.arraycopy(_array,0,array,0,_array.length);
    }

    long sort()
    {
        long begin =System.nanoTime();
        heapAdjustment(array, array.length);
        for(int i=array.length-1;i>0;i--)
        {
            swap(i,0);
            heapify(array,0,i);
        }
        return System.nanoTime()-begin;
    }

    void heapAdjustment(int [] heap, int n){
        for (int i=(n-1)/2;i>=0;i--) //a node with index i has a parent with index (i-1)/2
        heapify(heap,i,n);
    }


    void heapify(int heap[],int idx, int n)
    {
        int idxOfBigger=2*idx+1; //a node with index i has two children with indexes 2*i+1 and 2*i+2
        if(idxOfBigger<n)
        {
            if(idxOfBigger+1<n && heap[idxOfBigger]<heap[idxOfBigger+1]) //which children is greater
                idxOfBigger++;
            if(heap[idx]<heap[idxOfBigger]) //if parent is smaller than children - swap
            {
                swap(idx,idxOfBigger);
                heapify(heap,idxOfBigger,n);
            }
        }
    }

    private void swap (int source, int swapSource){
        int temp=array[source];
        array[source]=array[swapSource];
        array[swapSource]=temp;
    }

    
}
