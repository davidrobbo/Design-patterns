package creational.Builder;

/**
 * Created by david on 16/05/2017.
 */
public class Main {

    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        FoodOrder order = new FoodOrder.MealBuilder(
                "Chips").setStarter("Prawn Mayonaise")
                .setDesert("").build();
    }

}
