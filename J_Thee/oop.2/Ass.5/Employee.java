public class Employee {

    protected String employeeName = " ";
    protected int age = 0;
    protected int RemainRetire = 0;

    public Employee() {
        employeeName = " ";
        age = 0;
    }

    public Employee(String employeeName, int age) {
        this.employeeName=employeeName;
        this.age=age;
    }

    public int getRemainRetire(int ReRemainRetire) {
        return 60-age;
    }

    public String toString() {
        return "ชื่อ "+employeeName+" อายุ "+age+" ปี "+" เกษียญในอีก "+getRemainRetire(RemainRetire)+" ปี";
    }
}
