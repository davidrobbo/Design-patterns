package com.david.designpatterns.singleton;

public class MySingleton {
    private static MySingleton singleton;

    private MySingleton(){}

    public static MySingleton getInstance()
    {
        if(MySingleton.singleton.equals(null)){
            MySingleton.singleton = new MySingleton();
        }
        return MySingleton.singleton;
    }
}
/* Referencing multiple objects which all reference the same resources
can be tricky and the singleton offers a single source of truth, and also
only limited memory use */
