package designpatterns.behavioural.cor;

import java.util.ArrayList;

public interface Processor {
    public void setNextHandler(Processor p);
    public int setQuantity(int amount);
}

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

public class Ten implements Processor {

    public Processor nextHandler;
    public int quantity;

    public Ten() {
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

public class Twenty implements Processor {

    public Processor nextHandler;
    public int quantity;

    public Twenty() {
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

public class ATM {

    private int requestedAmount;
    private ArrayList<Processor> money;

    public ATM(int amount)
    {
        this.requestedAmount = amount;
        try {
            this.money = this.calculateResponse();
        }catch(Exception e){
            this.money = null;
        }
    }

    private ArrayList<Processor> calculateResponse() throws Exception
    {
        ArrayList<Processor> handlers = new ArrayList<>();
        if(this.requestedAmount >= 5){
            Twenty tw = new Twenty();
            Ten t = new Ten();
            tw.setNextHandler(t);
            handlers.add(tw);
            Five f = new Five();
            t.setNextHandler(f);
            handlers.add(t);
            handlers.add(f);
            int temp = this.requestedAmount;
            int count = 0;
            while(temp >= 5 && count < handlers.size()){
                temp = handlers.get(count).setQuantity(temp);
                count++;
            }
        } else {
            Exception e = new Exception("Something went wrong!");
            throw e;
        }
        return handlers;
    }
}

/* The Chain Of Responsibility allows the client to dump the request
* at the entrance and receive their expected response without being
* that the request has been through a recursive handling mechanism.
* A request is passed from a base class iteratively to possibly
* multiple objects which each attempt to handle the request.
* The request is recurively passed backed to the parent/base
* which keeps a pointer to the next object in the event
* the client's request is not currently satisfied.
* IMPORTANT: remeber that there must be a handler
* for when the request cannot be satisfied by
* one the members of the chain */
