/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int count1 =0;
        int count2=0;
        ListNode head1=headA;
        ListNode head2=headB;
        boolean ans = false;
        while(head1!=null){
            count1++;
            head1 = head1.next;
        }while(head2!=null){
            count2++;
            head2= head2.next;
        }
        head1=headA;
        head2=headB;
        if(count1>count2){
            int diff = count1-count2;
            while(diff!=0)
            {
                head1=head1.next;
                diff--;
            }   
        }     
        else if(count2>count1){
            int diff = count2-count1;
            while(diff!=0)
            {
                head2=head2.next;
                diff--;
            }
        }
        else
        {
            int diff = count1-count2;
        }
        while(head1!=null && head2!=null)
        {
            if(head1==head2)
            {
                ans=true;
                break;
            }
            head1=head1.next;
            head2=head2.next;
        }
        if(ans==true)
        {
            return head1;
        }
        else
        {
            return null;
        }    
    }
}