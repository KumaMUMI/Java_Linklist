public class Area {
    static int side = 40;

    public double calculate(double side) {
        double area = side * side;
        return area;
    }

    public double calculate(double length, double width) {
        double area = length * width;
        return area;
    }
}
//overloding