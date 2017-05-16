package creational.Builder;

/**
 * Created by david on 16/05/2017.
 */
public class FoodOrder {

    // required
    private String mainMeal;

    //optional
    private String starter;
    private String desert;

    public String getMainMeal() {
        return mainMeal;
    }

    public String getStarter() {
        return starter;
    }

    public String getDesert() {
        return desert;
    }

    private FoodOrder(MealBuilder builder) {
        this.mainMeal = builder.getMainMeal();
        this.starter = builder.getStarter();
        this.desert = builder.getDesert();
    }

    public static class MealBuilder {

        private String mainMeal;
        private String starter;
        private String desert;

        public MealBuilder(String mainMeal) {
            this.mainMeal = mainMeal;
        }

        public String getMainMeal() {
            return mainMeal;
        }

        public MealBuilder setMainMeal(String mainMeal) {
            this.mainMeal = mainMeal;
            return this;
        }

        public String getStarter() {
            return starter;
        }

        public MealBuilder setStarter(String starter) {
            this.starter = starter;
            return this;
        }

        public String getDesert() {
            return desert;
        }

        public MealBuilder setDesert(String desert) {
            this.desert = desert;
            return this;
        }

        public FoodOrder build() {
            return new FoodOrder(this);
        }
    }
}
