public class $876_MiddleOfTheLinkedList {

    void main() {
        System.out.println(middleNode(new ListNode(1, new ListNode(2, new ListNode(3)))));
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


