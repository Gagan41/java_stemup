package Searching;

public class Array2DLinearSerach {
    public static void main(String[] args) {
        int[][] matrix={ {3,8,12}, {14,18,20}, {23,27,30}};
        int key = 18;
        boolean found = false;
        System.out.println("searching in 2D array: ");
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.println("Checking position ["+i+"]["+j+"]");
                if(matrix[i][j]==key){
                    System.out.println("key found at index ["+i+"]["+j+"]");
                    found = true;
                    break;
                }
            }
            if(found) break;
        }
        if(!found) System.out.println("kay not found in matrix");
    }
}
