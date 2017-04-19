package com.company;

/**
 Returns 1 if right is greater than left, -1 if right is smaller than left,
 0 if elements are equal
 */
 final class Comparator {
    public static int compare (int left, int right){
        return left < right ? 1 : left > right ? -1 :  0;
    }
}
