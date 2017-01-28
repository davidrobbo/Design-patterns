package com.david.designpatterns.builder;

import MenuItem;

public interface OrderInterface{
    void setStarter(MenuItem item);
    void setMain(MenuItem item);
    void setDesert(MenuItem item);
}

public class Order implements OrderInterface{
    private MenuItem starter;
    private MenuItem main;
    private MenuItem desert;

    public void setStarter(MenuItem item)
    {
        this.starter = item;
    }

    public void setMain(MenuItem item)
    {
        this.main = item;
    }

    public void setDesert(MenuItem item)
    {
        this.desert = item;
    }
}

public class OrderBuilder {
    private Order order;

    public OrderBuilder()
    {
        this.order = new Order();
    }

    /* Expose set methods for director
       to pass in arguments that then call
       setters on the Order
     */
    public Order getOrder()
    {
        return this.order;
    }
}

public class OrderDirector{
    private OrderBuilder builder;

    public OrderDirector(OrderBuilder builder)
    {
        this.builder = builder;
    }

    public void build(...args)
    {
        //orderBuilder.set(...args)
    }

    public Order getOrder()
    {
        this.builder.getOrder();
    }
}

/* If an object requires multiples parameters in it's initialization or if the
object uses a composite pattern, then there is an added complexity with regards
to ensuring that the client is unaware of the process by which the objectis is
instantiated.
The builder patterns has is composed of 4 main parts; the contract, our class,
a builder and a director. The functionality we want to expose to the client
is within the class/object itself, but as this object may be quite complex,
we use a builder to help build it. The Builder's public constructor instantiates
our desired class and assigns it to a private class property. The builder exposes
and API to the director which takes arguments to set properties on our desired class/
object. The director accepts the builder as a parameter and calls setters on the builder,
which then calls setters on our desired class/object. Finally, the builder
exposes a getter to return the desired object which is then returned from the
director's getter to the client. */
