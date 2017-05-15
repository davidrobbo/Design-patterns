package structural.Decorator;

/**
 * Created by david on 14/05/2017.
 */
public class OffRoadAbility extends CarDecorator {

    private Car car;

    public OffRoadAbility(Car car) {
        this.car = car;
    }

    public void assemble() {
        car.assemble();
    }

    public double addFeatureCost() {
        return 111.99;
    }

    public double cost() {
        return car.cost() + addFeatureCost();
    }
}
