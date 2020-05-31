package linkedList;

public class MergeLists {
public Node merge2Lists(Node Headfirst , Node Headsecond)
{
	Node dummy=new Node(0);
	Node tail=dummy;
	while(true)
	{
		if(Headfirst==null)
		{
		tail.next=Headsecond;
		break;
		}
		if(Headsecond==null)
		{
			tail.next=Headfirst;
			break;
		}
		if(Headfirst.data<=Headsecond.data)
		{
			tail.next=Headfirst;
			Headfirst=Headfirst.next;
		}
		else
		{
			tail.next=Headsecond;
			Headsecond=Headsecond.next;
		}
	tail=tail.next;		
	
	}
return dummy.next;
}
}
