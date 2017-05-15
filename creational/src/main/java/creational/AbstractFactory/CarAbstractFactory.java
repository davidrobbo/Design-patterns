package creational.AbstractFactory;

/**
 * Created by david on 08/05/2017.
 */
public class CarAbstractFactory {

    public CarFactory getCarFactory(String brand) {
        if ("FORD".equals(brand)) {
            return new FordFactory();
        } else {
            return new VauxhallFactory();
        }
    }

}
