package crackingcoding.linkedlist;

import java.util.HashMap;





/**
 * Cracking the Coding Interview
 * 
 * 2.1 Write code to remove duplicates from an unsorted linked list
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 *
 */

public class RemoveDuplicates {
	//方法一： 利用map
	public static void removeDuplicates(LinkedListNode list){
		HashMap<LinkedListNode, Boolean> map = new HashMap<>();
		LinkedListNode head = list;
		LinkedListNode previous = head;
		/*while(head != null){
			if(map.containsKey(head)){
				if(head.next != null){
					previous.next = head.next;
					head = previous;
				}
				else{
					previous.next = null;
					return ;
				}
			}
			map.put(head, true);
			previous = head;
			head = head.next;
		}*/
		
		//关键要注意previous 指针的位置
		
		while(head != null){
			if(map.containsKey(head)){
				previous.next = head.next;
			}else{
				map.put(head, true);
				previous = head;
			}
			head = head.next;
		}
	}
	
	//方法二： The Runner Technique
	public static void removeDuplicates2(LinkedListNode list){
		LinkedListNode first = list, second;
		@SuppressWarnings("unused")
		LinkedListNode previous;
		
/*		while(first != null){
			second = first;
			previous = second;*/
		
			/*while(second != null){
				if(second.data == first.data){
					if(second.next != null){
						previous.next = second.next;
						second = previous;
					}else{
						previous.next = null;
						return ;
					}
				}
				previous = second;
				second = second.next;
			}*/
			
/*			while(second != null){
				if(second.data == first.data){
					previous.next = second.next;
				}else{
					previous = second;
				}
				second = second.next;
			}
			
			first = first.next;
		}*/
		
		
		while(first != null){
			second = first;
			while(second.next != null){
				if(second.next.data == first.data){
					second.next = second.next.next;
				}else{
					second = second.next;
				}
			}
			first = first.next;
		}
	}
	
	
	public static void main(String[] args) {
		LinkedListNode list = new LinkedListNode(0);
		list.appendToTail(4);
		list.appendToTail(4);
		list.appendToTail(6);
		list.appendToTail(6);
		System.out.println(list);
		removeDuplicates2(list);
		System.out.println(list);
	}
	
}
