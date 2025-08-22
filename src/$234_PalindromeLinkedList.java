import java.util.Objects;

public class $234_PalindromeLinkedList {

    void main() {
        System.out.println(isPalindrome(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))))));
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode middle = middleNode(head);
        ListNode reverse = reverseList(middle);

        while (reverse != null) {
            if (!Objects.equals(reverse.val, head.val)) {
                return false;
            }
            reverse = reverse.next;
            head = head.next;
        }

        return true;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            if (next == null) {
                return STR."\{val}";
            }
            return STR."\{val} -> \{next}";
        }
    }
}


