package com.company;

import java.util.Arrays;

class Main
{
    public static void findPair(int[] arr, int sum)
    {
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;

        while (low < high)
        {
            if (arr[low] + arr[high] == sum) {
                System.out.println("Pair found (" + arr[low] + ", " + arr[high] + ")");
            }
            if (arr[low] + arr[high] < sum) {
                low++;
            }
            else {
                high--;
            }
        }
        System.out.println("Pair not found");
    }

    public static void main (String[] args)
    {
        int[] arr = { 3, 9, 1, 6, 2, 5, 4, 2, 7, 8 };
        int sum = 5;

        findPair(arr, sum);
    }
}
