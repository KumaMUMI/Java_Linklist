package oop4;

public class Music {
	private String musicName;
	private String band;
	private String album;

	public Music(String name, String band, String album) {
		this.musicName = name;
		this.band = band;
		this.album = album;
	}

	public String toString() {
		return "Name of music : "+musicName+" ,"+" Band : "+band+" ,"+" Album : "+album;
	}
}
