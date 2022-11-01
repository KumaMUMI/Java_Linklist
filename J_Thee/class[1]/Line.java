public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public String toString(){
        return "จุกเริ่ม :"+begin+" จุดสุดท้าย :"+end;
    }
}
