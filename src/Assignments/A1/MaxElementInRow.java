package Assignments.A1;

public class MaxElementInRow {
    public static void largestEler(int [][] arr){
        int n = arr.length, m = arr[0].length;
        for(int i=0; i<n; i++){
            int maxEle = arr[i][0];
            for( int j=1; j<m; j++){ // start from 1, since 0 is already used
                if(arr[i][j]>=maxEle){
                    maxEle = arr[i][j];
                }
            }
            System.out.println("Max element in the row "+i+" is:"+maxEle);
        }
    }

    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        largestEler(arr);
    }
}
