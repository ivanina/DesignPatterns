package builder;

public class MealDirector {
    public Meal createMeal(MealBuilder builder){
        builder.buildDrink();
        builder.buildDessert();
        return builder.getMeal();
    }
}
