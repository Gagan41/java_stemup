package JavaBasics.Array2D;
import java.util.*;

public class Array2DCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][]  matrix = new int [2][2];

        System.out.println("Enter the elements of the matrix:");
        for(int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is:");
        for(int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transpose of a matrix:");
        for(int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }

    }
}
