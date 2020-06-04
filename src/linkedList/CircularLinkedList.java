package linkedList;

public class CircularLinkedList {
Node last;
public CircularLinkedList() {
	// TODO Auto-generated constructor stub
	last=null;
}
public  void addToEmpty(int data)
{
	Node first=new Node(data);
	if(last==null)
		last=first;
	last.next=last;
		
}
public  void addAtEnd(int data)
{
	
	if(last==null)
	addToEmpty(data);
	else
	{
		Node end=new Node(data);
		end.next=last.next;
		last.next=end;
		last=end;
		
	}
	
}
public void addAfter(int afterData ,int dataToBeAdded)
{
	if(last==null)
		return;
	Node head=last.next;
	do
	{
		if(head.data==afterData)
		{
			Node placed=new Node(dataToBeAdded);
			placed.next=head.next;
			head.next=placed;
			return;
		}
		else
			head=head.next;
	}while(head!=last.next);
}
public void traverse()
{
	Node head=last.next;
	//if we use while loop so logic while(head!=last.next) wont let the traversal for first time as well
	//do..while will let the control flow inside do block without checking the condition 
	//inside do head is shifted to next and single traversal becomes possible
	do
	{
		System.out.println(head.data);
		head=head.next;
	}while(head!=last.next);
	
}
public void deleteNode(Node del)
{
	if(last==null)
		return;
	Node head=last.next;
	Node prev=last;
	do
	{
		if(head==del)
		{
			prev.next=head.next;
			return;
		}
		else
		{
			head=head.next;
			prev=prev.next;
		}
	}while(head!=last.next);
}
}
