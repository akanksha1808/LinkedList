package linkedlist.delete;



public class LinkedList {

	Node head;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int new_data)
		{
			data=new_data;
			next=null;
		}
	}
	
	public static void main(String args[])
	{
		LinkedList list= new LinkedList();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		
		
		list.printlist();
		
		list.deleteByValue(2);
		System.out.println();
		list.printlist();
		
		list.deleteByPosition(1);
		System.out.println();
		list.printlist();

	    list.deleteAll();
	    System.out.println();
	    list.printlist();
	}

	private void deleteAll() {
		head=null;
		//System.out.println("Deleted");
	}

	private void deleteByPosition(int pos) {

		Node temp=head;
		Node prev=null;
	if(pos==0)
	{
		head=temp.next;
	}
	else{
		for(int i=0;i<=pos-1;i++)
		{
			prev=temp;
			temp=temp.next;
		}
	prev.next=temp.next;
	}
	}

	private void deleteByValue(int data) {
	
	Node n=head;
	Node prev=null;
	if(n!=null && n.data==data)
	{
		head=n.next;
	}
	while(n!=null && n.data!=data)
	{
		prev=n;
		n=n.next;
	}
	if(n==null)
		return;
	prev.next=n.next;
				
	}

	private void printlist() {

	if(head==null)
		System.out.println("LL is empty");
	else
	{
		Node n=head;
		  while(n!=null)
		  {
			  System.out.print(n.data+" ");
			  n=n.next;
		  }
	}
	}

	private void push(int data) {
		if(head==null)
			head=new Node(data);
		else
		{
			Node temp=new Node(data);
			temp.next=head;
			head=temp;
		}
	}
}
