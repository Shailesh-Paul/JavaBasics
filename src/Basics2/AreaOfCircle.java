package Basics2;


import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        System.out.println("Enter radius");
        Scanner sc= new Scanner(System.in);
        double r;
        r = sc.nextDouble();

        double area= 3.14*r*r;

        System.out.println("The total area of given radius: "+area);


    }
}
