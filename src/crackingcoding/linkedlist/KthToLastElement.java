package crackingcoding.linkedlist;


// Cracking the Coding Interview

/**
 * Linked list
 * 2.2 Implement an algorithm to find the kth to last element of a single linked list
 *
 */

public class KthToLastElement {
	
	//方法一： 遍历
	public LinkedListNode kthToLastElemnt(LinkedListNode list, int k){
		if(k < 0) return null;
		
		LinkedListNode p1 = list, p2 = list;
		
		for(int i = 0; i < k-1; i++){    // i 到 k-1 而不是 k， 因为i=0循过后， p2 就已经指向第二个元素了，最后i循环到k-2后，p2 指向了第k个元素
			if(p2 == null) return null;
			
			p2 = p2.next;
		}
		
		while(p2.next != null){
			p1 = p1.next ;
			p2 = p2.next ;
		}
		
		return p1;
	}
	
	// 方法二： 递归
	public int kthToLastElement(LinkedListNode list, int k){
		if(k < 0){
			throw new UnsupportedOperationException("K值不能为负。");
		}
		
		if(list.next == null) return 1;   //递归的结束标志
		
		int i = kthToLastElement(list.next, k) + 1;
		if(i == k){
			System.out.println(list.data);
		}
		
		return i;
	}
}
