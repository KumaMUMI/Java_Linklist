package dev.iceey.pj;

public class OwnerInformation {
    private String fullName;
    private int age;
    private String contactNumber;
    private String address;
    private String idCard;

    public OwnerInformation() {
    	
    }

    public OwnerInformation(String fullName, int age, String contactNumber, String address, String idCard) {
        this.fullName = fullName;
        this.age = age;
        this.contactNumber = contactNumber;
        this.address = address;
        this.idCard = idCard;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public String toString() {
        return "";
    }
}
