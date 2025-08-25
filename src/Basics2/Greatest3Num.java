package Basics2;

import java.util.Scanner;

public class Greatest3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number");
        int num1= sc.nextInt();

        System.out.println("Enter second number");
        int num2= sc.nextInt();

        System.out.println("Enter third number:");
        int num3= sc.nextInt();

        if(num1==num2){
            System.out.println("Num1 and num2 is same ");
        }else if(num1==num3){
            System.out.println("Num1 and num3 are same");

        } else if (num2==num3) {
            System.out.println("num2 and num3 are same");

        }


        if(num1>=num2 && num1>=num3){
            System.out.println("First Number is greatest:" + num1);
        } else if (num2>=num1 && num2>=num3) {
            System.out.println("Second Number is greatest:" + num2);

        }if(num3>=num1 && num3>=num2){
            System.out.println("Third number is greatest");
        }
    }
}
