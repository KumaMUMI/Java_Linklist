package oop1;

public class Ruby implements Gem {

	@Override
	public String price() {
		// TODO Auto-generated method stub
		return "Ruby Price : 330,800 Bath / 2.0 Carat";
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Name : Saffir";
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Type : Ruby";
	}

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "Color : Red";
	}
	
	public String toString() {
		return name()+type()+color()+price();
	}


}
