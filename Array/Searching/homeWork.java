
//after finding the sub array calculate sum of each sub array and find the max and min subarray sum
// public class homeWork {
    
//         public static void findSubArrays(int arr[]){
//             int Maxsum = I;
//             int subArrSum = 0;
//             int Minsum = arr[0];
//             for(int i = 0; i<arr.length;i++){
//                 System.out.print(arr[i]+"  ");
//                 if(arr[i] > Maxsum ) Maxsum = arr[i];
//                 if(arr[i]< Minsum) Minsum = arr[i];
//                 for(int j=i+1; j<arr.length;j++){
//                     for(int k=i; k<=j;k++){
//                         System.out.print(arr[k]+" ");
//                         subArrSum = subArrSum + arr[k];
//                     }
                    
//                     if(subArrSum > Maxsum) Maxsum = subArrSum ;
//                     if(subArrSum < Minsum) Minsum = subArrSum ;
//                     subArrSum = 0; 
                    
//                     System.out.print(" ");
//                 }
//                 System.out.println();
//             }
//             System.out.println("The maximum sub array sum is: "+ Maxsum);
//             System.out.print("The minimum sub array sum is: "+ Minsum);
//         }
    
//         public static void main(String[] args) {
//             int arr[] = {2,4,-6,8,10};
//             findSubArrays(arr);
//         }
   
    
// }


// // let's try another method. why? in first method we calculating sum for those whose sum is already calculated in its previous sub array. 
// // we can calculate sum of an array by adding the last element to its previous subarray. les try to implement it.


// public class homeWork {
    
//     public static void findSubArrays(int arr[]){
//         int Maxsum = arr[0];
//         int prvSubArrSum = 0;
//         int Minsum = arr[0];
//         for(int i = 0; i<arr.length;i++){
            
//             int currSubarrSum = prvSubArrSum + arr[i];
//             if(currSubarrSum > Maxsum ) Maxsum = currSubarrSum;
//             if(currSubarrSum< Minsum) Minsum = currSubarrSum;
//             prvSubArrSum = currSubarrSum;
//             for(int j=i+1; j<arr.length;j++){
//                 currSubarrSum = prvSubArrSum + arr[j];
//                 if(currSubarrSum > Maxsum) Maxsum =currSubarrSum ;
//                 if(currSubarrSum < Minsum) Minsum =currSubarrSum ; 
//                 prvSubArrSum = currSubarrSum;
//             }
//             prvSubArrSum = 0;

//             System.out.println();
//         }
//         System.out.println("The maximum sub array sum is: "+ Maxsum);
//         System.out.print("The minimum sub array sum is: "+ Minsum);
//     }

//     public static void main(String[] args) {
//         int arr[] = {2,4,6,8,10};
//         findSubArrays(arr);
//     }


// }


//using prefix sum
public class homeWork {
    
    public static void findSubArrays(int arr[]){
        int Maxsum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        // Calculate prefix sum
        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j < arr.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if(currSum > Maxsum) Maxsum = currSum;
            }
        }

        System.out.println("The maximum subarray sum is: " + Maxsum);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        findSubArrays(arr);
    }
}
