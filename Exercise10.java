package vn.edu.hcmus.fit.lab02;

import java.util.Scanner;


public class Exercise10 {
    public static void Function10(){
        //input
        double n,x;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n= ");
        n=scanner.nextDouble();
        System.out.print("Enter x= ");
        x=scanner.nextDouble();

        double T=0;
        T= Math.pow(x,n);

        //output
        System.out.println("Exercise 10 - T(x,n) = " +T);
    }

}
