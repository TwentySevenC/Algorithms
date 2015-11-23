package crackingcoding.linkedlist;


// Cracking the Coding Interview

/**
 * Linked list
 * 
 * 2.3 Implement an algorithm to delete a node in the middle of a single 
 * linked list, given only access to that node.
 *
 * 本题中要删除链表中间的一个点，并且只给出这个点引用那么无法使用 previous.next = middle.next;
 * 只能通过复制后边链表的值，覆盖前面的值来达到删除的效果
 */

public class DeleteMiddleNode {
	public static boolean deleteMiddleNode(LinkedListNode middleNode){
		// stupid solutions
/*		LinkedListNode previous = middleNode;
		while(middleNode.next != null){
			middleNode.data = middleNode.next.data;
			previous = middleNode;
			middleNode = middleNode.next;
		}
		previous.next = null;
	}*/
	
		if(middleNode == null || middleNode.next == null){
			return false;
		}
		
		LinkedListNode n = middleNode.next;
		middleNode.data = n.data;
		middleNode.next = n.next;
		
		return true;
	}
	
}
