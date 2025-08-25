package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the target Element: ");
        int x = sc.nextInt();

        System.out.println("Enter size of array: ");
        int n= sc.nextInt();

        int[] arr= new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }

        boolean flag= false;
        for(int i=0; i<n;i++){
            if(arr[i]==x){
                flag=true;
                break;
            }
        }
        if(flag==true){
            System.out.println("Elements found");
        }else{
            System.out.println("Elements not found");
        }

    }
}
