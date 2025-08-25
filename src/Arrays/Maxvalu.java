package Arrays;

import java.util.Scanner;

//Method 1
public class Maxvalu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of Array:");
        int n= sc.nextInt();
    int[] arr= new int[n];
        System.out.println("Enter the elements of Array");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();

        }
        int max=-1;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            System.out.println(max);
        }

    }


}
