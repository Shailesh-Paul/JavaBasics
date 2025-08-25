package Basics2;

import java.util.Scanner;

public class greatestThreeNestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number");
        int num1= sc.nextInt();

        System.out.println("Enter second number");
        int num2= sc.nextInt();

        System.out.println("Enter third number:");
        int num3= sc.nextInt();



        if(num1>num2){
            if (num1>num3){
                System.out.println(num1+ "is greatest");
            }else{
                System.out.println(num2 + " is greatest");
            }
        }else{
            if(num2>num3){
                System.out.println(num2 +"is greatest");
            }else{
                System.out.println(num3 + "is greatest");
            }
        }
    }
}
