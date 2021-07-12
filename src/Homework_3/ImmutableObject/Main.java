package Homework_3.ImmutableObject;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(110,150,250_000);
        Car car = new Car(2003,"Honda","Fit", engine);
        System.out.println(car.getEngine().getHorsePower());
        engine.setHorsePower(12);
        System.out.println(car.getEngine().getHorsePower()); // Must not be changed as car object is immutable
    }
}
