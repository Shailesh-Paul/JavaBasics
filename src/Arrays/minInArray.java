package Arrays;

public class minInArray {
    public static void main(String[] args) {
        int arr[]={70,20,30,40,50,60};

        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }System.out.println(min);
    }
}
