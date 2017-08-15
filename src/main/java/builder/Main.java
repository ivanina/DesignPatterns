package builder;

public class Main {
    public static void main(String[] args){
        MealDirector director = new MealDirector();
        MealBuilder builder = null;
        
        System.out.println("I want Abult meal!");
        builder = new AdultMealBuilder();
        Meal abultMeal = director.createMeal(builder);
        System.out.println(abultMeal);
        System.out.println("====================");
    }
}
