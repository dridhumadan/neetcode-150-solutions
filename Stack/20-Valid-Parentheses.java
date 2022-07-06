/*
 * Create a stack.
 * Iterate through the provided expression, checking each character.
 * Add corresponding closing bracket to the stack if an opening bracket is found.
 * If current character is a closing bracket, check if stack is empty or if top element in the stack is a matching bracket.
 *
 * Time complexity - O(n)
 * Space complexity - O(n)
 */
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        var stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.empty() || stack.pop() != c) {
                return false;
            }
        }

        return stack.empty();
    }
}
