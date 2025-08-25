package TwoDimArrays;

public class sumTwoDArrays {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int m= arr.length, n= arr[0].length;
        int[][] res = new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               res[i][j]= arr[i][j] + arr2[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");

            }
            System.out.println();

        }
    }
}