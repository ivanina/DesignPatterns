package builder;

public abstract class MealBuilder {
    protected Meal meal = new RestaurantMeal();
    public abstract void buildDrink();
    public abstract void buildDessert();
    public abstract Meal getMeal();
}
