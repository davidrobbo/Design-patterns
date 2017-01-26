package com.example.designpatterns.creational.factory;

import java.util.HashMap;
import com.example.PaymentProvider;

/**
 * Created by david on 26/01/2017.
 */

public interface Game {
    boolean takePayment(PaymentProvider psp, HashMap<String, String> details);
    String sendPushNotification();
}

public class ComputerGame implements Game {
    ComputerGame(){};
    public boolean takePayment(PaymentProvider psp, HashMap<String, String> details)
    {
        //sign into steam here and pay with details
        return true;
    }

    public String sendPushNotification()
    {
        //update user of notification using the resources specific to the platform
        return "a string";
    }
}

public class PlaystationGame implements Game {
    PlaystationGame(){}
    public boolean takePayment(PaymentProvider psp, HashMap<String, String> details)
    {
        //sign into Sony here and pay with details
        return true;
    }

    public String sendPushNotification()
    {
        //update user of notification using the resources specific to the platform
        return "a string";
    }
}

public class GameFactory {
    public static Game getGame(String platform) throws Exception
    {
        switch (platform) {
            case "Computer":
                return new ComputerGame();
            case "Playstation":
                return new PlaystationGame();
            default:
                throw new Exception("This platform is not currently supported");
        }
    }
}

/* What is it?
The factory pattern is a pattern used to seperate the request for an object from the client and the instantiation of the resulting
requested object.

Why use it?
In our example above, we know that a game can be specific to a platform. However, if we were to grow our shop and start offering
support for Xbox games, then we need only change logic in our factory.
