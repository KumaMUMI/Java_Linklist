public class TestInvoice {
    public static void main(String[] args) {
        
        Customer kum = new Customer("Natthawat Sirimart", "Man");

        System.out.println(kum.getFullname());
        System.out.println(kum.getType());
        
        Invoice k = new Invoice("64023241", kum  , 45.25);

        System.out.println(k);
        k.printInvoice();
    }
}
