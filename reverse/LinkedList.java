package linkedlist.reverse;


public class LinkedList {
	
	static Node head;
	
	static class Node{
		
		int data;
		Node next;
		Node(int newdata)
		{
			data=newdata;
			next=null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList list =new LinkedList();
		list.head=new Node(1);
		list.head.next=new Node(2);
		list.head.next.next=new Node(3);
		list.head.next.next.next=new Node(4);
		
		list.printList(head);
		System.out.println();
		head=list.reverseList(head);
		list.printList(head);
		
		
		
	}

	 Node reverseList(Node node) {
		// TODO Auto-generated method stub
		Node prev=null;
		Node current=node;
		Node next=null;
		
		while(current != null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		node=prev;
		return node;
	}

	/**
	 * @param node
	 */
	void printList(Node node) {
		// TODO Auto-generated method stub
		while(node!=null)
		{
			System.out.print(node.data + " ");
		    node=node.next;
		}
	}

}
