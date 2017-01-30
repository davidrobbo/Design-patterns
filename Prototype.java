package com.david.designpatterns;

import java.lang.Cloneable;

public class CanBeCloned implements Cloneable {
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

/* Why use the prototype? If a classes instantiation requires complex setup,
then simply pulling in properties from another object can prevents 'ugly'
and large constructors. Likewise, if the constructor would otherwise increase
consumption of computer resources (e.g. DB query), then this would also be a good
use for the Prototype pattern*/
