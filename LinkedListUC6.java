package LinkedList;

import java.util.LinkedList;

public class LinkedListUC6 {
	public static void main(String[] args) {
		LinkedList linkedList = new  LinkedList();
		linkedList.add(56);
		linkedList.add(30);
		linkedList.add(70);
		
		System.out.println("LinkedList "+linkedList);
		
		System.out.println("last element is "+linkedList.removeLast());
		
		System.out.println("LinkedList "+linkedList);
		
	}

}
