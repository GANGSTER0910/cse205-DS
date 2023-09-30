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
    public ListNode middleNode(ListNode head) {
        ListNode node = head;
        int count =0;
        while(head!=null){
            count++;
        }
        count = count/2;
            while(head!=null){
                node = head.next;
                head = head.next;
               // count++;
            }
            return node;
        }
    }
