package vn.edu.hcmus.fit.lab02;

import java.util.Scanner;

public class Exercise04 {
    public static void Function04(){
        //input
        int n;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.print("Enter (n>9) n= ");
            n=scanner.nextInt();

        }while(n<=9);

        float S=0;
        for(float i=1;i<=n;i++)
            S=S+1/(2*i);
        //output
        System.out.println("Exercise 04 - S(n) = " +S);
    }
}
