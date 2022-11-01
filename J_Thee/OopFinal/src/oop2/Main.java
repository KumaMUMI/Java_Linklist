package oop2;

public class Main {
	public static void main(String[] args) {

		Toy k = new Toy("kago", 1200, "car");

		System.out.println(k.calDiscountPrice());
		System.out.println(k.calDiscountPrice(700));

		System.out.println(k.toString());
	}
}
