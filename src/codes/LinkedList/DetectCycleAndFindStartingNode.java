package codes.LinkedList;
import java.util.*;

// LeetCode Link : https://leetcode.com/problems/linked-list-cycle-ii/
public class DetectCycleAndFindStartingNode {

    // Approach 1 : Using HashSet
    // TC : O(n)
    // SC : O(n)
    public ListNode detectCycle(ListNode head) {
        ListNode curr = head;
        Set<ListNode> hs = new HashSet<>();

        while (curr != null) {
            boolean check = hs.add(curr);
            if (check == false) return curr;
            curr = curr.next;
        }

        return null;
    }

    // Approach 2 : Using Slow and Fast Pointer (Homeworkd)
    // TC : O(n)
    // SC : O(1)

}
