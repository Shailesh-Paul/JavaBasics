package TwoDimArrays;

public class sumOfAllElements {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2= {{1,2,3},{4,5,6},{7,8,9}};
        int sum1=0;


        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length;j++){
                sum1 += arr[i][j];
            }
        }
        System.out.println(sum1);
    }
}
