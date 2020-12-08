package vn.edu.hcmus.fit.lab02;

import java.util.Scanner;

public class Exercise06 {
    public static void Function06(){
        //input
        int n;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.print("Enter (n>6) n= ");
            n=scanner.nextInt();
        }while(n<6);

        float S=0;
        for(float i=1;i<=n;i++)
            S=S+1/(i*(i+1));
        //output
        System.out.println("Exercise 06 - S(n) = " +S);
    }
}
