public class PartTimeEmployee extends Employee {
    private int dayPaid = 0;
    public PartTimeEmployee(String employeeName , int age , int dayPaid){
        this.employeeName = employeeName;
        this.age=age;
        this.dayPaid  = dayPaid;
    }

    public int getRemainRetire(){
        return 0;
    }

    public float calculateIncome(){
        float paid = dayPaid*30;
        return paid;
    }

    public float calculateIncome(int dayWork){
        float paid = dayWork*dayPaid;
        return paid;
    }

    public String toString(){
        return "ชื่อ "+employeeName+" อายุ "+age+" รายได้ต่อวัน "+dayPaid;
    }
}
