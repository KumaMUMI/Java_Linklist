package oop4;

public class Singer {
	private String singerName;
	private int age;
	private Music musicOfsinger;
	
	public Singer(String name,int age,Music musicOfsinge) {
		this.singerName = name;
		this.age = age;
		this.musicOfsinger = musicOfsinge;
	}
	
	public String toString() {
		return "Singer name : "+singerName+" , "+"Age : "+age+" , "+"Top songs["+musicOfsinger+"]";
	}
	
}
