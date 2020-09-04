package pl.bienkowskaAgata.testing;

import java.util.ArrayList;
import java.util.List;

public class Order {

    public List<Meal> meals = new ArrayList<>();

    public void addMealToOrder(Meal meal) {
        this.meals.add(meal);
    }

    public void removeMealToOrder(Meal meal) {
        this.meals.remove(meal);
    }

    public List<Meal> getMeals() {
        return meals;
    }
}