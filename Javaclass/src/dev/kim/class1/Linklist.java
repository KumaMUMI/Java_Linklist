package dev.kim.class1;

public class Linklist<E> {

	Node<E> head = null;
	Node<E> tail = null;

	public Linklist() {
		head = null;
		tail = null;
	}

	public void append(E data) {
		Node<E> node = new Node<E>(data, null);

		if (head == null) {
			head = node;
			tail = node;

		} else {
			tail.next = node;
			tail = node;

		}
	}
	
	public void insert(E data, int index) {
		Node<E> node = new Node<E>(data,null);
		if (index == 0) {
			node.next = head;
			head =node;
			if(tail == null) {
				tail = head;
			}
		}else if(index > 0) {
			Node<E> pre = head;
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
		if (index == 0) {
			if(head != null) {
				head = head.next;	
			}
		}else if (index > 0 ) {
			Node<E> pre = head;
			for(int i =0 ;i<index-1 && pre.next != null;i++) {
				pre = pre.next;
			}
			if( pre.next == null) {
				
				
				
			}else {
				
				pre.next= pre.next.next; 
				if(pre.next == null) {
					tail = pre;
				}
			}
		}
	}
	
	public void show() {
		Node<E> p = head;
		System.out.print("head -> ");
		while (p != null) {
			
			System.out.print(p.data + " -> ");
			p = p.next;
			
		}
		System.out.println("/");
	}


	public void show(String msg) {
		System.out.print(msg + " : ");
		this.show();
	}
	public E get(int index) {
		Node<E> p = head;
		
		for(int i=0;i<index && p != null;i++) {
			p = p.next;
		}
		if( p == null) {
			return null;
		}else {
			return p.data;
		}
	}
	
	
	public void set(int index,E data) {
		Node<E> p = head;
		
		for(int i=0;i<index && p != null;i++) {
			p = p.next;
		}
		if( p == null) {
			
		}else {
			p.data = data;
		}
	}

}
