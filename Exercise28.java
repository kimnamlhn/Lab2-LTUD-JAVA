package vn.edu.hcmus.fit.lab02;

public class Exercise28 {
    public static int removeDuplicateElements(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];

        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }

    public static void Function28 () {
        int arr[] = {1,1,2,2,3,3,3,2,4};
        int length = arr.length;
        length = removeDuplicateElements(arr, length);

        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");
    }
}
