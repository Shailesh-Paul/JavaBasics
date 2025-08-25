package Basics2;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter x-axis  point ");
        int x= scanner.nextInt();

        System.out.println("Enter y-axis point");
        int y= scanner.nextInt();
        
        if(x>0 && y>0){
            System.out.println("Points lies in 1st Quadrant");
        } else if (x<0 && y>0) {
            System.out.println("Points lies in 2nd Quadrant");
            
        } else if (x<0 && y<0) {
            System.out.println("Points lies in 3rd Quadrant");

        }else if(x>0 && y<0){
            System.out.println("Points lies in the 4th quadrant");
        }else{
            System.out.println("Points are at Origin");
        }

    }
}
