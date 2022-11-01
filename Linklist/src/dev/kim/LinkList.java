package dev.kim;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkList<E> {
	//กำหนด head และ tail ให้เป็น null
	Node<E> head = null; 
	Node<E> tail = null;
	
	public LinkList() {
		head = null;
		tail = null;
	}
	//สร้าง method append เพื่อเพิ่ม Node ใน List
	public void append(E data) {
		Node<E> node = new Node<E>(data, null);
		
		if(head == null) { //ถ้าheadไม่มีข้อมูลให้ head และ tail เป็น Node ที่เพิ่มเข้าไป

			head = node;
			tail = node;
		}else {	//ถ้าheadมีข้อมูล ให้ tail.next เป็น Node
			tail.next = node;
			tail = node;
		}
	}

	// สร้าง Method insert เพื่อแทรก Node ใน List
	public void insert(E data, int index) {
		Node<E> node = new Node<E>(data, null);
		if (index == 0) { // ถ้าเพิ่ม Node ในตำแหน่งที่ 0 เป็นการแทรกหน้าแถว
			// ให้ Node.next เป็น head
			node.next = head;
			head = node;
			if (tail == null) {
				tail = head;
			}
		} else if (index > 0) { // ถ้าเพิ่ม Node ในตำแหน่งที่ index มากกว่า 0
			Node<E> pre = head;	//สร้าง Node pre เพื่อที่จะนำมา insert Node ในตำแหน่งที่ต้องการ
			for (int i = 0; i < index - 1 && pre.next != null; i++) {//สร้าง loop เพื่อให้ pre อยู่ในตำแหน่งที่เราต้องการ 
				pre = pre.next;
			}
			node.next = pre.next;//เมื่อ pre อยู่ในตำแหน่งที่ต้องการ จะทำการ insert Node 
			pre.next = node;

			if (node.next == null) {// กรณีที่เพิ่ม Node เข้าไปท้ายแถวให้ Node เป็น tail
				tail = node;
			}
		}
	}
	
	//สร้าง method printList เพื่อทำการ print Data ของแต่ละ Node ใน List ออกมา
	public void printList() {
		Node<E> p =  head;
		System.out.print(" => ");
		while(p != null) {
			System.out.print(p.data + " => ");
			p = p.next;
		}
		System.out.print("teil");
		System.out.println("||");
	}
}