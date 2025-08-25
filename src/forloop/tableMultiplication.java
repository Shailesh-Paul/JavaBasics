package forloop;

import java.util.Scanner;

public class tableMultiplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter multiplication number:");
        int n= sc.nextInt();


        for(int i=n; i<=n*10;i+=n){

            System.out.println("Table is :" + i);

        }

    }
}

