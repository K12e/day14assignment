package LinkedList;

class Node {
	int data;
	Node next;
	public Node(int data) {
		
		this.data = data;
		this.next = null;
	}
	

public Node() {
		// TODO Auto-generated constructor stub
	}


public Node head=null;
public Node tail=null;

public void  addAtEnd(int data)
{
Node newNode=new Node(data);	

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
	Node current=head;
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

public static void main(String[] args) {
	Node node = new Node();
	node.addAtEnd(70);
	node.display();
	node.addAtEnd(30);
	node.display();
	node.addAtEnd(56);
	node.display();
	
}


public void inserAfter(int i, int j) {
	// TODO Auto-generated method stub
	System.out.println(""+data);
}


}