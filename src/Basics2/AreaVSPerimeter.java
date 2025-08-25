package Basics2;

import java.util.Scanner;

public class AreaVSPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length in cm");
        int length = sc.nextInt();
        System.out.println("Enter breadth in cm");
        int breadth= sc.nextInt();

        int area = length*breadth;
        int perimeter= 2*(length+ breadth);

        System.out.println("Area"+ area);
        System.out.println("Perimeter:" + perimeter);

        if(area>perimeter){
            System.out.println("area is greater");
        }
        else{
            System.out.println("perimeter is greater");
        }


    }
}
