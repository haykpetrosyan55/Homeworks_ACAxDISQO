package Homework_0.Task1;

public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(3,4);
        Point point2 = new Point(-12,-16);
        System.out.println(point1.distance());
        System.out.println(point1.distance(point2));
    }
}
