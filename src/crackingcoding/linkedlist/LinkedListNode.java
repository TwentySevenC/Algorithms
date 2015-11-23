package crackingcoding.linkedlist;

// Cracking the Coding Interview

// Linked list 

public class LinkedListNode {
	
	LinkedListNode next = null;
	int data;
	
	public LinkedListNode(int data) {
		this.data = data;
	}
	
	public LinkedListNode(){
		
	}
	
	void appendToTail(int d){
		LinkedListNode n = new LinkedListNode(d);
		LinkedListNode node = this;
		
		while(node.next != null){
			node = node.next;
		}
		
		node.next = n;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof LinkedListNode && ((LinkedListNode)obj).data == data;
	}
	
	
	@Override
	public int hashCode() {
		return Integer.valueOf(data).hashCode();
	}
	
	
	public String toString(){
		LinkedListNode node = this;
		
		StringBuilder sb = new StringBuilder();
		
		while(node.next != null){
			sb.append(node.data);
			sb.append("->");
			node = node.next;
		}
		sb.append(node.data);

		return sb.toString();
	}

}
