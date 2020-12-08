package vn.edu.hcmus.fit.lab02;

import java.util.Scanner;

public class Exercise07 {
    public static void Function07(){
        //input
        int n;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.print("Enter (n>=1) n= ");
            n=scanner.nextInt();
        }while(n<1);

        float S=0;
        for(float i=1;i<=n;i++)
            S=S+i/(i+1);
        //output
        System.out.println("Exercise 07 - S(n) = " +S);
    }
}
