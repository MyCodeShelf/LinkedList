package linkedList;

public class DoubleLinkedList {
Node head;
public DoubleLinkedList()
{
	head=null;
}
//to insert/push into a doubly linked list
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
//node insertion at front 
public void insertAtStart(int new_data)
{
	Node new_node=new Node(new_data);
	new_node.next=head;
	new_node.prev=null;
	head.prev=new_node;
	head=new_node;
}
//node insertion at rear
public void insertAtEnd(int new_data)
{
	Node new_node=new Node(new_data);
	Node last=head;
	while(last.next!=null)
	{
		last=last.next;
		
	}
	last.next=new_node;
	last.next.prev=last;
	new_node.next=null;
}
//Given a node as prev_node, insert a new node after the given node
public void insertAfter(Node prev_node ,int new_data)
{
	Node new_node=new Node(new_data);
	prev_node.next.prev=new_node;
	new_node.next=prev_node.next;
	new_node.prev=prev_node;
	prev_node.next=new_node;
}
//FINDING middle element of a doubly linked list
public void printMiddleNode(Node head)
{
	Node slowPointer=head;
	Node fastPointer=head;
	if(head!=null)
	{
	while(fastPointer!=null && fastPointer.next!=null)
	{
		slowPointer=slowPointer.next;
		fastPointer=fastPointer.next.next;
	}
	System.out.println("Middle Element is :" +slowPointer.data);
	}}
public void deleteNode(Node head)
{
	head.prev.next=head.next;
	head.next.prev=head.prev;
}
public void reverseDoublyLinkedList(Node head)
{
	
}
public void printList(Node head)
{
	Node last=null;
	while(head!=null)
	{
		System.out.println(head.data);
		last=head;
		head=head.next;
	}
	
	System.out.println("From reverse");
	while(last!=null)
	{
		System.out.println(last.data);
		last=last.prev;
	}
	
}
}
