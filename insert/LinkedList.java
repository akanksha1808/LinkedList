package linkedlist.insert;


class LinkedList {

	Node head;

	class Node {

		int data;
		Node next;

		Node(int new_data) {
			data = new_data;
			next = null;
			
		}
	}

	public static void main(String args[]) {

		LinkedList list = new LinkedList();
		list.push(10);
		list.push(20);
		list.push(30);
        list.append(40);
        list.insertAfter(list.head.next,50);
		list.print();
		System.out.println("test");
	}

	private void insertAfter(Node prev_node, int data) {
		if(prev_node==null)
			return;
		else{
			Node new_node=new Node(data);
			new_node.next=prev_node.next;
			prev_node.next=new_node;
		}
	}

	private void append(int data) {
		
		if(head==null)
			head=new Node(data);
		
		else{
			Node temp=new Node(data);
			Node n=head;
			while(n.next!=null)
				n=n.next;
			n.next=temp;
		}
	}

	private void print() {

		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	private void push(int data) {

		if (head == null)
			head = new Node(data);
		else {
			Node temp = new Node(data);
			temp.next = head;
			head = temp;
		}
	}
}
