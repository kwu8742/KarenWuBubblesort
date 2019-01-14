package com.company;

public class BubbleSort {
    public static void bubbleSort(int[] Arr)
    {
        while (checkList(Arr))
        {
            for (int i = 0; i < Arr.length; i++)
            {
                if (Arr[i] > Arr[i + 1])
                {
                    SortingUtil.swap(Arr, i + 0, i + 1);
                }
            }
        }
    }

    public static boolean checkList(int[] Arr)
    {
        for (int x = 0; x < Arr.length; x++)
        {
            if (Arr[x] > Arr[x+1])
            {
                return true;
            }
        }
        return false;
    }
}
