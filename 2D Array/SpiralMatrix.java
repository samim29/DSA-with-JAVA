public class SpiralMatrix {

    // Function to print the matrix in spiral order
    public static void printSpiral(int matrix[][]){
        // Initialize the starting row and column
        int startRow = 0;
        int startColoum = 0;

        // Initialize the ending row and column
        int endRow = matrix.length - 1;
        int endColumn = matrix[0].length - 1;

        // Continue looping until we have traversed all layers of the matrix
        while (startRow <= endRow && startColoum <= endColumn) {
            
            // Traverse the top row from left to right
            for (int i = startColoum; i <= endColumn; i++) {
                // Row is fixed at startRow, column varies from startColoum to endColumn
                System.out.print(matrix[startRow][i] + " ");
            }

            // Traverse the rightmost column from top to bottom
            for (int j = startRow + 1; j <= endRow; j++) {
                // Column is fixed at endColumn, row varies from startRow+1 to endRow
                System.out.print(matrix[j][endColumn] + " ");
            }

            // Traverse the bottom row from right to left
            for (int i = endColumn - 1; i >= startColoum; i--) {
                // Check if top and bottom rows are the same to avoid duplicate printing.
                if (startRow == endRow) break;
                // Row is fixed at endRow, column varies in reverse from endColumn-1 to startColoum
                System.out.print(matrix[endRow][i] + " ");
            }

            // Traverse the leftmost column from bottom to top
            for (int j = endRow - 1; j >= startRow + 1; j--) {
                // Check if left and right columns are the same to avoid duplicate printing
                if (startColoum == endColumn) break;
                // Column is fixed at startColoum, row varies in reverse from endRow-1 to startRow+1
                System.out.print(matrix[j][startColoum] + " ");
            }

            // Move to the next inner layer of the matrix
            startRow++;
            startColoum++;
            endRow--;
            endColumn--;
        }
    }

    public static void main(String args[]) {
        // Define a 4x4 matrix
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // Call the function to print the matrix in spiral order
        printSpiral(matrix);
    }
}

