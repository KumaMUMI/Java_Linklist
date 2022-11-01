package dev.chaow;

public class Node<E> {

	E data;
	Node next;
	
	public Node(E data, Node<E> next){
		this.data = data;
		this.next = next;
	}
	
	
}
