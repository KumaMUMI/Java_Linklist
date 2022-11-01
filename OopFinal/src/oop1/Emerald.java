package oop1;

public class Emerald implements Gem {

	@Override
	public String price() {
		// TODO Auto-generated method stub
		return "Emerald Price : 79,392 Bath / 2.0 Carat";
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Name : Smaragdos";
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Type : Emerald";
	}

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "Color : Green";
	}
	
	public String toString() {
		return name()+type()+color()+price();
	}


}
