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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode nodeA = list1;
        for(int i=0; i<a-1; i++)
        {
            nodeA = nodeA.next;
        }
        ListNode nodeB = nodeA;
        for(int j=0; j<(b-a)+2; j++)
        {
            nodeB = nodeB.next;
        }
        nodeA.next = list2;
        ListNode curr = list2;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = nodeB;
        return list1;
    }
}