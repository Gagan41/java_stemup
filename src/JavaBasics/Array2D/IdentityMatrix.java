package JavaBasics.Array2D;
import java.util.Scanner;

public class IdentityMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        boolean isIdentity = true;

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
                if(i==j && matrix[i][j] != 1){
                    isIdentity = false;
                }
                else if(i!=j && matrix[i][j] != 0){
                    isIdentity = false;
                }
            }
            System.out.println();
        }

        if(isIdentity){
            System.out.println("Identity Matrix");
        }
        else{
            System.out.println("Not Identity Matrix");
        }
    }
}
