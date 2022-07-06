/*
 * Convert strings to character arrays.
 * Sort both arrays.
 * Convert back to strings and check for equality.
 * 
 * Time complexity - O(n log n)
 * Space complexity - O(n)
 */
class Solution1 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] a = s.toCharArray(), b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b));
    }
}

/*
 * Map each character in String s in a frequency map (array of length 26).
 * (c - 'a') gives index of character in the array.
 * Repeat same process for String t, decrement index.
 * Check elements of the frequency map for values other than 0.
 * 
 * Time complexity - O(n)
 * Space complexity - O(1)
 */
class Solution2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        var freq = new int[26];

        for (char c1 : s.toCharArray())
            freq[c1 - 'a']++;
        for (char c2 : t.toCharArray())
            freq[c2 - 'a']--;
        for (int f : freq) {
            if (f != 0) {
                return false;
            }
        }

        return true;
    }
}
