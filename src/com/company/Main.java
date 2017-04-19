package com.company;

 class Main {

    public static void main(String[] args) {
	SortArray sortArray = new SortArray();
	System.out.println(new BubbleSort(sortArray.getRandomArray()).sort());
	System.out.println(new InsertSort(sortArray.getRandomArray()).sort());
	System.out.println(new SelectSort(sortArray.getRandomArray()).sort());
	System.out.println(new MergeSort(sortArray.getRandomArray()).sort());
	System.out.println(new HeapSort(sortArray.getRandomArray()).sort());
	System.out.println(new QuickSort(sortArray.getRandomArray()).sort());
    }
}
