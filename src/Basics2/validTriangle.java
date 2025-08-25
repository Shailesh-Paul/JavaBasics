package Basics2;

import java.util.Scanner;

public class validTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first side of triangle");
        int a= sc.nextInt();

        System.out.println("Enter second side of triangle ");
        int b= sc.nextInt();

        System.out.println("Enter thirdnside of triangle");
        int c= sc.nextInt();

        if((a+b)>c&& (b+c)>a && (a+c)>b){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Invalid Triangle");
        }
    }
}
