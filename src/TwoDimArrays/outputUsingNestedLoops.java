package TwoDimArrays;

import java.util.Scanner;

public class outputUsingNestedLoops {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] arr= new int[3][3];

        int m= args.length;   //rows
       int n=arr[0].length;  // no of cols

//        input
        for(int i=0;i<m;i++){
            for(int j=0; j<n;j++){
                System.out.print("Enter Number: ");
                arr[i][j]=sc.nextInt();
            }
        }


//        output
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
