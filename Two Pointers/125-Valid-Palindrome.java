/*
 * Convert string to lowercase.
 * Initiate two pointers (left -> 0th index and right -> (n-1)th index).
 * If character at either of these two pointers is not a valid alphanumeric, move pointers.
 * Check characters at left and right pointers for equality.
 *
 * Time complexity - O(n)
 * Space complexity - O(1)
 */
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        for (int i = 0, j = s.length() - 1; i < j;) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            } else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } else if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }

        return true;
    }
}
