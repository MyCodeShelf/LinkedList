package linkedList;

public class LinkedList {
Node head;
public void addAtLast(Node add)
{
	Node n=head;
	while(n.next!=null)
	{
		n=n.next;
	}
	n.next=add;
}
public void printlist()
{
	Node dnd=head;
	while(dnd!=null)
	{
		System.out.println(dnd.data);
		dnd=dnd.next;
	}
}
}
