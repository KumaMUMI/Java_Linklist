package oop2;

public class Toy {

	public String name;
	public int price;
	public String type;

	public Toy(String nameToy, int priceToy, String typeToy) {
		this.name = nameToy;
		this.price = priceToy;
		this.type = typeToy;
	}

	public int calDiscountPrice() {
		int cal = price - 100;
		return cal;
	}

	public int calDiscountPrice(int discount) {
		int cal = price - discount;
		return cal;
	}

	public String toString() {

		return "Name : " + name + " ," + " Price : " + calDiscountPrice() + " Bath" + " ," + " Type : " + type;

	}
}
