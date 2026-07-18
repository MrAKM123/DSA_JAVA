class Solution {

    static int pivotIndex(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        if (nums[s] < nums[e]) {
            return -1;
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] <= nums[n-1]) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }

        }
        return ans;
    }

    static int binarySearch(int nums[], int s, int e, int target) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int pivot = pivotIndex(nums);
        int n = nums.length;

        int startL1 = 0;
        int endL1 = pivot;
        int startL2 = pivot + 1;
        int endL2 = n - 1;

        // If the array is not rotated at all
        if (pivot == -1) {
            int ans = binarySearch(nums, 0, n - 1, target);
            return ans;
        }

        // REMOVED THE PREMATURE RETURN FROM THE ELSE BLOCK

        // Check if target is in the first half
        if ((target >= nums[startL1]) && (target <= nums[endL1])) {
            int ans = binarySearch(nums, startL1, endL1, target);
            return ans;
        }

        // Check if target is in the second half
        if ((target >= nums[startL2]) && (target <= nums[endL2])) {
            int ans = binarySearch(nums, startL2, endL2, target);
            return ans;
        }

        return -1;
    }
}