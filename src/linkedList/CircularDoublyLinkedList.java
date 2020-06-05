package linkedList;

public class CircularDoublyLinkedList {
Node head;  //or start
public CircularDoublyLinkedList() {
	
}
public Node addNodeAtBeginning(int data)
{
	if(head==null)
	{
	 head=new Node(data);
	 head.next=head;
	 head.prev=head;
			 return head;
	}
	else 
	{
		Node newNode=new Node(data);
		newNode.next=head;
		newNode.prev=head.prev;
		head.prev.next=newNode;
		head.prev=newNode;
		head=newNode;
		return newNode;
		
	}

	}
public Node addAtLast(int value)
{
	if(head==null)
	addNodeAtBeginning(value);
	else
	{
		Node last=head;
		while(last.next!=head)
		last=last.next;
		
		last.next=new Node(value);
		last.next.prev=last;
		last=last.next;
		head.prev=last;
		last.next=head;
		
		return last;
				
	}
	return head;
}
public void traverse()
{
	Node n=head;
	do
	{
		System.out.println(n.data);
		n=n.next;
	}while(n!=head);
}
}
