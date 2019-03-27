package linkedlist.length;



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
	
	public static void main(String[] args) {
    LinkedList list =new LinkedList();
    list.push(1);
    list.push(2);
    list.push(3);
    list.push(4);
    list.push(5);
    
    list.printlist();
    System.out.println();
    list.length();
    System.out.println("test");
		
	}

	private void length() {
	
	Node n=head;
	int count=0;
	
		while(n!=null)
		{
			count++;
			n=n.next;
		}
	System.out.println(count);
	}

	private void printlist() {
	
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+ " ");
			n=n.next;
		}
	
	}

	private void push(int data) {
	
		if(head==null)
		{
			Node new_node= new Node(data);
			head=new_node;
		}
		else
		{
			Node new_node=new Node(data);
			new_node.next=head;
			head=new_node;
		}
	}

}
