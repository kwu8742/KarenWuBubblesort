package com.company;

public class SortingUtils {
    public static void swap(int[] Arr, int i, int j)
    {
        int temp = Arr[i];
        Arr[i] = Arr[j];
        Arr[j] = temp;
    }

    public static boolean isSorted(int[]Arr)
    {
        for (int n = 0; n < Arr.length - 1; n++) {
            if (Arr[n] > Arr[n + 1]) {
                swap(Arr, n, n + 1);
            }
        }
        return true;
    }

    public static int[] randIntArr(int count)
    {
        for(int)
        return (int) Math.random() * 10000;
    }

    public static void checkSum(int[] before, int[] after)
    {

    }
}
