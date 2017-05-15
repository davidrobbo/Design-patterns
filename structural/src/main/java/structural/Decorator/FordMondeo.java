package structural.Decorator;

/**
 * Created by david on 14/05/2017.
 */
public class FordMondeo extends Car {

    public FordMondeo() {
        this.make = "Ford";
        this.model = "Mondeo";
    }

    public void assemble() {
        // make car
    }

    public double cost() {
        return 2222.22;
    }

}
