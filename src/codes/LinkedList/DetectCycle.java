package codes.LinkedList;

import codes.LinkedList.ds.ListNode;

import java.util.HashSet;
import java.util.Set;

// LeetCode Link : https://leetcode.com/problems/linked-list-cycle/
public class DetectCycle {

    // Approach 1 : Using HashSet
    // TC : O(n)
    // SC : O(n)
    public boolean hasCycle1(ListNode head) {
        if (head == null) return false;
        ListNode curr = head;
        Set<ListNode> hs = new HashSet<>();

        while (curr != null) {
            boolean check = hs.add(curr);
            if (check == false) return true;
            curr = curr.next;
        }

        return false;
    }

    // Approach 2 : Using Slow and Fast Pointers
    // TC : O(n) -> Linear time
    // SC : O(1) -> Constant Space
    public boolean hasCycle2(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }

        return false;
    }
}
