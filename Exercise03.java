package vn.edu.hcmus.fit.lab02;

import java.util.Scanner;

public class Exercise03 {
    public static void Function03(){
        //input
        int n;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.print("Enter (n>=7) n= ");
            n=scanner.nextInt();

        }while(n<7);

        float S=0;
        for(float i=1;i<=n;i++)
            S=S+1/i;
        //output
        System.out.println("Exercise 03 - S(n) = " +S);
    }
}
