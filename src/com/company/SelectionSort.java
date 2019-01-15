package com.company;

public class SelectionSort {
    public static int[] selectionSort(int[] Arr)
    {
        int min = 0;
        for(int i = 0; i < Arr.length; i++) {
            for (int k = 0; k < Arr.length - 1; k++) {
                if (min > Arr[k + 1]) {
                    SortingUtils.swap(Arr, k, k + 1);
                }
            }
        }
        return Arr;
    }
}
