public class tastAnimal {
    public static void main(String[] args) {
        AnimalClass dog = new Dog();
        AnimalClass cat = new Cat();
        AnimalClass elephant = new Elephant();

        System.out.println(dog.makeNoise());
        System.out.println(cat.makeNoise());
        System.out.println(elephant.makeNoise());

        Point one = new Point(500, 300);
        Point two = new Point(700, 500);

        Line K = new Line(one, two);

        System.out.println(one);
        System.out.println(two);
        System.out.println(K);
    }
}
