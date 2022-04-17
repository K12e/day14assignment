package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListUC3 {
  public static void main(String[] args) {
	LinkedList linkedList= new LinkedList();
	
	linkedList.add(56);
	System.out.println("LinkedList" +linkedList);
	
	List arrayList=new ArrayList();
	
	arrayList.add(30);
	arrayList.add(70);
	
	linkedList.addAll(arrayList);
	
	System.out.println("append LinkedList" +linkedList);
	
	
  }
}
