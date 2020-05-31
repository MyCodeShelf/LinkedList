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
       System.out.println("Double Linked List start");
       DoubleLinkedList db=new DoubleLinkedList();
       db.root=new Node(4);
       db.insert(db.root, 5);
       db.insert(db.root, 6);
       db.printList(db.root);
       
        
        
	}

}
