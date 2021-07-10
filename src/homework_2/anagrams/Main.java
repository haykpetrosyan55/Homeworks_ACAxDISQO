package homework_2.anagrams;

import java.util.Scanner;

public class Main {

    private static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()){
            return false;
        }
        a = a.toUpperCase();
        b = b.toUpperCase();
        StringBuilder sb = new StringBuilder(b);
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < sb.length(); j++) {
                if(a.charAt(i) == sb.charAt(j)){
                    sb = sb.deleteCharAt(j);
                    break;
                }
            }
        }
        return sb.length() == 0;
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
