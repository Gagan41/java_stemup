package Assignments.A1;
import java.util.*;
public class SearchElementIn2D {

    static int[][] searchInMatrix(int[][] mat,int target){
        int row= mat.length;
        int col= mat[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==target){
                    return new int[][]{{i,j}};
                }
            }
        }
        return new int[][]{{-1,-1}};
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr={{1,2,3},{2,3,4},{6,7,8}};
        int target=sc.nextInt();
        System.out.println("The idx of the element is : "+ searchInMatrix(arr,target));
    }

}
