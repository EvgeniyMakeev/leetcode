public class $21_MergeTwoSortedLists {

    void main() {
        System.out.println(mergeTwoLists(
                new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(5, new ListNode(5))))),
                new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(6, new ListNode(7))))))
        );
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode(0);
        ListNode result = merged;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                merged.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                merged.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            merged = merged.next;
        }

        if (list1 != null) {
            merged.next = list1;
        }

        if (list2 != null) {
            merged.next = list2;
        }

        return result.next;
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


