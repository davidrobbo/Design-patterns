package creational.Prototype;

import java.lang.Cloneable;

public class CanBeCloned implements Cloneable {

    protected CanBeCloned clone() throws CloneNotSupportedException {
        return (CanBeCloned) super.clone();
    }

}
