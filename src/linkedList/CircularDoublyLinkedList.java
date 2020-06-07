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
public void reverse()
{
	Node current=head;
	Node ahead=null;
	if(head==null)
		return;
	else
	{
		do
		{
			 ahead=current.next;
			current.next=current.prev;
			current.prev=ahead;
			current=ahead;
		}while(current!=head);
		head=current.next;  //since using while(current!=head),before coming out of loop current will go to the older head,
	}                       //so doing head=current.next will then make last node before previous head as new head 
		
}
public void deleteAtStart()
{
	if(head==null)
		return ;
	else
	{
		head.prev.next=head.next;
		head.next.prev=head.prev;
		
		head=head.next;
		
	}
}
public void deleteAtEnd()
{ 
	Node last=head;
	if(head==null)
		return;
	
		
	while(last.next!=head)
		last=last.next;
	
	last.prev.next=last.next;
	last.next.prev=last.prev;
}
public void deleteAValue(int value)
{
	Node match=head.next;
	if(head==null)
		return;
	else if(head.data==value)
	{
		head.next.prev=head.prev;
		head.prev.next=head.next;
		head=head.next;
		return;
	}
	do
	{
		if(match.data==value)
		{
			match.prev.next=match.next;
			match.next.prev=match.prev;
		}
		match=match.next;
	}while(match!=head);
}
public void splitIntoTwo()
{
	Node slowpointer=head;
	Node fastpointer=head;
	//when only two elements
	if(fastpointer.next.next==head)
		fastpointer=fastpointer.next;
	while(fastpointer.next!=head && fastpointer.next.next!=head)
	{
		slowpointer=slowpointer.next;
		fastpointer=fastpointer.next.next;
	}
	Node head1=head;
	Node head2=slowpointer.next;
	fastpointer.next=slowpointer.next;
	slowpointer.next.prev=fastpointer;
	slowpointer.next=head1;
	head1.prev=slowpointer;
	System.out.println("first list after split");
	traverseWithHeadInfo(head1);
	System.out.println("second list after split");
	traverseWithHeadInfo(head2);
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
public void traverseWithHeadInfo(Node start)
{
	Node n=start;
	do
	{
		System.out.println(n.data);
		n=n.next;
	}while(n!=start);
}
}
