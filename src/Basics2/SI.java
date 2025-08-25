package Basics2;

import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter principle");
        double p = sc.nextDouble();
        System.out.println("Enter rate");
        double r= sc.nextDouble();

        System.out.println("Enter time in year");
        double t= sc.nextDouble();

        double SI = (p*r*t)/100;

        System.out.println("The total Simple interest is :" + SI);
    }
}
