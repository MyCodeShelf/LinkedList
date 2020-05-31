package linkedList;

public class DoubleLinkedList {
Node root;
public DoubleLinkedList()
{
	root=null;
}
public void insert(Node head,int new_data)
{
	if(head==null)
	{
    head=new Node(new_data);
	head.next=null;
	head.prev=null;
	return;
	}
	else if(head.next!=null)
	{
		head=head.next;
	}
	head.next=new Node(new_data);
	head.next.next=null;
	head.next.prev=head;
	
}
public void printList(Node root)
{
	Node last=null;
	while(root!=null)
	{
		System.out.println(root.data);
		last=root;
		root=root.next;
	}
	
	System.out.println("From reverse");
	while(last!=null)
	{
		System.out.println(last.data);
		last=last.prev;
	}
	
}
}
