package dev.kim.class1;

public class Main {

	public static void main(String[] args) {
		
		Linklist<Integer> k = new Linklist<>();
		
		k.append(1);
		k.append(2);
		k.append(3);
		k.show("Add_1-3");
		
		k.insert(0, 0);
		k.insert(2, 4);
		k.insert(6, 100);
		
		k.show("Insert");
		k.append(7);
		k.show("Test append after insert");
		
		k.remove(0);
		k.show("Remove Index 0");
		k.remove(2);
		k.show("Remove Index 2");
		k.remove(100);
		k.show("Remove Index 100");
		k.remove(6);
		k.show("Remove Index 6");
		
		System.out.println(k.get(0));
		System.out.println(k.get(3));
		System.out.println(k.get(5));
		k.set(3,100);
		System.out.println(k.get(3));
	}

}
