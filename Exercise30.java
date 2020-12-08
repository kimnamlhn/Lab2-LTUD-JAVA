package vn.edu.hcmus.fit.lab02;

public class Exercise30 {
    public static void Function30(){
        String[] stringName = {"cat", "flag", "green", "country", "w3resource"};
        String longestName = getLongestString(stringName);
        System.out.print(longestName);
    }
    public static String getLongestString(String[] array)
    {
        int index = 0;
        int elementLength = array[0].length();
        for(int i=1; i< array.length; i++) {
            if(array[i].length() > elementLength) {
                index = i; elementLength = array[i].length();
            }
        }
        return array[index];
    }

}
