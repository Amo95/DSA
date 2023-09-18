package com.example.sorting;

import java.util.Arrays;

public class BubbleSort {


    private static int[] bubbleSort(int[] sortingArray) {
        for(int index=0; index < sortingArray.length; index++){
            singleCodePass(sortingArray);
        }

        return sortingArray;
    }

    private static void singleCodePass(int[] unsortedArray) {
        for(int initialIndex=0; initialIndex < unsortedArray.length -1; initialIndex++){
            int nextIndex = initialIndex + 1;
            if(unsortedArray[initialIndex] > unsortedArray[nextIndex]) {
                swapElements(unsortedArray, initialIndex, nextIndex);
            }
        }
    }

    private static void swapElements(int[] unsortedArray, int initialIndex, int nextIndex) {
        int temp = unsortedArray[initialIndex];
        unsortedArray[initialIndex] = unsortedArray[nextIndex];
        unsortedArray[nextIndex] = temp;
    }

    private static int[] bubbleSortOriginal(int[] unsortedArray){
        for(int lastIndex = unsortedArray.length-1; lastIndex > 0; lastIndex--){
            for(int index=0; index < lastIndex; index++ ){
                if(unsortedArray[index] > unsortedArray[index+1]) {
                    swapElements(unsortedArray, index, index + 1);
                }
            }
        }

        return unsortedArray;
    }


    public static void main(String[] args) {
        int[] unsortedArr = {20, 0, 7, 70, 55, -1, 55};
        System.out.println(Arrays.toString(bubbleSortOriginal(unsortedArr)));
    }
}
