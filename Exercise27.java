package vn.edu.hcmus.fit.lab02;

import java.util.Arrays;

public class Exercise27 {
    public static void search(int[] arr, int low, int high)
    {
        if(low > high)
            return;
        if(low == high)
        {
            System.out.println("Exercise 27 - Element appears once in array is: "+arr[low]);
            return;
        }

        int mid = (low + high)/2;

        if(mid % 2 == 0)
        {
            if(arr[mid] == arr[mid+1])
                search(arr, mid+2, high);
            else
                search(arr, low, mid);
        }
        // If mid is odd
        else if(mid % 2 == 1)
        {
            if(arr[mid] == arr[mid-1])
                search(arr, mid+1, high);
            else
                search(arr, low, mid-1);
        }
    }

    public static void Function27()
    {
        int[] arr = {1, 1, 2, 4, 4, 5, 5, 6, 6};
        search(arr, 0, arr.length-1);
    }
}
