package vn.edu.hcmus.fit.lab02;

import java.util.Scanner;

public class Exercise02 {
    public static void Function02(){
        //input
        int n;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.print("Enter (n<=5 && n<= 20) n= ");
            n=scanner.nextInt();

        }while(n>5&&n>20);

        int S=0;
        for(int i=1;i<=n;i++)
            S=S+i*i;
        //output
        System.out.println("Exercise 02 - S(n) = " +S);
    }
}
