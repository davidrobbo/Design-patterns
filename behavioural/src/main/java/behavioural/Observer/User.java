package behavioural.Observer;

/**
 * Created by david on 07/05/2017.
 */
public class User implements Observer {

    private Observable observable;

    public User(){}

    public void setObservable(Observable o){
        observable = o;
    }

    public void respond(){
        buyProduct();
        unsubscribe();
    }

    private void buyProduct(){
        //do something with observable
    }

    private void unsubscribe(){
        observable.removeObserver(this);
    }
}
