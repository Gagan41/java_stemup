package Assignments.A1;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int total=0;
        int r=matrix.length;
        int c=matrix[0].length;
        int Tr=0 ,Rc=c-1 ,Br=r-1 ,Lc=0;
        while(total < r*c){
            for(int j=Lc ;j<=Rc && total < r*c ;j++){
                ans.add(matrix[Tr][j]);
                total++;
            }
            Tr++;
            for(int i=Tr ;i<=Br && total < r*c ;i++ ){
                ans.add(matrix[i][Rc]);
                total++;
            }
            Rc--;
            for(int j=Rc;j>=Lc && total < r*c; j-- ){
                ans.add(matrix[Br][j]);
                total++;
            }
            Br--;
            for(int i=Br ;i>=Tr && total < r*c;i--){
                ans.add(matrix[i][Lc]);
                total++;
            }
            Lc++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans = SpiralMatrix.spiralOrder(matrix);
        System.out.println(ans);
    }
}






