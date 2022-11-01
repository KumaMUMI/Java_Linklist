package dev.kim;

public class Queue {
	
	int capacity;
	int size;
	int front;
	int rear;
	int arry[];
	
	public Queue(int capacity) {
		// TODO Auto-generated constructor stub
		this.capacity = capacity;
		this.size=0;
		this.front =0;
		this.rear=0;
		this.arry = new int[capacity];
	}
	
	public boolean isFull() {
		if (size == capacity) {
			return  true;
		}else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(size==0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public void enqueue(int data) {
		// TODO Auto-generated method stub
		if (!isFull()) {
			arry[rear]=data;
			size= size + 1 ;
			rear=(rear+1)%capacity;
			
		}else {
			System.out.println("Queue overflow");
		}
	}
	
	public int dequeue() {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
			int data = arry[front];
			size= size - 1 ;
			front=(front+1)%capacity;
			return data;
		}
		System.out.println("Queue underflow");
		return -1;
	}
	
	public void show() {
		// TODO Auto-generated method stub
		for(int i=0; i < this.size ; i++) {
			int index = (i+front)%capacity;
			System.out.print(this.arry[index]+" ");
		}
		System.out.println("");
	}

}
