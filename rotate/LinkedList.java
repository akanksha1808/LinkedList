package linkedlist.rotate;

import java.util.Scanner;

public class LinkedList {

	Node head;
	
	class Node{
		
		int data;
		Node next;
		
		Node(){}
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public void add(int data){
		if(head==null)
			head=new Node(data);
		else{
			 Node temp1=new Node(data);
//			 temp.next=head;
//			 head=temp;
			Node temp2=head;
			while(temp2.next!=null){
				temp2=temp2.next;
			}
			temp2.next=temp1;
			
		}
		
	}
		public void show(){
	
			Node temp;
			temp=head;
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			
		}
		
		public void rotate(int n){
			Node last,temp;
			last=head;
			temp=head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=head;
			while(--n>0){
				temp=temp.next;
			}
			
			head=temp.next;
			temp.next=null;
		}
	
	
	public static void main(String[] args){
		

		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		 
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		
		l1.show();
		
		l1.rotate(n);
		System.out.println();
		l1.show();
	}
}
