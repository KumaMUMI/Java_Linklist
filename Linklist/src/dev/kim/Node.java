package dev.kim;

public class Node<E> {
	//สร้างคลาสNodeเพื่อนำNodeไปใช้งาน
	E data;
	Node next;
	
	public Node(E data, Node<E> next){
		this.data = data;
		this.next = next;
	}
	
	
}
