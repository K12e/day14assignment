package LinkedList;

import java.util.LinkedList;

public class LinkedListUC5 {
	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.add(56);
		linkedList.add(30);
		linkedList.add(70);
		
		System.out.println("LinkedList " +linkedList);
		
		System.out.println("first element is "+linkedList.pop());
		
		System.out.println("LinkedList " +linkedList);
		
	}

}
