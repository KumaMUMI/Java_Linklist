package oop4;

public class Main {
	public static void main(String[] args) {
	
		Music music = new Music("Moon", "BlackBeans", "Moon");
		System.out.println(music);
		
		Singer boom = new Singer("Boom", 25, music);
		System.out.println(boom);
		
		Singer toon = new Singer("Toon", 30, new Music("เรือเล็กควรออกจากฝั่ง", "bodyslam", "เรือเล็ก"));
		System.out.println(toon);
	}
}
