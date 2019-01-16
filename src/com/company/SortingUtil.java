package com.company;

public class SortingUtil {
    public static void swap(int[] Arr, int i, int j)
    {
        int temp = Arr[i];
        Arr[i] = Arr[j];
        Arr[j] = temp;
    }

    public static int[] randomIntArr(int count)
    {
        int[] randomIntArr = new int[count];
        for(int n = 0; n < count - 1; n++) {
            randomIntArr[n] = (int) (Math.random() * 10000);
        }
        return randomIntArr;
    }
}
