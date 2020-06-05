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
	return addNodeAtBeginning(value);
	else if(head.next==head)
	{
		Node second=new Node(value);
		head.next=second;
		second.prev=head;
		second.next=head;
		head.prev=second;
		return second;
	}
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
	
}
public void addedAfterValue(int value , int newData)
{
	if(head==null)
	{
		System.out.println("empty list");
		return;
	}
	else if(head.next==head)
	{
		if(head.data==value)
		{
		head.next=new Node(newData);
		head.next.prev=head;
		head.next.next=head;
		head.prev=head.next;
		return;
		}
	}
	else
	{
		while(head.next!=head)
		{
			if(head.data==value)
			{
				Node newAdd=new Node(newData);
				newAdd.next=head.next;
				head.next.prev=newAdd;
				newAdd.prev=head;
				head.next=newAdd;
				return;
			}
			head=head.next;
		}
	}
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
