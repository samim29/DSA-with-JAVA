public class SubArrays {
    public static void findSubArrays(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+"  ");
            
            for(int j=i+1; j<arr.length;j++){
                for(int k=i; k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        findSubArrays(arr);
    }
}


