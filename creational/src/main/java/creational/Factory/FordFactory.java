package creational.Factory;

/**
 * Created by david on 08/05/2017.
 */
public class FordFactory {

    public Car getCar(String model){
        if ("MONDEO".equals(model)) {
            return new Mondeo();
        } else {
            return new Fiesta();
        }
    }

}
