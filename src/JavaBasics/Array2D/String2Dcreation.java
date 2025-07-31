package JavaBasics.Array2D;
import java.util.Scanner;

public class String2Dcreation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [][] fruits = new String [3][3];

        System.out.println("Enter the elements of the matrix:");
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                fruits [i][j] = sc.next();
            }
        }
        System.out.println("Matrix is:");
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(fruits[i][j]+" ");
            }
            System.out.println();
        }
    }
}
