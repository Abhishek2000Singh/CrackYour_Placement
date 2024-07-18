public class Pq7_RemoveNthNodeFromLL {
    public class ListNode {
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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to simplify the code

        ListNode fast = head;
        ListNode slow = head;

        // Move fast k steps ahead
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                // If k is larger than the length of the list, return the original head
                return head;
            }
            fast = fast.next;
        }

        // If fast reached the end, remove the head node
        if (fast == null) {
            return head.next;
        }

        // Move both pointers until fast reaches the end
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Skip the nth node from the end
        slow.next = slow.next.next;

        return head;
    }
}
