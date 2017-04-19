package com.company;

/**
 * Created by Mati on 2017-04-18.
 */
 class QuickSort {
 private final int [] array;
 public QuickSort(int [] _array){
  array = new int[_array.length];
  System.arraycopy(_array,0,array,0,_array.length);
 }


 void Quicksort(int arr[],int begin, int end){
  if(end-begin>1)
  {
   int pivot = arr[begin];
   int idxBigger = begin+1;
   int idxLower = end-1;
   int temp;

   do{ //the partitioning
    while (idxBigger <= idxLower && arr[idxBigger] <= pivot){
     idxBigger++;
    }
    while (arr[idxLower] > pivot){
     idxLower--;
    }
    if (idxBigger < idxLower) {
     temp = arr[idxBigger];
     arr[idxBigger] = arr[idxLower];
     arr[idxLower] = temp;
    }
   }while (idxBigger < idxLower);
   arr[begin] = arr[idxLower]; //put pivot in correct position
   arr[idxLower] = pivot;
   Quicksort(arr, begin, idxLower);
   Quicksort(arr, idxLower+1, end);
  }
 }
 long sort() {
  long begin = System.nanoTime();
  Quicksort(array,0,array.length);
  return System.nanoTime()-begin;
 }
}
