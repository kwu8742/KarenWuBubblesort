package com.company;

public class SelectionSort {
    public static int[] selectionSort(int[] Arr)
    {
        int min = 0;
        for(int i = 0; i < Arr.length; i++) {
            min = i;
            for (int k = 1; k < Arr.length - 1; k++) {
                if (Arr.length[min] > Arr[i + k]) {
                    min = i + k;
                }
            }
            SortingUtils.swap(Arr, i, min);
        }
        return Arr;
    }
}
