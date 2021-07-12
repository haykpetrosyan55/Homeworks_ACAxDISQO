package Homework_2.String_Methods.util;

import java.util.Arrays;

public class StringUtil {
    public static int lengthCalculator(String a, String b){
        return a.length() + b.length();
    }

    public static String isGreater(String a, String b) {
        if (a.compareTo(b) > 0) {
            return  "Yes";
        } else {
            return  "No";
        }
    }

    public static String capTheFirst(String a, String b){
        return a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1).toUpperCase() + b.substring(1);
    }

    public static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()){
            return false;
        }
        a = a.toUpperCase();
        b = b.toUpperCase();
        char [] aArr = a.toCharArray();
        char [] bArr = b.toCharArray();
        Arrays.sort(aArr);
        Arrays.sort(bArr);
        return Arrays.equals(aArr, bArr);
    }
}
