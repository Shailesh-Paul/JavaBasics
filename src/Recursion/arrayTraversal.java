package Recursion;

public class arrayTraversal {
    public static  void print(int i, int[] arr){
        if(i==arr.length) return;
        System.out.println(arr[i]+" ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        int[] arr= {1,3,5,7,9,11};
        print(0,arr);
    }
}
