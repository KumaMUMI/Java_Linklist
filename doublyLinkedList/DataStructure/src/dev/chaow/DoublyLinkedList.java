package dev.chaow;

public class DoublyLinkedList<E> {
	
	DoublyNode<E> head = null ;
	DoublyNode<E> tail = null;
	
	public DoublyLinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
		tail = null;
	}
	
	public void append(E data) {
		// TODO Auto-generated method stub
		
		DoublyNode<E> node = new DoublyNode<E>(data, null, null);
		
		if(head == null) {
			head = node;
			tail = node;
		}else {
			node.prev = tail;
			tail.next = node;
		}
	}
	
	public void insert(E data,int index) {
		// TODO Auto-generated method stub
		DoublyNode<E> node = new DoublyNode<E>(data, null, null);
		
		if (index == 0) {

			head.prev=node;
			node.next=head;
			head = node;
			if(tail == null) {
				tail = head;
			}
		}else if(index > 0) {
				DoublyNode<E> pre  = head;
				for(int i =0 ;i<index-1 && pre.next != null;i++) {
					pre = pre.next;
				}
				node.next = pre.next;
				pre.next = node;
				
				if(node.next == null) {
					tail = node;
				}
		}
		
	}
	
	public void remove(int index) {
		// TODO Auto-generated method stub

	}
	
	public void show() {
		// TODO Auto-generated method stub
		DoublyNode<E> pre = head;
		System.out.print("head -> ");
		while(pre != null) {

			System.out.print(pre.data + " -> ");
			pre = pre.next;
			
		}
		System.out.println("/");
	}
	
	
	
	
	
}
