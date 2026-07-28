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
        int count=1;
        ListNode curr = head;
        while(curr.next != null)
        {
            curr = curr.next;
            count++;
        }
        for(int i=0; i<(count/2); i++)
        {
            head = head.next;
        }
        return head;
    }
}