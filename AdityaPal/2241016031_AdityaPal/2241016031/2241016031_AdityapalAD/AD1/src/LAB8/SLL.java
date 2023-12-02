package LAB8;

public class SLL {
	  public static class Node {
	        String data;    
	        Node next;
	        public Node(String data) {
	            this.data = data;
	            this.next = null;
	        }
	    }
	    public static void main(String[] args) {
	    	//Create
	        Node canada = new Node("Canada");
	        Node usa = new Node("United States");
	        Node mexico = new Node("Mexico");
	        Node brazil = new Node("Brazil");
	        Node france = new Node("France");
	        
	        canada.next = usa;
	        usa.next = mexico;
	        mexico.next = brazil;
	        brazil.next = france;
	        
	        //Traverse
	        Node current = canada;
	        while (current != null) {
	            System.out.println(current.data);
	            current = current.next;
	        }
	    }
}
