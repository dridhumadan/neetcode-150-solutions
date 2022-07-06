/*
 * Maintain three pointers low -> 0, mid -> (high + low) / 2,  and high -> (n - 1).
 * Calculate mid. If number at mid index is the target, number is found.
 * If number at mid index is greater than the target, halve the search space by moving high to mid - 1.
 * If number at mid index is lesser than the target, halve the search space by moving low to mid + 1.
 *
 * Time complexity - O(log n)
 * Space complexity - O(1)
 */
class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid = 0;

        while (low <= high) {
            mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
