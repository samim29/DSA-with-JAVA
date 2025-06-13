import java.util.Arrays;

public class BubbleSort {
    public static void sort(int num[]){
        int flag =0;
        for(int i = 1; i<=num.length-1;i++){
            
            for (int j=0;j<=num.length-1-i;j++){
                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j] = num [j+1];
                    num[j+1]=temp;
                    flag =1;
                }
            }
            if(flag == 0) return;
        }
        return;
    }

    public static void InsertionSort(int arr[]){
        for(int i =1;i< arr.length; i++){
            int curr = arr[i];
            int prev = i -1;

            while(prev >=0 && arr[prev]> curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        int num[] = {5,3,1,4,2};
        // sort(num);
        // InsertionSort(num);
        Arrays.sort(num);
        for(int i =0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        
    }
}
