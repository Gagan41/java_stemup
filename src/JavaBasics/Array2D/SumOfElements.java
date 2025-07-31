package JavaBasics.Array2D;
import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [][] matrix = new int [3][3];
        int sum = 0;

        System.out.println("Enter the elements of the matrix:");
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                matrix [i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}

