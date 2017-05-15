package creational.AbstractFactory;

/**
 * Created by david on 08/05/2017.
 */
public class FordFactory extends CarFactory {

    public Car getCar(String model){
        // normal factory functionality here with check of @model param
        return new Mondeo();
    }

}
