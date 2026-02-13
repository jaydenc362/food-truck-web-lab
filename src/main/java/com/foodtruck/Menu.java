package com.foodtruck;

import java.util.HashMap;

public class Menu {
    private HashMap<String, MenuItem> items;

    public Menu() {
        items = new HashMap<>();

        // Salads (5)
        items.put("salad_greek", new Salad("Greek Salad", 7.50));
        items.put("salad_caesar", new Salad("Caesar Salad", 7.25));
        items.put("salad_garden", new Salad("Garden Salad", 6.75));
        items.put("salad_chef", new Salad("Chef Salad", 8.20));
        items.put("salad_cobb", new Salad("Cobb Salad", 8.00));

        // Sandwiches (5)
        items.put("sandwich_turkey", new Sandwich("Turkey Sandwich", 9.50));
        items.put("sandwich_veggie", new Sandwich("Veggie Sandwich", 8.75));
        items.put("sandwich_tuna", new Sandwich("Tuna Sandwich", 9.25));
        items.put("sandwich_peanutbutter", new Sandwich("Peanut Butter Sandwich", 7.00));
        items.put("sandwich_cheese", new Sandwich("Cheese Sandwich", 6.50));

        // Drinks (5)
        items.put("drink_water", new Drink("Water", 1.50));
        items.put("drink_lemonade", new Drink("Lemonade", 2.75));
        items.put("drink_icedtea", new Drink("Iced Tea", 2.50));
        items.put("drink_matcha", new Drink("Matcha", 3.45));
        items.put("drink_coffee", new Drink("Coffee", 3.10));
    }

    public MenuItem getItem(String code) {
        return items.get(code);
    }
}