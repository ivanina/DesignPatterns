package builder;

public class KidsMealBuilder extends MealBuilder {
    public void buildDrink(){
        System.out.println(">> prepare Kids Drinck");
    }
    public void buildDessert(){
        System.out.println(">> prepare Kids Dessert");
    }
    public Meal getMeal(){
        return meal;
    }
}
