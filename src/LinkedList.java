
public class LinkedList {
	ListElement head; 
	
	    public void add(int new_data)
	    {
	    	ListElement element = new ListElement(new_data);
	        element.next = head;
	        head = element;
	    }
	 
	   
	    void deleteNode(int index)
	    {
	        if (head == null)
	            return;
	        ListElement current = head;
	        if (index == 0)
	        {
	            head = current.next;   
	            return;
	        }
	 
	        for (int i=0; current!=null && i<index-1; i++)
	            current = current.next;
	 
	        
	        if (current == null || current.next == null)
	            return;
	 
	       
	        ListElement next = current.next.next;
	 
	        current.next = next;  
	    }

	    public void printList()
	    {
	    	ListElement current = head;
	        while (current != null)
	        {
	            System.out.print(current.data+" ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	
	    public int getElement(int index) {
	    	if (head ==null)
	    		return 0;
	    	ListElement current = head;
	    	while (index-1!=0) {
	    		current = current.next;
	    		index--;
	    	}
	    	return current.data;	
	    	
	    }
}
