package com.company;

/**
 * Created by Mati on 2017-04-18.
 */
 class MergeSort {
    private final int[] array;

    public MergeSort(int[] _array) {
        array = new int[_array.length];
        System.arraycopy(_array, 0, array, 0, _array.length );
    }

    public long sort() {
        int[] arr2 = new int[array.length];
        long beginSort = System.nanoTime();
        auxsort(array, arr2, 0, array.length-1);
        return System.nanoTime() - beginSort;
    }

    void auxsort(int arr[], int arrAux[], int begin, int end) {
        if (begin < end) {
            int middle = (begin + end) / 2;
            auxsort(arr, arrAux, begin, middle);
            auxsort(arr, arrAux, middle + 1, end);
            mergeArr(arr, arrAux, begin, middle, end);

        }
    }


    void mergeArr( int [] arr, int[] arr2, int begin, int middle, int end) {
        for (int i = begin; i <= end; i++) {
            arr2[i] = arr[i];
        }
        int _begin=begin, _middle=middle+1,k=begin;
        while(_begin<=middle && _middle<=end) {
            if (Comparator.compare(arr2[_begin], arr2[_middle]) >= 0)
                arr[k++] = arr2[_begin++];
            else
                arr[k++] = arr2[_middle++];
        }

        while (_begin <= middle) {
            arr[k++] = arr2[_begin++];
        }

        }
    }
