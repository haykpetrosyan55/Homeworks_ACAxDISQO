package homework_2.Strings_Introduction;

import java.util.Scanner;

public class Main {

    private static String isGreater(String a, String b) {
        String isGreat;
        int size;

        if (a.length() > b.length()) {
            size = b.length();
            isGreat = "Yes";
        } else {
            size = a.length();
            isGreat = "No";
        }

        for (int i = 0; i < size; i++) {
            if(a.charAt(i) > b.charAt(i)){
                return "Yes";
            }else if(a.charAt(i) < b.charAt(i)){
                return "No";
            }
        }

        return isGreat;
    }

    private static String capTheFirst(String a, String b){
        return a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1).toUpperCase() + b.substring(1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());
        System.out.println(isGreater(A, B));
        System.out.println(capTheFirst(A, B));

    }
}
