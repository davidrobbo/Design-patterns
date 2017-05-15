package structural.Decorator;

/**
 * Created by david on 14/05/2017.
 */
public abstract class Car {

    String make;
    String model;

    public abstract void assemble();

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public abstract double cost();
}
