package forloop;

import java.util.Scanner;

public class allEvenNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number you want to print");
        int n= sc.nextInt();
        for(int i=2;i<=n;i+=2){

                System.out.println(i);

        }
    }

    }


