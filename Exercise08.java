package vn.edu.hcmus.fit.lab02;

import java.util.Scanner;

public class Exercise08 {
    public static void Function08(){
        //input
        int n;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.print("Enter (n>5) n= ");
            n=scanner.nextInt();
        }while(n<=5);

        float S=0;
        for(float i=0;i<=n;i++)
            S=S+(2*i+1)/(2*i+2);
        //output
        System.out.println("Exercise 08 - S(n) = " +S);
    }
}
