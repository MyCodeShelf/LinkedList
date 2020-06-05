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
public void reverse() {
	if(last==null)
		return;
	Node head=last.next;
	Node prev=last;
	Node temp;
	do
	{
		temp=head; //should be there for the track of last node before encountering "last" so that we can set it as new last node
		temp.next=prev;  //or head.next = prev (no issues)
		head=head.next;
		prev=prev.next;
	}while(head!=last);
	last=temp; //taking last=head wont work because before checking whether head!=last ,due to do while
	//loop head gets incremented to last before termination of loop
	}
public void noOfNodes()
{
	Node head=last;
	int count=0;
	do
	{
		count=count+1;
		head=head.next;
	}while(head!=last);
	System.out.println(count + " is the size of the list");
}
//Split a Circular Linked List into two halves
public void splitIntoTwo()
{
	Node slowPointer=last.next;
	Node fastPointer=last.next;
	if(last.next==null)
		return;
	while(fastPointer.next!=last.next && fastPointer.next.next!=last.next)
	{
		slowPointer=slowPointer.next;
		fastPointer=fastPointer.next.next;
	}
	//applicable when only two nodes in list
	if (fastPointer.next.next == last.next) { 
        fastPointer = fastPointer.next; 
    } 
	Node head1=last.next;
	Node head2=null;
	if(last.next!=last) //when more than one node in the parent list
	head2=slowPointer.next;
	fastPointer.next=slowPointer.next; //makes the second list circular
	slowPointer.next=head1;
	
	System.out.println("first list");
	traverseUsingHead(head1);
	System.out.println("\nSecond list");
	traverseUsingHead(head2);
}
public void traverseUsingHead(Node head)
{
	Node temp =head; 
    if (head != null) { 
        do { 
            System.out.print(temp.data + " "); 
            temp = temp.next; 
        } while (temp != head); 
    } 
}
}
