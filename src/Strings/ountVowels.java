package Strings;

import java.util.Scanner;

public class ountVowels {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s= sc.nextLine();

        int n= s.length();
        int count =0;
        for(int i=0;i<n;i++){
            char ch= s.charAt(i);
            if(ch =='a' || ch=='A') count++;
            if(ch=='e' || ch=='E') count++;
            if(ch=='o' || ch=='O') count++;
            if(ch=='i' || ch=='I') count++;
            if(ch=='u' ||ch=='U') count++;

        }
        System.out.println(count);
    }




}
