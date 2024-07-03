package datastructures.linear;

class Node{
	int key;
	Node prev;
	Node next;
	Node(){
		prev=null;
		next=null;
	}
}

class DoublyLinkedList{
	static Node head=null;
	static Node first=null;
	static Node tail=null;
	static Node temp=null;
	static int i=0;
	
	 void addNode(int k){
		Node ptr=new Node();
		ptr.key=k;
	
		ptr.next=null;
		ptr.prev=null;
		if(head==null) {
			head=ptr;
			first=head;
			tail=head;
		}
		else
		{
			temp=ptr;
			first.next=temp;
			temp.prev=first;
			first=temp;
			tail=temp;
		}
		i++;
	}
	
	void traverse(){
		Node ptr=head;
		if(head==null)
			System.out.println("list is empty");
		else {
		while(ptr!=null) {
			System.out.println(ptr.key+" ");
			ptr=ptr.next;
		}
		System.out.println();
		}
	}
	
	 void insertAtBegining(int k) {
		Node ptr=new Node();
		ptr.key=k;
		ptr.next=null;
		ptr.prev=null;
		if(head==null) {
			first = ptr;
			head=first;
			tail=head;
		}
		else {
			temp=ptr;
			temp.next=head;
			head.prev=temp;
			head=temp;
		}
		i++;
	}
	
	 void insertAtEnd(int k) {
		Node ptr=new Node();
		ptr.key=k;
		ptr.next=null;
		ptr.prev=null;
		if(head==null) {
			first = ptr;
			head=first;
			tail=head;
		}
		else {
			temp=ptr;
			temp.prev=tail;
			tail.next=temp;
			tail=temp;
		}
		i++;
	}
	
	void insertAtPosition(int k, int pos) {
		if(pos<1 && pos > i+1)
			System.out.println("Enter a valid position");
		else if(pos==1) {
			insertAtBegining(k);			
		}else if(pos==i+1) {
			insertAtEnd(k);
		}else {
			Node src=head;
			while(pos--!=0)
				src=src.next;
			Node nodeA,nodeB;
			Node ptr=new Node();
			ptr.next=null;
			ptr.prev=null;
			ptr.key=k;
			
			nodeB=src;
			nodeA=(src.prev);
			ptr.next=nodeB;
			ptr.prev=nodeA;
			nodeA.next=ptr;
			nodeB.prev=ptr;
			i++;
		}
	}
	
	void deleteAtBegining() {
		head=head.next;
		i--;
	}
	
	void deleteAtEnd() {
		tail=tail.prev;
		tail.next=null;
		i--;
	}
	
	void deleteAtPos(int pos) {
		if(pos<1||pos>i+1)
			System.out.println("Enter a valid position");
		else if(pos==1)
			deleteAtBegining();
		else if(pos==i)
			deleteAtEnd();
		else {
			Node src=head;
			pos--;
			while(pos-- !=0) {
				src=src.next;
			}
			Node prev,aftr;
			prev=(src.prev);
			aftr=src.next;
			prev.next=aftr;
			aftr.prev=prev;
		}
	}
	
}

public class Doubellinkedlist {

	public static void main(String[] args) {
		DoublyLinkedList dl=new DoublyLinkedList();
		dl.addNode(10);
		dl.addNode(20);
		dl.addNode(30);
		dl.addNode(40);
		dl.addNode(50);
		dl.addNode(60);
		dl.addNode(70);
		dl.addNode(80);
		dl.addNode(90);
		dl.addNode(100);
		
		dl.traverse();

		dl.insertAtBegining(110);
		dl.traverse();
		
		dl.insertAtEnd(120);
		dl.traverse();
		
		dl.insertAtPosition(130, 6);
		dl.traverse();
		
		dl.deleteAtBegining();
		dl.traverse();
		
		dl.deleteAtEnd();
		dl.traverse();
		
		dl.deleteAtPos(5);
		dl.traverse();
		
	}

}
