package codes.LinkedList;

import codes.LinkedList.ds.Node;

// GFG Link : https://www.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1
public class DeleteNode {

    // TC : O(n)
    // SC : O(1)
    Node deleteNode(Node head, int x)
    {
        if (x == 1) return head.next;

        int count = 0;
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            count++;
            if (count == x) break;
            prev = curr;
            curr = curr.next;
        }

        prev.next = prev.next.next;

        return head;
    }

}
