package Arrays;

import java.util.Scanner;

public class outputOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of araay");
    int n= sc.nextInt();
        int[] arr= new int[n];

         for(int i=0; i<=n-1; i++){
             arr[i]=sc.nextInt();
         }

         for(int i=0; i<=n-1; i++){
             System.out.println(arr[i]+ " ");
         }


    }
}
