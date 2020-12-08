package vn.edu.hcmus.fit.lab02;

import java.util.Scanner;

public class Exercise16 {
    public static void Function16(){
        //input
        int n,x;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n= ");
        n=scanner.nextInt();
        System.out.print("Enter x= ");
        x=scanner.nextInt();

        float S=0;
        for(float i=1;i<=n;i++)
            S=S+((x*i)/Exercise15.Sum(i));

        //output
        System.out.println("Exercise 15 - S(n) = " +S);
    }
    public static float Sum(float x)
    {
        int Sum=0;
        for(int i=1;i<=x;i++)
            Sum=Sum+i;
        return Sum;
    }
}
