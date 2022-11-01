public class spring_determination {
    // Attribute
    protected double k;
    protected double s;
    // Getter&Setter Method
    public spring_determination(Double newK,Double newS){
        k= newK;
        s = newS;
    }
    //สร้างเพื่อรับค่านิจสปริง
    public void setK(Double k){
        this.k = k;
    };
    //อ่านค่าK
    public Double getK(){
        return k;
    };
    //สร้างเพื่อรับค่าระยะหดของสปริง
    public void setS(Double s){
        this.s = s;
    };
    //อ่านค่าS
    public Double getS(){
        return s;
    };
    //สร้างเพื่ออ่านค่าKและSไป เอาไปคำนวณเป็นแรงกดF
    public double springDetermination() {
        return k * s;
    }
}
