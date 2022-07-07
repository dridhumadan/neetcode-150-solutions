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
 * Two pointer method.
 * Move slow pointer by 1 node and fast pointer by 2 nodes in each iteration.
 * If linked list has a cycle, two pointers will meet at some point.
 *
 * Time complexity - O(n)
 * Space complexity - O(1)
 */
class Solution1 {
    public boolean hasCycle(ListNode head) {

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}

/*
 * Maintain a HashSet. Iterate through the linked list.
 * In each iteration, check if current node already exists in the set,
 * indicating a loop.
 * If not, add the node to the set and move to the next node.
 *
 * Time complexity - O(n)
 * Space complexity - O(n)
 */
class Solution2 {
    public boolean hasCycle(ListNode head) {
        var set = new HashSet<ListNode>();

        while (head != null) {
            if (set.contains(head)) {
                return true;
            }

            set.add(head);
            head = head.next;
        }

        return false;
    }
}
