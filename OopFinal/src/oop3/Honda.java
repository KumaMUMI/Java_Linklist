package oop3;

public class Honda extends Car{
	
	private String series;
	
	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getFullName() {
		return "Name : "+fullName+" ,"+" Series : "+series;
	}
	
}
