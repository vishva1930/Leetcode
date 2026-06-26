class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode original = head;
        ArrayList<ListNode> list = new ArrayList<>();

        while (head != null) {
            list.add(head);
            head = head.next;
        }
        if (n < 1 || n > list.size()) {
            return original;
        }
        int index = list.size() - n;
        list.remove(index);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (ListNode node : list) {
            curr.next = new ListNode(node.val);
            curr = curr.next;
        }
        return dummy.next;
    }
}