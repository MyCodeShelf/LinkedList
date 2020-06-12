package linkedList;

public class LinkedList {
Node head;
public void addAtStart(int data)
{
	Node add=new Node(data);
	if(head==null)
	head=add;
	else
	{
	add.next=head;
	head=add;
	}
}
public void addAtLast(int data)
{
	Node add=new Node(data);
	Node n=head;
	while(n.next!=null)
	{
		n=n.next;
	}
	n.next=add;
}
public void AddAfterValue(int afterVal , int newData)
{
	Node addAfter=new Node(newData);
	Node n=head;
	if(head==null)
		return;
	else
	{
		while(n!=null)
		{
			if(n.data==afterVal)
			{
				addAfter.next=n.next;
				n.next=addAfter;
				return;
			}
			n=n.next;
		}
	}
}
public void deleteAtBeginning()
{
	
	if(head==null)
		return;
	else 
	{
		head=head.next;
	}
}
public void deleteAtEnd()
{ Node secondlast=null;
  Node last=null;
	Node n=head;
	if(head==null)
		return;
	else if(head.next==null)
		head=null;
	else
	{
	while(n.next!=null)
	{
		secondlast=n;
	last=secondlast.next;
		n=n.next;
	}
	secondlast.next=null;
	return;
	}
}
public void  deleteAvalue(int value)
{   Node n=head;
Node before=null;
	if(head==null)return;
	else if(head.data==value) 
	{
		head=head.next;
		return;
		
	}
	while(n.data!=value && n.next!=null)
	{  before=n;
		n=n.next;
	}
	before.next=n.next;
}
public void reverseList()
{
	Node prev=null;
	Node next=null;
	Node current=head;
	if(head==null)
		return;
	while(current!=null)
	{
		next=current.next;
		current.next=prev;
		prev=current;
		current=next;
	}
	head=prev; //cannot use head=current as in last run prev becomes current and current gets incremented to next without being checked for null
}
public void splitIntoTWO()
{
	Node slowPointer=head ;
	Node fastPointer=head;
	if(head==null)
		return;
	while(fastPointer.next!=null && fastPointer.next.next!=null)
	{
		slowPointer=slowPointer.next;
		fastPointer=fastPointer.next.next;
	}
	Node head2=slowPointer.next;
	slowPointer.next=null;
	fastPointer.next=null;
	printlistUsingHead(head);
	printlistUsingHead(head2);
}
public void printlist()
{
	Node dnd=head;
	while(dnd!=null)
	{
		System.out.print(dnd.data+"-->");
		dnd=dnd.next;
	}
	System.out.println();
}
public void printlistUsingHead(Node provided)
{
	Node dnd=provided;
	while(dnd!=null)
	{
		System.out.print(dnd.data+"-->");
		dnd=dnd.next;
	}
	System.out.println();
}
}
