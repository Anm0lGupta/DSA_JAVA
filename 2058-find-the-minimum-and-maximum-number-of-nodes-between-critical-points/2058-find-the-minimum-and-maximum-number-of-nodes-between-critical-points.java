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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)
        {
            return new int[]{-1, -1};
        }
        ListNode prev = head;
        ListNode curr = head.next;
        int index = 1;
        int FC = -1;
        int LC = -1;
        int min = Integer.MAX_VALUE;
        while(curr.next != null)
        {
            boolean isMax = (curr.val > prev.val && curr.val > curr.next.val);
            boolean isMin = (curr.val < prev.val && curr.val < curr.next.val);
            if(isMax || isMin)
            {
                if(FC == -1)
                {
                    FC = index;
                }
                else
                {
                    min = Math.min(min, index - LC);
                }
                LC = index;
            }
            prev = curr;
            curr = curr.next;
            index++;
        }
        if(min == Integer.MAX_VALUE) return new int[]{-1, -1};
        int max = LC-FC;
        return new int[]{min, max};
    }
}