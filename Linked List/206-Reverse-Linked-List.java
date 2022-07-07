class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

/*
 * Maintain two pointers, newHead and next.
 * Iterate through the linked list. In each iteration, get the next node, point
 * head node next to new head, set new head to current head and then set head to
 * next. Repeat till head is null
 *
 * Time complexity - O(n)
 * Space complexity - O(1)
 */
class Solution1 {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }

        return newHead;
    }
}

/*
 * Recursive solution. Start with newHead -> null
 * Recursively reverse the list, starting with the head node
 *
 * Time complexity - O(n)
 * Space complexity - O(n) -> for call stack
 */
class Solution2 {
    public ListNode reverseList(ListNode head) {
        return reverseListHelper(head, null);
    }

    private ListNode reverseListHelper(ListNode head, ListNode newHead) {
        if (head == null) {
            return newHead;
        }

        ListNode next = head.next;
        head.next = newHead;
        return reverseListHelper(next, head);
    }
}
