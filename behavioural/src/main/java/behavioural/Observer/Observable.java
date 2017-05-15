package behavioural.Observer;

import java.util.List;

/**
 * Created by david on 07/05/2017.
 */
public interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
