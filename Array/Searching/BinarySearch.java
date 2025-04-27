import java.util.*;


public class BinarySearch {


    public static void binarysearch(int arr[], int key) {
        int start =0 , end = arr.length-1 ;
        while(start<=end){
            int mid = start+end/2;
            if(arr[mid] == key) System.out.println("element found at index: "+mid);
            else if(arr[mid]>key) end = mid -1;
            else start = mid+1;
        }
        System.out.println("Element not found");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the array size: ");
        int size = sc.nextInt();

        // Initialize array
        int arr[] = new int[size];

        // Taking array input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the element to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        // Display the array
        System.out.println("Given array: " + Arrays.toString(arr));

        // Perform linear search
        binarysearch(arr, key);

        // Close the scanner
        sc.close();
    
}
}
