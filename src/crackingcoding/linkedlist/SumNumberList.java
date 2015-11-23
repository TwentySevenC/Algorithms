package crackingcoding.linkedlist;


// Cracking the Coding Interview

/**
 * Linked List
 * 
 * 2.5 You have two numbers represented by a linked list, where each node
 * contains a single digit. The digits are stored in reverse order, such 
 * that the 1's digit is at the head of the list. Write a function that 
 * adds the two numbers and returns the sum as a linked list.
 *
 */

public class SumNumberList {
	// number with reverse order
	public static LinkedListNode sum(LinkedListNode number1, LinkedListNode number2){
		LinkedListNode result = new LinkedListNode();
		LinkedListNode point = result;
		int c = 0;
		int data;
		
		while(number1 != null && number2 != null){
			
			data = number1.data + number2.data + c;
			
			if(data >= 10){
				c = 1;
			}else{
				c = 0;
			}
			
			LinkedListNode node = new LinkedListNode(data % 10);
			point.next = node;
			point = node;
			
			number1 = number1.next;
			number2 = number2.next;
		}
		
		LinkedListNode back = number1 == null ? (number2 == null ? null : number2) : number1;
		if(back != null){
			if(c == 1){
				while(back != null){
					data = c + back.data;
					
					if(data >= 10){
						c = 1;
					}else{
						c = 0;
					}
					
					LinkedListNode node = new LinkedListNode(data % 10);
					point.next = node;
					point = node;
					
					back = back.next;
				}
			}else{
				point.next = back;
			}
		}
		
		if(back == null && c == 1){
			point.next = new LinkedListNode(1);
		}
		
		return result.next;
	}
	
	// number with forward
	
	
	
	public static void main(String[] args) {
		LinkedListNode number1 = new LinkedListNode(1);
//		number1.appendToTail(3);
//		number1.appendToTail(2);
		
		LinkedListNode number2 = new LinkedListNode(9);
		number2.appendToTail(9);
		number2.appendToTail(9);
		
		System.out.println(sum(number1, number2));
	}
	
}
