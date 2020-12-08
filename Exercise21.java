package vn.edu.hcmus.fit.lab02;

import java.util.Scanner;

public class Exercise21 {
    public static void Function21(){
        //input
        int col,row;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter column = ");
        col=scanner.nextInt();
        System.out.print("Enter row = ");
        row=scanner.nextInt();
        int[][] myMatrix= new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter matrix["+i+"]["+j+"]= ");
                myMatrix[i][j]=scanner.nextInt();
            }
        }


        //output
        System.out.println("Exercise 21 - Matrix: ");
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                System.out.print(myMatrix[i][j]+" ");
    }
}
