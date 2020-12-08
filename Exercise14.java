package vn.edu.hcmus.fit.lab02;

import java.util.Scanner;

public class Exercise14 {
    public static void Function14(){
        //input
        int n,x;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n= ");
        n=scanner.nextInt();
        System.out.print("Enter x= ");
        x=scanner.nextInt();

        int T=x;
        int tmp=x;
        for(int i=2;i<=n;i++)
        {
            tmp=tmp*x*x;
            T=T+tmp;
        }

        //output
        System.out.println("Exercise 14 - T(x,n) = " +T);
    }
}
