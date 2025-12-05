package Strings;

import java.util.Scanner;

public class IntToSting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int n= sc.nextInt();

        String s="";
        s+=n;
        System.out.println(s );
        System.out.println(s.getClass());

    }
}
