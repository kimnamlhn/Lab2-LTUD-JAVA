package vn.edu.hcmus.fit.lab02;

import java.util.Scanner;

public class Exercise05 {
    public static void Function05(){
        //input
        int n;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.print("Enter (n>=2) n= ");
            n=scanner.nextInt();

        }while(n<2);

        float S=0;
        for(float i=1;i<=n;i++)
            S=S+1/(2*i+1);
        //output
        System.out.println("Exercise 04 - S(n) = " +S);
    }
}
