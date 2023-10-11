class Solution{
public ListNode insertionSortList(ListNode head) {
		if( head == null ){
			return head;
		}
		
		ListNode ans = new ListNode(0);
		ListNode cur = head; 
		ListNode pre = ans; 
		ListNode next = null;
		while( cur != null ){
			next = cur.next;
			while( pre.next != null && pre.next.val < cur.val ){
				pre = pre.next;
			}
			cur.next = pre.next;
			pre.next = cur;
			pre = ans;
			cur = next;
		}
		
		return ans.next;
	}}