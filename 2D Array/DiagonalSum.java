public class DiagonalSum {
        public static int diagonalsum(int matrix[][]){
            int sum = 0;
            //Brute force Approach

            // for(int i=0;i<matrix.length;i++){//row
            //     for(int j =0;j<matrix[0].length;j++){
            //         if(i==j) sum +=matrix[i][j];
            //         else if(i+j == matrix.length-1) sum+=matrix[i][j];
            //     }

            // }

            //optimized approach
            for(int i=0;i<matrix.length;i++){
                //primary diagonal
                sum+=matrix[i][i];
                //secondary diagonal
                if(i!= matrix.length-1-i){ //to avoid double adding same element
                    sum+=matrix[i][matrix.length-i-1];

                }
            }

            return sum;
        }



        public static void main(String args[]) {
        // Define a 4x4 matrix
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println(diagonalsum(matrix));
        
    }
}
