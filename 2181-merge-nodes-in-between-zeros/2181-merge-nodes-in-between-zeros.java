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
    public ListNode mergeNodes(ListNode head) {
        ListNode newNode = head.next;
        ListNode currNode = newNode;
        while(currNode != null)
        {
            int sum = 0;
            while(currNode.val != 0)
            {
                sum += currNode.val;
                currNode = currNode.next;
            }
            newNode.val = sum;
            currNode = currNode.next;
            if(currNode != null)
            {
                newNode = newNode.next;
            }
            else
            {
                newNode.next = null;
            }
        }
        return head.next;
    }
}