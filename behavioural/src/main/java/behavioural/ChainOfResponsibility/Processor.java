package behavioural.ChainOfResponsibility;

/**
 * Created by david on 15/05/2017.
 */
public interface Processor {
    public void setNextHandler(Processor p);
    public int setQuantity(int amount);
}
