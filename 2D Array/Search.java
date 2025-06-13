public class Search {
    public static boolean searchInMatrix(int matrix[][], int target){
        //Bruteforce approach
        // for(int i=0;i<matrix.length;i++){//row
        //         for(int j =0;j<matrix[0].length;j++){
        //            if (matrix[i][j]==target){
        //              System.out.println("( "+i+","+j+" )");
        //            }
        //         }
        //     }
        int row =0, col=matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]== target) {
                System.out.println("( "+row+","+col+" )");
                return true;
            }
            else if(target < matrix[row][col]) col--;
            else row++;
        
            }
            System.out.println("Target not found");
            return false;
    }


    public static void main(String args[]) {
        // Define a 4x4 matrix
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

       searchInMatrix(matrix, 15);
        
    }
}
