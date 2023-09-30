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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode ans =new ListNode();
       ans.next = head;
       int length = 0;
       ListNode temp =head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        length = length-n;
        temp=ans;
        while(length>0){
            length--;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return ans.next;

    }
}