package WhileLoop;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        int count=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number greaterr than 0");

        int x= sc.nextInt();

        while(x>0){
             x= x/10;
            count++;

        }
        System.out.println("No of digits :"+ count);

    }
}
