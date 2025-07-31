package JavaBasics.Array2D;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [][] matrix = new int [3][3];
        int even = 0, odd = 0;

        System.out.println("Enter the elements of the matrix:");
        for(int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                matrix [i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                if (matrix[i][j] % 2 == 0){
                    even++;
                }
                else {
                    odd++;
                }
            }
        }
        System.out.println("Number of even elements are "+even+" Odd elements are "+odd);
    }
}
