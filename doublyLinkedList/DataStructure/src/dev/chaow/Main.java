package dev.chaow;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		
		list.append(1);
		list.append(2);
		
		
		
		list.insert(0, 0);
		list.insert(2, 2);
		list.insert(6, 100);
		
		list.show("Insert");
		list.append(7);
		list.show("Test append after insert");
		
		//list.remove(0);
		//list.show("Remove Index 0");
		//list.remove(2);
		//list.show("Remove Index 2");
		//list.remove(100);
		//list.show("Remove Index 100");
		//list.remove(6);
		//list.show("Remove Index 6");
		
		//System.out.println(list.get(0));
		//System.out.println(list.get(3));
		//System.out.println(list.get(5));
		//list.set(3,100);
		//System.out.println(list.get(3));


	}

}
