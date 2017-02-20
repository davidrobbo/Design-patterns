package com.designpatterns.behavioural.strategy;

/*
* In the example below, we code to a contract.
* Here we hide away the algorithm which, in this
* case, gets a client from destination A-to-B.
* We have a strategy class which accepts the request
* and can then utilise parameters to identify a
* suitable implementation of extending classes.
* Also this may display similarities to the factory
* pattern, the factory pattern is creational and
* uses client request information to provide an implementation
* of a class whereas the strategy provides the correct
* behaviour or operation for the client's request.
*/

interface TransportMode {
    public void setCost(int cost);
    public void setTime(int time);
    public void getToDesination();
}

public class TransportStrategy {
    public TransportMode method;

    public TransportStrategy(int time, int cost)
    {
        this.method = this.sortMethod(time, cost);
    }

    private sortMethod(int time, int cost)
    {
        ArrayList<TransportMode> modes = this.getByTime(time);
    }

    private List<TransportMode> getByTime(int time)
    {
        /* have a list of transport modes here
        * and loop through to see if their time
        * to get the client to their location
        * is less than or equal to the client's
        * requirements.
        */

    }

    private List<TransportMode> void getByCost(int cost, ArrayList<TransportMode> modes)
    {
        /* loop through filtered list 'modes' and see
        * if their cost is suitable for the client's
        * request
        */
    }
}
