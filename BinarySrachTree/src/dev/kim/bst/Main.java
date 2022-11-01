package dev.kim.bst;

public class Main {
	public static void main(String[] args) {
		int []arr = new int[] {8,3,10,1,6,14,4,7,13};
		BinarySearchTree tree = new BinarySearchTree(arr[0]);
		
		for(int i = 1 ; i< arr.length ;i++) {
			tree.addNode(arr[i]);
		}
		
		tree.printTreeDepthFirstSearch(0);
		System.out.println("Ascending");
		tree.printAscending();
		System.out.println("Deascending");
		tree.printDeascending();
	}
}
