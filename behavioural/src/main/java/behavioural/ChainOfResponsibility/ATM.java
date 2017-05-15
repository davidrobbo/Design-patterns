package behavioural.ChainOfResponsibility;

import java.util.ArrayList;

/**
 * Created by david on 15/05/2017.
 */
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
        ArrayList<Processor> handlers = new ArrayList<Processor>();
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
