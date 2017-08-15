package builder;

public class Main {
    public static void main(String[] args){
        MealDirector director = new MealDirector();
        MealBuilder builder = null;
        
        System.out.println("I want Adult meal!");
        builder = new AdultMealBuilder();
        Meal adultMeal = director.createMeal(builder);
        System.out.println(adultMeal);
        System.out.println("====================");

        System.out.println("I want Kids meal!");
        builder = new KidsMealBuilder();
        Meal kidsMeal = director.createMeal(builder);
        System.out.println(kidsMeal);
        System.out.println("====================");
    }
}
