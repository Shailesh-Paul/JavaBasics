package forloop;

import java.util.Scanner;

public class printOneToN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number you want to print");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i +" ");
        }
    }
}
