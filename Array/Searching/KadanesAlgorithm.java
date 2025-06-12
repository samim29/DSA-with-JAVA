public class KadanesAlgorithm {
        public static void findSubArraySumKadansMethod(int arr[]){
            int currentSum = 0;
            int maxSum = Integer.MIN_VALUE;
            for(int i = 0; i < arr.length; i++){
               currentSum = currentSum + arr[i];
               if(currentSum < 0) currentSum = 0;
               if(currentSum > maxSum) maxSum = currentSum;
            }
            System.out.println("The maximum subarray sum is: " + maxSum);
        }
        public static void main(String[] args) {
            int arr[] = {2, 4, 6, 8, 10};
            findSubArraySumKadansMethod(arr);
        } 
}
