package structural.Decorator;

/**
 * Created by david on 14/05/2017.
 */
public class VauxhallAstra extends Car {

    public VauxhallAstra() {
        this.make = "Vauxhall";
        this.model = "Astra";
    }

    public void assemble() {
        // make car
    }

    public double cost() {
        return 1111.11;
    }

}
