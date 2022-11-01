public class test {
    public static void main(String[] args) {
        Employee k = new Employee("kim",20);

        PartTimeEmployee S = new PartTimeEmployee("Sa", 19, 350);

        System.out.println(k);
        System.out.print(S);
        System.out.print(" รายได้ต่อเดือน "+S.calculateIncome());
        System.out.println(" รายได้ปัจจุบัน "+S.calculateIncome(5));
    }
}
