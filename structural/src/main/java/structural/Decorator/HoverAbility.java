package structural.Decorator;

/**
 * Created by david on 14/05/2017.
 */
public class HoverAbility extends CarDecorator {

    private Car car;

    public HoverAbility(Car car) {
        this.car = car;
    }

    public void assemble() {
        car.assemble();
    }

    public double addFeatureCost() {
        return 11111.99;
    }

    public double cost() {
        return car.cost() + addFeatureCost();
    }
}
