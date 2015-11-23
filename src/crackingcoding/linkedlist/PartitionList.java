package crackingcoding.linkedlist;


// Cracking the Coding Interview

/**
 * Linked list
 * 
 * Write code to partition a linked list around a value x, such that all nodes less than x
 * come before all nodes greater than or equal to x
 *
 */

public class PartitionList {
	public static LinkedListNode partition(LinkedListNode list, int x){
		if(list == null || list.next == null)  return list;
		
		LinkedListNode less = new LinkedListNode();
		LinkedListNode greater = new LinkedListNode();
		LinkedListNode lessPoint = less, greaterPoint = greater;
		
		
		while(list != null){
			if(list.data < x){
				lessPoint.next = list;
				lessPoint = lessPoint.next;
			}else{
				greaterPoint.next = list;
				greaterPoint = greaterPoint.next;
			}
			list = list.next;
		}
		
		lessPoint.next = greater.next;
		
		return less.next;
	}
	
	public static void main(String[] args) {
		LinkedListNode list = new LinkedListNode(6);
		list.appendToTail(1);
		list.appendToTail(4);
		list.appendToTail(1);
		list.appendToTail(1);
		list.appendToTail(7);
		
		System.out.println(list);
		
		list = partition(list, 0);
		
		System.out.println("result: " + list);
		
	}
	

}
