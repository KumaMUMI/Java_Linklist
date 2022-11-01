public class CatOwnerinformation {
    protected String fullName;
    protected int age;
    protected int contactNumber;
    protected String address;
    protected String idCard;
    protected String catVaccineBook;

    public CatOwnerinformation() {

    }

    public CatOwnerinformation(String fullName, int age, int contactNumber, String address, String idCard,
            String catVaccineBook) {
        this.fullName = fullName;
        this.age = age;
        this.contactNumber = contactNumber;
        this.address = address;
        this.idCard = idCard;
        this.catVaccineBook = catVaccineBook;
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

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setAddressr(String address) {
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

    public void setCatVaccineBook(String catVaccineBook) {
        this.catVaccineBook = catVaccineBook;
    }

    public String getCatVaccineBook() {
        return catVaccineBook;
    }

    public String toString() {
        return "";
    }

}
