package linkedList;

public class DriveLinkedList {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
        LinkedList obj1=new LinkedList();
        LinkedList obj2=new LinkedList();
        LinkedList obj3=new LinkedList(); //merging sorted values in third linked list
        obj1.head=new Node(5);
        
        obj1.addAtLast(new Node(45));
        obj1.addAtLast(new Node(211));
        System.out.println("first list");
        obj1.printlist();
       obj2.head=new Node(4);
        obj2.addAtLast(new Node(44));
        obj2.addAtLast(new Node(533));
        System.out.println("Second list");
        obj2.printlist();
        obj3.head=new MergeLists().merge2Lists(obj1.head, obj2.head);
        System.out.println("Third list");
        obj3.printlist();
        System.out.println("Without creating third list");
        //if we do not want to bring in 3rd linked list
        */
		
		/*  For Doubly Linked List
       System.out.println("Double Linked List start");
       DoubleLinkedList db=new DoubleLinkedList();
       db.head=new Node(4);
       db.insert(db.head, 5);
       db.insert(db.head, 6);
       db.printList(db.head);
       System.out.println("Insertion in front");
       db.insertAtStart(3);
       db.printList(db.head);
        System.out.println("Insertion At Rear:");
        db.insertAtEnd(7);
        db.printList(db.head);
        db.insertAfter(db.head.next, 1234567);
        db.printList(db.head);
        db.printMiddleNode(db.head);
        System.out.println("Deletion in progress");
        db.deleteNode(db.head.next.next);
        db.printList(db.head);
        System.out.println("Reversal in progress ");
        db.reverseDoublyLinkedList(db.head);
        db.printList(db.head);
        db.printNthLast(2, db.head);
        */
		//circular linked list
		CircularLinkedList clr=new CircularLinkedList();
		clr.addToEmpty(4);
		clr.addAtEnd(5);
		clr.addAfter(5, 6);
		clr.traverse();
	System.out.println(clr.last.next.data + " is a node");
	clr.deleteNode(clr.last.next.next); //should delete 4
	clr.traverse();
	clr.reverse();
	clr.traverse();
	clr.noOfNodes();
	clr.splitIntoTwo();
	System.out.println(" Doubly Circular Linked List :");
	CircularDoublyLinkedList cdl=new CircularDoublyLinkedList();
	cdl.addNodeAtBeginning(3);
	cdl.addNodeAtBeginning(7);
	cdl.traverse();
	cdl.addAtLast(2);
	cdl.traverse();
	cdl.addedAfterValue(7, 8);
	System.out.println("Computation in progress");
	cdl.traverse();
	System.out.println("Reverse in progress");
	cdl.reverse();
	cdl.traverse();
	System.out.println("deletion in progress");
	cdl.deleteAtStart();
	cdl.traverse();
	System.out.println("Deletion at end started");
	cdl.deleteAtEnd();
	cdl.traverse();
	cdl.deleteAValue(3);
	cdl.traverse();
	cdl.addAtLast(9);
	cdl.traverse();
	cdl.splitIntoTwo();
	
	
	}

}
