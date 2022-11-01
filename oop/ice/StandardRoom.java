package dev.iceey.pj;

public class StandardRoom {
	protected String roomNumber;
	protected int howManyDaysToStay;
	private double roomPrice = 200;

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setHowManyDaysToStay(int howManyDaysToStay) {
        this.howManyDaysToStay = howManyDaysToStay;
    }

    public int getHowManyDaysToStay() {
        return howManyDaysToStay;
    }
    
    
    public double calRoomPrice()
    {
    	double calTotal = this.howManyDaysToStay*this.roomPrice;
    	return calTotal;
    }
}
