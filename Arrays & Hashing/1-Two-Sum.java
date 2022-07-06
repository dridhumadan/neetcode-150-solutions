/*
 * Maintain a HashMap with element -> index mapping.
 * Iterate through the array.
 * During each iteration, check if the difference (target - current element) is present in the map.
 *
 * Time complexity - O(n)
 * Space complexity - O(n)
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}
