package dev.kim;

public class DoublyLinkList<E> {

	DoublyNode<E> head = null;
	DoublyNode<E> tail = null;

	public DoublyLinkList() {
		// TODO Auto-generated constructor stub
		head = null;
		tail = null;
	}

	public void append(E data) {
		// TODO Auto-generated method stub

		DoublyNode<E> node = new DoublyNode<E>(data, null, null);

		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.prev = tail;
			tail.next = node;
			tail = node;
		}
	}

	public void insert(E data, int index) {
		// TODO Auto-generated method stub
		DoublyNode<E> node = new DoublyNode<E>(data, null, null);

		if (index == 0) {

			head.prev = node;
			node.next = head;
			head = node;
			if (tail == null) {
				tail = head;
			}
		} else if (index > 0) {
			DoublyNode<E> pre = head;
			for (int i = 0; i < index && pre.next != null; i++) {
				pre = pre.next;
			}
			if (pre.next != null) {
				pre.prev.next = node;
				node.prev = pre.prev;
				pre.prev = node;
				node.next = pre;
			} else {
				append(data);
			}
			if (node.next == null) {
				tail = node;
			}
		}

	}

	public void remove(int index) {
		// TODO Auto-generated method stub
		if (index == 0) {

			head = head.next;
			head.prev = null;
		} else {
			DoublyNode<E> pre = head;
			for (int i = 0; i < index && pre.next != null; i++) {
				pre = pre.next;
			}
			if (pre.next == null) {
				tail = pre.prev;
				tail.next = null;

			} else {
				pre.prev.next = pre.next;
				pre.next.prev = pre.prev;

			}

		}
	}

	public void show() {
		// TODO Auto-generated method stub
		DoublyNode<E> pre = head;
		System.out.print("head -> ");
		while (pre != null) {

			System.out.print(pre.data + " -> ");
			pre = pre.next;

		}
		System.out.println("/");
	}

	public void show(String msg) {
		System.out.print(msg + " : ");
		this.show();
	}

	public E get(int index) {
		DoublyNode<E> p = head;

		for (int i = 0; i < index && p != null; i++) {
			p = p.next;
		}
		if (p == null) {
			return null;
		} else {
			return p.data;
		}
	}

	public void set(int index, E data) {
		DoublyNode<E> p = head;

		for (int i = 0; i < index && p != null; i++) {
			p = p.next;
		}

		p.data = data;

	}

}
