package vn.edu.hcmus.fit.lab02;

import java.util.Scanner;

public class Exercise01 {
    public static void Function01(){
        //input
        int n;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.print("Enter (3 < n < 50) n= ");
            n=scanner.nextInt();

        }while(n<3||n>50);

        int S=0;
        for(int i=1;i<=n;i++)
            S=S+i;
        //output
        System.out.println("Exercise 01 - S(n) = " +S);
    }
}
