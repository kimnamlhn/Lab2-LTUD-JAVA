package vn.edu.hcmus.fit.lab02;

import java.util.Scanner;

public class Exercise11 {
    public static void Function11(){
        //input
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n= ");
        n=scanner.nextInt();

        int S=0;
        int tmp=1;
        for(int i=1;i<=n;i++)
        {
         tmp=tmp*i;
         S=S+tmp;
        }
        //output
        System.out.println("Exercise 11 - S(n) = " +S);
    }

}
