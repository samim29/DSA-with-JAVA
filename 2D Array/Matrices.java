import java.util.*;

public class Matrices {
    
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int row = matrix.length, column = matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
