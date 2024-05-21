package codes.LinkedList;

import codes.LinkedList.ds.ListNode;

// LeetCode Link : https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {

    // TC : O(n)
    // SC : O(1)
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode fut = null;

        while (curr != null) {
            fut = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fut;
        }

        return prev;
    }

}
