package datastructures.linear;

class LinkedList{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data =d;
			next=null;
		}
	}
	public static LinkedList insert(LinkedList list,int data){
		Node new_node=new Node(data);
		if(list.head==null)
			list.head=new_node;
		else {
			Node last=list.head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=new_node;
		}
		return list;
	}
	
	public static void printList(LinkedList list) {
		Node currNode=list.head;
		System.out.println("Linked list:");
		while(currNode!=null) {
			System.out.println(currNode.data+" ");
			currNode=currNode.next;
		}
	}
}


public class LinkedListOperations {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list=LinkedList.insert(list,10);
		list=LinkedList.insert(list,20);
		list=LinkedList.insert(list,30);
		list=LinkedList.insert(list,40);
		list=LinkedList.insert(list,50);
		list=LinkedList.insert(list,60);
		list=LinkedList.insert(list,70);
		list=LinkedList.insert(list,80);
		list=LinkedList.insert(list,90);
		list=LinkedList.insert(list,100);
		LinkedList.printList(list);
	}

}
