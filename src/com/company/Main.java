package com.company;

public class Main {

    public static void main(String[] args) {
	SortArray sortArray = new SortArray();
	System.out.println(new BubbleSort(sortArray.getRandomArray()).sort());
    }
}
