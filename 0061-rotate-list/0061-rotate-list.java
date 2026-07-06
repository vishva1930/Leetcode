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
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        ArrayList<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }

        int n=list.size();
        k=k%n;

        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;

        for(int i=n-k;i<n;i++){
            temp.next=new ListNode(list.get(i));
            temp=temp.next;
        }

        for(int i=0;i<n-k;i++){
            temp.next=new ListNode(list.get(i));
            temp=temp.next;
        }
        return dummy.next;   
    }
}
