package vn.edu.hcmus.fit.lab02;

import java.util.Scanner;

public class Exercise20 {
    public static void Function20(){
        //input
        int n,x;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter n= ");
        n=scanner.nextInt();
        System.out.print("Enter x= ");
        x=scanner.nextInt();

        float S=1;
        for(float i=0;i<=n;i++)
            S=S+ (((2*i+1)*x)/factorial(i));
        //output
        System.out.print("Exercise 20 - S(n) = " +S);
    }
    static float factorial(float n)
    {
        if(n==0)
            return 1;
        float fac=1;
        for(int i=1;i<n;i++)
            fac=fac*i;
        return fac;
    }
}
