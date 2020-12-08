package vn.edu.hcmus.fit.lab02;

import java.util.Scanner;

public class Exercise18 {
    public static void Function18(){
        //input
        float n,x;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n= ");
        n=scanner.nextInt();
        System.out.print("Enter x= ");
        x=scanner.nextInt();

        float S=0;
        for(float i=1;i<n;i++)
            S=S+((x*i)/(Exercise18.factorial(i)));


        //output
        System.out.println("Exercise 18 - S(x,n) = " +S);
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
