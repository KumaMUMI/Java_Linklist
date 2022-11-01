package dev.kim;

public class DoublyNode<E> {

	E data;
	DoublyNode<E> prev;
	DoublyNode<E> next;
	
	public DoublyNode(E data, DoublyNode<E> next, DoublyNode<E> prev){
		this.data = data;
		this.next = next;
		this.prev = prev;
		
	}
	
	
}
