package com.example.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] unsortedArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println(Arrays.toString(selectionSortOriginal(unsortedArray)));
    }

    private static int[] selectionSortOriginal(int[] unsortedArray) {


        for(int unsortedArrayLastIndex=unsortedArray.length-1; unsortedArrayLastIndex > 0; unsortedArrayLastIndex--) {
            int maxIndex = 0;
            for(int index=1; index < unsortedArrayLastIndex; index++) {
                if(unsortedArray[index] > unsortedArray[maxIndex]) {
                    maxIndex = index;
                }
            }

            swapElement(unsortedArray, maxIndex, unsortedArrayLastIndex);
        }
        return unsortedArray;
    }

    private static void swapElement(int[] unsortedArray, int maxIndex, int lastIndex){
        int temp = unsortedArray[maxIndex];
        unsortedArray[maxIndex] = unsortedArray[lastIndex];
        unsortedArray[lastIndex] = temp;
    }
}
