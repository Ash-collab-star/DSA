package codes.LinkedList;

// GFG Link : https://www.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1
public class DeleteNode(Node head) {
  Node curr = head;
    	Node previous=null;
    	Node future = curr.next;
    	int count=1;
    	
    	if(curr==null){
    	    return head;
    	}
    	
    	if(x==1){
    	    head=head.next;
    	    return head;
    	    
    	}
    	
        while(count<x && curr!=null){
            previous=curr;
            curr=future;
            future=curr.next;
            count++;
           
        }
            

        
        previous.next = future; 
        curr.next = null; 
        
    
	
	 return head;
}

  

}
