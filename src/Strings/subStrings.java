package Strings;

import java.util.Scanner;

public class subStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        int n = s.length();
        for (int i = 0; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                System.out.println(s.substring(i, j));
            }
        }


    }
}
