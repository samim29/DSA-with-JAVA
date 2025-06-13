public class Assignment2 {
    public static int findInRotatedArray(int nums[], int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target)
                return mid;

            // Check if left half is sorted
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(findInRotatedArray(nums, target));  // Output: 4

        target = 3;
        System.out.println(findInRotatedArray(nums, target));  // Output: -1

        target = 7;
        System.out.println(findInRotatedArray(nums, target));  // Output: 3
    }
}

