public class cal {
    public static void main(String[] args) {
        Area area = new Area();
        double result = area.calculate(15);
        System.out.println("version 1:" + result);

        System.out.println("version 2:"+ area.calculate(15, 5));

        System.out.println(Area.side);
        Area.side++;
        System.out.println(Area.side);
    }
}
