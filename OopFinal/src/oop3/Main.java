package oop3;

public class Main {
	public static void main(String[] args) {
		
		Honda civic = new Honda();
		
		civic.setFullName("Civic");
		civic.setPriceCar(964900);
		civic.setSeries("Honda Civic");
		
		System.out.println(civic.getFullName());
		System.out.println("Price : "+civic.getPriceCar()+" Bath");
		
	}
}
