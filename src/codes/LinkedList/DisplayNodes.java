package codes.LinkedList;

import codes.LinkedList.ds.Node;

// GFG Link : https://www.geeksforgeeks.org/problems/print-linked-list-elements/1
public class DisplayNodes {

    void display(Node head)
    {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
