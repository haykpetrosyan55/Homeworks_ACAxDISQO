package Homework_3.ImmutableObject;

public final class Car {
    private final int productionYear;
    private final String mark;
    private final String model;
    private final Engine engine;

    public Car(int productionYear, String mark, String model, Engine engine) {
        this.productionYear = productionYear;
        this.mark = mark;
        this.model = model;
        this.engine = new Engine(engine.getHorsePower(),engine.getWeight(), engine.getMileage());
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        //do I need to do this?
        //return new Engine(engine.getHorsePower(),engine.getWeight(), engine.getMileage());
        return engine;
    }
}
