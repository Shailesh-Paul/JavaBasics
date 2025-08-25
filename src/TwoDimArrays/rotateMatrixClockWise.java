package TwoDimArrays;

public class rotateMatrixClockWise {
    public static void print(int[][] arr) {
        int m= arr.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int m= arr.length,n=arr[0].length;
        print(arr);

        for(int i=0;i<m;i++ ){
            for(int j=0;j<=i;j++){
                int temp= arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }
        print(arr);

//        reverse the array

        for(int i=0; i<m;i++){
            int start=0, end=m-1;
//            swap arr[i][a] and arr[i][b]

           while(start<end){
               int temp =arr[i][start];
               arr[i][start]=arr[i][end];
               arr[i][end]=temp;
               start++;
               end--;
           }
        }
print(arr);
    }
}
