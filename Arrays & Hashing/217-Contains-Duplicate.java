/*
 * Iterate through the array whilst adding elements to a set. Check for duplicates on each iteration.
 * 
 * Time complexity - O(n)
 * Space complexity - O(n)
 */
class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        var uniqueElements = new HashSet<Integer>();

        for (int num : nums) {
            if (uniqueElements.contains(num)) {
                return true;
            }

            uniqueElements.add(num);
        }

        return false;
    }
}

/*
 * Sort the array using a O(n log n) algorithm and check consecutive elements
 * for equality.
 * 
 * Time complexity - O(n log n)
 * Space complexity - O(1)
 */
class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }
}
