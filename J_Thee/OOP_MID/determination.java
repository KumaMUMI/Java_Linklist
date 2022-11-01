public class determination extends spring_determination {
    private String springname;
    
    // เรียก Default Constructor จากคลาสแม่
    public determination(String springname,Double k,Double s){
        super(k,s);
        this.springname = springname;
    }
    //รับชื่อ
    public void setName(String name){
        springname = name ;
    };
    //อ่านName
    public String getName(){
        return getName();
    };

    //อ่านค่าแล้วแสดงผลของ ชื่อ ค่านิจสปริง ระยะหดสปริง ค่าแรงกด
    public String toString(){
        return "ชื่อสปริง"+springname+" " +"ค่านิจสปริง"+k+" " +"ระยะหดของสปริง"+s+" " +"ค่าแรงกด(F)ที่คำนวณได้"+springDetermination();
    };

}
