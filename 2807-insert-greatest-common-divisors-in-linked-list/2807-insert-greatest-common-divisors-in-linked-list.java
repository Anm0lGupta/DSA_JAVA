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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null) return head;
        ListNode headB = new ListNode(head.val);
        ListNode tail = headB;
        ListNode curr = head;
        while(curr.next != null)
        {
            tail.next = new ListNode(gcd(curr.val, curr.next.val));
            tail = tail.next;
            tail.next = new ListNode(curr.next.val);
            tail = tail.next;
            curr = curr.next;
        }
        return headB;
    }
    private static int gcd(int a, int b)
    {
        while(b!=0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }
    return a;
    }
}