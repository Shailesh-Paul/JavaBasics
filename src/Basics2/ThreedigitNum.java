package Basics2;

import java.util.Scanner;

public class ThreedigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        if(n>99 && n<999){
            System.out.println("Number is 3 digit");

        }else{
            System.out.println("Number is not 3 didit");
        }
    }
}
