public class Invoice {
    private String id;
    private Customer customer;
    private double totalPrice;

    public Invoice(String id , Customer customer , double totalPrice){
        this.totalPrice = totalPrice;
        this.customer = customer;
        this.id = id;
    }
    public void printInvoice(){
        
    }
}
