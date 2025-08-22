public class $141_LinkedListCycle {

    void main() {
        System.out.println(hasCycle(new ListNode(3)));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            System.out.println(slow);
            fast = fast.next.next;
            System.out.println(fast);
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    class ListNode {
        ListNode next;
        int val;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}


