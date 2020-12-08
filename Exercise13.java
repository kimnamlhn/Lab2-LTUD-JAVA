package vn.edu.hcmus.fit.lab02;

import java.util.Scanner;

public class Exercise13 {
    public static void Function13(){
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
            tmp=tmp*x*x;
            T=T+tmp;
        }

        //output
        System.out.println("Exercise 13 - T(x,n) = " +T);
    }
}
