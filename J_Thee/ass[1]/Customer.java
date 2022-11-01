public class Customer {
    private String fullName;
    private String type;

    public Customer(String fullName, String type) {
        this.type = type;
        this.fullName = fullName;
    }

    public String getFullname() {
        return fullName;
    }

    public String getType() {
        return type;
    }
}
