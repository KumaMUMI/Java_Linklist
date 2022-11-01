package oop1;

public class Diamond implements Gem {

	@Override
	public String price() {
		// TODO Auto-generated method stub
		return "Diamond Price : 132,320 Bath / 2.0 Carat";
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Name : Diamond";
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Type : Diamond";
	}

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "Color : Blue";
	}
	
	public String toString() {
		return name()+type()+color()+price();
	}

}
