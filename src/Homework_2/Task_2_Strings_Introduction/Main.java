package Homework_2.Task_2_Strings_Introduction;

import java.util.Scanner;

public class Main {

    private static String isGreater(String a, String b) {
        if (a.compareTo(b) > 0) {
            return  "Yes";
        } else {
            return  "No";
        }
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
