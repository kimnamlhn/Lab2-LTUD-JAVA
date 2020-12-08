package vn.edu.hcmus.fit.lab02;

import java.util.Scanner;

public class Exercise09 {
    public static void Function09(){
        //input
        int n;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.print("Enter (n>6) n= ");
            n=scanner.nextInt();
        }while(n<=6);

        int S=1;
        for(int i=2;i<=n;i++)
            S=S*i;
        //output
        System.out.println("Exercise 09 - S(n) = " +S);
    }
}
