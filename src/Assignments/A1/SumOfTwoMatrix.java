package Assignments.A1;

public class SumOfTwoMatrix {
    public static int[][] sumMat(int[][] arr1,int[][] arr2){
        if(arr1.length!= arr2.length ||arr1[0].length!=arr2[0].length){
            return new int[][] {};
        }
        int row= arr1.length;
        int col= arr1[0].length;
        int[][] matrix=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int sum=arr1[i][j]+arr2[i][j];
                matrix[i][j]=sum;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[][] arr1={{1,2,3},{2,3,4},{6,7,8}};
        int[][] arr2={{2,3,4},{6,7,8},{1,2,3}};
        int[][] answer= sumMat(arr1,arr2);

    }
}
