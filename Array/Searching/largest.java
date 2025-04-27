public class largest {
    public static int findLargest(int arr[]){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,6,3,5};
        System.out.println("The largest element is: "+findLargest(arr));

    }
}
