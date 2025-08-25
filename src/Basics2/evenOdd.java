package Basics2;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("ENeter number");

        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("Given number " + n + " is Even");
        }
        else{
            System.out.println("Given number " + n + " is Odd");
        }
    }
}
