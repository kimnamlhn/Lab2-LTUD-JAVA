package vn.edu.hcmus.fit.lab02;

import java.util.Scanner;

public class Exercise12 {

    public static void Function12(){
        //input
        int n,x;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n= ");
        n=scanner.nextInt();
        System.out.print("Enter x= ");
        x=scanner.nextInt();

        int T=0;
        int tmp=1;
        for(int i=1;i<=n;i++)
        {
            tmp=tmp*x;
            T=T+tmp;
        }

        //output
        System.out.println("Exercise 12 - T(x,n) = " +T);
    }
}
