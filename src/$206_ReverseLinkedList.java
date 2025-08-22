public class $206_ReverseLinkedList {

    void main() {
        System.out.println(reverseList(new ListNode(1, new ListNode(2, new ListNode(3)))));
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


