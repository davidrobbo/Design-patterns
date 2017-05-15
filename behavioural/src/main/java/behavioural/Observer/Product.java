package behavioural.Observer;

import java.util.ArrayList;

/**
 * Created by david on 07/05/2017.
 */
public class Product implements Observable {

    private int stock;
    private ArrayList<Observer> users;

    public Product(){
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
        notifyObservers();
    }

    public void addObserver(Observer o){
        users.add(o);
    }

    public void removeObserver(Observer o){
        users.remove(o);
    }

    public void notifyObservers(){
        for(Observer o:users){
            o.respond();
        }
    }

}
