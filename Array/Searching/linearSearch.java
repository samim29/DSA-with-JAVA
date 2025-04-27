import java.util.*;

public class linearSearch {
    public static void linearsearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                return;
            }
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
        linearsearch(arr, key);

        // Close the scanner
        sc.close();
    }
}