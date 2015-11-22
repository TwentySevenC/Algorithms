package crackingcoding.linkedlist;

public class Node {
	Node next = null;
	int data ;
	
	public Node(int data){
		this.data = data;
	}
	
	void appendToTail(int d){
		Node node = new Node(d);
		Node n = this;
		
		while(n.next != null){
			n = n.next;
		}
		
		n.next = node;
	}
	
	Node deleteNode(Node head, int d){
		Node n = head;
		if(n.data == d){
			return head.next;
		}
		
		while(n.next != null){
			if(n.next.data == d){
				if(n.next.next != null){
					n.next = n.next.next;
					return head;
				}
				n.next = null;
				return head;
			}
			n = n.next;
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		Node node = new Node(0);
		for(int i = 1; i < 5; i++){
			node.appendToTail(i);
		}
		
		Node head = node;
		
		while(head != null){
			System.out.println(head.data);
			head = head.next;
		}
		
		node.deleteNode(node, 4);
		
		head = node;
		while(head != null){
			System.out.println(head.data);
			head = head.next;
		}
	}
}
