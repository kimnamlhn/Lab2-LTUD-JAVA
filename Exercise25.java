package vn.edu.hcmus.fit.lab02;
import java.util.Arrays;

public class Exercise25 {
    public static int findIndex(int arr[], int t)
    {

        int index = Arrays.binarySearch(arr, t);
        if(index<0)
            return -1;
        return index;
    }

    public static void Function25()
    {
        int[] my_array = { 1, 2, 3, 4, 5, 6, 7 };

        System.out.println("Index position of 5 is: " + findIndex(my_array, 5));

    }
}
