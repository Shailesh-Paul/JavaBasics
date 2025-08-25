package Basics2;

import java.util.Scanner;

public class FiveDigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();


        if(n>9999 && n<999999){
            System.out.println("Number is 5 digit");
        }
        else{
            System.out.println("Number is not 5 digit");
        }
    }
}
