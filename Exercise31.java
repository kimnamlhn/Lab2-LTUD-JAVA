package vn.edu.hcmus.fit.lab02;

public class Exercise31 {
    public static void Function31()
    {
        String tmp="Green";
        int n= tmp.length();

        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++)
            {
                if(tmp.indexOf(i)==tmp.indexOf(j)){
                    System.out.print("false");
                    return;
                }
            }
        }
        System.out.print("true");
        return;
    }

}
