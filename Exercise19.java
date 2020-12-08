package vn.edu.hcmus.fit.lab02;

import java.util.Scanner;

public class Exercise19 {
    public static void Function19(){
        //input
        float n,x;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n= ");
        n=scanner.nextInt();
        System.out.print("Enter x= ");
        x=scanner.nextInt();

        float S=1;
        for(float i=1;i<n;i++)
            S=S+((x*2*i)/(Exercise19.factorial(2*i)));


        //output
        System.out.println("Exercise 19 - S(x,n) = " +S);
    }
    static float factorial(float n)
    {
        if(n==0)
            return 1;
        float fac=1;
        for(int i=1;i<n;i++)
            fac=fac*i;
        return fac;
    }

}
