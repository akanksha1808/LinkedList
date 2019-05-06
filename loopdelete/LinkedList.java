package linkedlist.loopdelete;

public class LinkedList {
 
	Node head;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	
	public void add(int data) {
		
		if(head==null)
			head= new Node(data);
		else
		{
			Node temp=new Node(data);
			temp.next=head;
			head=temp;
		}
		
	}
	
	public void print()
	{
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+ " ");
			temp=temp.next;
			
		}
	}
	
	public void loop() {
		Node fast=head;
		Node slow=head;
		
		while((slow!=null)  && (fast!=null) && (fast.next!=null) ) {
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow == fast) {
				slow=head;
				while(slow.next!=fast.next) {
					slow=slow.next;
					fast=fast.next;
				}
				fast.next=null;
			}
			
			}
		System.out.println("loop removed");
	}
	
	
	public static void main(String... strings)
	{
	  
	  LinkedList list=new LinkedList();
	  list.add(1);
	  list.add(2);
	  list.add(3);
	  list.add(4);
	  list.print();
	  list.head.next.next.next.next=list.head;
		//list.print();
		list.loop();
		
	}
	
	
}
