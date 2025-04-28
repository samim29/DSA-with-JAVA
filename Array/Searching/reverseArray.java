
import java.util.*;
public class reverseArray {
    
    public static void reverse(int arr[]){
        int start = 0, end = arr.length-1 ;
        while(start < end){
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i] + " ");
        }



    }
}
