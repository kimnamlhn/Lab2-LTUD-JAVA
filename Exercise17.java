package vn.edu.hcmus.fit.lab02;

import java.util.Scanner;

public class Exercise17 {
    public static void Function17()
    {
        //input
        int n;
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter n= ");
        n=scanner.nextInt();
        int S=1;

        for(int i=1;i<=n;i++)
            S=S*i;
        //output
        System.out.print("Exercise 17 - S(n)= "+S);
    }
}
