package Homework_2.Task_1_Anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static boolean isAnagram(String a, String b) {
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

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
