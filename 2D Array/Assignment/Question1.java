

public class Question1 {
   
    public static int Search(int matrix[][], int key){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key) count++;
            }
        }
        return count;
    }
    
    public static void main(String args[]) {
        int matrix[][] = {{4,7,8},{8,8,7}};
        System.out.print(Search(matrix,7));
    }
}
