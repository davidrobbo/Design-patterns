package behavioural.Strategy;

/**
 * Created by david on 16/05/2017.
 */
public class TicketOffice {

    private TransportMode mode;

    public TicketOffice(int amount) {
        if(amount < 10) {
            mode = new Car();
        } else {
            mode = new Train();
        }
        mode.goToDestination();
    }

}
