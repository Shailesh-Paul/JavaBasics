package forloop;

import java.util.Scanner;

public class arithemeticProgression {
    public static void main(String[] args) {
//        user input
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n term: ");
        int n= sc.nextInt();
//1 3 5 7 9 11 13 15 17 ..... upto  n terms
        for(int i=1; i<=(2*n-1) ; i+=2){
            System.out.println(i);
        }
    }
}
