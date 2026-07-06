/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
//     public ListNode rotateRight(ListNode head, int k) {
//         ArrayList<ListNode> list=new ArrayList<>();


        
//     }
// }
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
          if (head == null || head.next == null || k == 0){
        return head;
          }

ArrayList<Integer> arr = new ArrayList<>();

// Store values
while (head != null) {
    arr.add(head.val);
    head = head.next;
}

int n = arr.size();
k = k % n;

ListNode dummy = new ListNode(0);
ListNode temp = dummy;

// Add from n-k to n-1
for (int i = n - k; i < n; i++) {
    temp.next = new ListNode(arr.get(i));
    temp = temp.next;
}

// Add from 0 to n-k-1
for (int i = 0; i < n - k; i++) {
    temp.next = new ListNode(arr.get(i));
    temp = temp.next;
}

return dummy.next;
    }
}