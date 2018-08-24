/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // Priority Queue
        // Time complexity : O(Nlogk)
        // Space Complexity: O(k);

        if(lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, (o1,o2) -> o1.val-o2.val);

        // initinize queue;
       for(ListNode l: lists) {
           if(l != null) {
               queue.add(l);
           }
       }

        ListNode dummy = new ListNode(0);
        ListNode head = dummy;

        while(!queue.isEmpty()) {
            ListNode temp = queue.poll();
            head.next = temp;
            head = head.next;
            if(temp.next!= null) {
                queue.add(temp.next);
            }
        }
        return dummy.next;

    }
}
