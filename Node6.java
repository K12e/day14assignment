package LinkedList;

import java.util.LinkedList;

public class Node6 {
	int data;
	Node6 next;
	public Node6(int data) {
		
		this.data = data;
		this.next = null;
	}
	

public Node6() {
		// TODO Auto-generated constructor stub
	}


public Node6 head=null;
public Node6 tail=null;

public void  addAtEnd(int data)
{
Node6 newNode=new Node6(data);	

if(head==null)
{
	head=newNode;
	tail=newNode;
}
else {
	tail.next=newNode;
	tail=newNode;
}
}
void display() {
	Node6 current=head;
	if(head==null)
	{
		System.out.println("list is empty");
		return;
		
	}
	System.out.println("adding nodes to the end of the list");
	while(current!=null) {
		System.out.println(current.data+" ");
		current=current.next;
	}
	System.out.println();
	
}
void inserAfter(Node6 prevNode,int newdata) {
	   
	if(prevNode==null)
	   {
		   System.out.println("previous node cannot be null");
		   return;
	   }
	Node6 newNode=new Node6(newdata);
	newNode.next=prevNode.next;
	prevNode.next=newNode;
}





public static void main(String[] args) {
	Node6 node = new Node6();
	node.addAtEnd(70);
	node.display();
	
	node.addAtEnd(56);
	node.display();
	node.inserAfter(2, 30);
}


private void inserAfter(int i, int newdata) {
	System.out.println(" "+newdata);
}



}



