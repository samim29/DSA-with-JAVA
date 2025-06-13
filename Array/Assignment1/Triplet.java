// Question 5: Given an integer array nums, return all the triplets [nums[i], nums[j],   
// nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0. 
// Notice that the solution set must not contain duplicate triplets. 
// Example 1: 
// Input: 
// nums = [-1, 0, 1, 2, -1, -4] 

//  Output: [ [-1, -1, 2] , [-1, 0, 1] ] 
// Example 2: 
// Input: 
// nums = [ ]  
// Output: [ ]  
// Example 3: 
// Input: 
// nums = [ 0 ]  
// Output: [ ]  
// Constraints: 
// •  0 <= nums . length <= 3000 
// •  -105 <= nums [ i ] <= 105

public class Triplet {
    public static void printTriplets(int nums[]){
        int n = nums.length;
        for(int i =0; i<= n-3; i++){
            for(int j = i+1; j<n-2;j++){
                for(int k = j+1; k<n-1;k++){
                    if(nums[i]+nums[j]+nums[k] == 0) System.out.print("[" + nums[i]+ "," + nums[j] + "," + nums[k]+"] ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4};
        printTriplets(nums);
    }
}
