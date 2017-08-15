package builder;

public class AdultMealBuilder extends MealBuilder {
    public void buildDrink(){
        System.out.println(">> prepare Adult Drinck");
    }
    public void buildDessert(){
        System.out.println(">> prepare Adult Dessert");
    }
    public Meal getMeal(){
        return meal;
    }
}
