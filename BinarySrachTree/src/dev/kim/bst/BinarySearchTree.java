package dev.kim.bst;

public class BinarySearchTree {
	
	int data ;
	BinarySearchTree left = null ;
	BinarySearchTree right = null ;
	
	public BinarySearchTree(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		
	}
	
	public void addNode(int data) {
		if (data >= this.data) {
			if (this.right == null) {
				this.right = new BinarySearchTree(data);
			} else {
				this.right.addNode(data);

			}

		}else {
			if(this.left == null) {
				this.left = new BinarySearchTree(data);
			}else {
				this.left.addNode(data);
			}
		}

	}
	
	public void printTreeDepthFirstSearch(int level) {
		
		for (int i = 0; i < level; i++) {
			System.out.print("=");
		}

		System.out.print(">");
		System.out.println(data);
		
		if(this.left != null  ) {
			this.left.printTreeDepthFirstSearch(level+1);
		}
		if(this.right != null) {
			this.right.printTreeDepthFirstSearch(level+1);
		}
		
		
	}
	
	public void printAscending() {
		
		if(this.left != null  ) {
			this.left.printAscending();
		}
		System.out.println(this.data);
		if(this.right != null) {
			this.right.printAscending();
		}
		
	}
	
	public void printDeascending() {

		if (this.right != null) {
			this.right.printDeascending();
		}
		System.out.println(this.data);
		if (this.left != null) {
			this.left.printDeascending();
		}

	}
	
	

}
