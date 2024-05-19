package codes.LinkedList;

// GFG Link : https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/1
public class CountNodes {

    // TC : O(n)
    // SC : O(1)
    public static int getCount(Node head)
    {
        Node curr = head;
        int count = 0;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        return count;
    }

}
