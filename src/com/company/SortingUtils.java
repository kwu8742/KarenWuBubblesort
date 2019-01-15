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

    public static int[] randomIntArr(int count)
    {
        int[] randomIntArr = new int[count];
        for(int n = 0; n < count - 1; n++){
            randomIntArr[n] = (int)(Math.random() * 10001);
        }
        return randomIntArr;
    }

    public static boolean checkSum(int[] before, int[] after) {
        int beforesum = 0;
        int aftersum = 0;
        for (int b = 0; b < before.length; b++) {
            beforesum = beforesum + before[b];
        }
        for (int a = 0; a < after.length; a++) {
            aftersum = aftersum + after[a];
        }
        if (aftersum == beforesum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
