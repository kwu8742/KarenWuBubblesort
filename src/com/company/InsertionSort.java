package com.company;

public class InsertionSort {
    public void insertionSort(int[] arr){
    for(int i = 0; i < arr.length; i++){
        for(int j = i; j > 0; j--){
            if(j - 1 > j){
                BubbleSort.swap(int[] arr, i, j);
            }
            j = 0;
        }
    }
    }
}
