package JavaBasics.Array2D;
import java.util.Scanner;

public class DiagonalElementsInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][]  matrix = new int [3][3];

        System.out.println("Enter the elements of the matrix:");
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is:");
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Main Diagonal:");
        for(int i=0; i<3; i++){
                System.out.print(matrix[i][i]+" ");
        }

        System.out.println("secondary Diagonal:");
        for(int i=0; i<3; i++){
                System.out.print(matrix[i][2-i]+" ");
        }
    }
}

