package Homework_2.String_Methods;

import Homework_2.String_Methods.util.StringUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(StringUtil.lengthCalculator(A, B));
        System.out.println(StringUtil.isGreater(A, B));
        System.out.println(StringUtil.capTheFirst(A, B));
        System.out.println((StringUtil.isAnagram(A, B)) ? "Anagrams" : "Not Anagrams" );
    }
}
