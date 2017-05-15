package behavioural.ChainOfResponsibility;

/**
 * Created by david on 15/05/2017.
 */
public class Five implements Processor {

    public Processor nextHandler;
    public int quantity;

    public Five() {
    }

    public void setNextHandler(Processor p)
    {
        this.nextHandler = p;
    }

    public int setQuantity(int amount)
    {
        /*do something here where we see how many
        * of the processor's amount divides into
        * int amount and return leftover/modulus
        * so the request can continue to be handled
        */
        return amount;
    }
}
