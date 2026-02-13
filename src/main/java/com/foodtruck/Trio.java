package com.foodtruck;

public class Trio implements MenuItem {
    private double price;
    private String name;

    public Trio(MenuItem a, MenuItem b, MenuItem c) {
        price = a.getPrice() + b.getPrice() + c.getPrice() - Math.min(Math.min(a.getPrice(), b.getPrice()), c.getPrice());;
    }
    
    public String getName() { return name; }
    public double getPrice() { return price; }
    public double getTrioPrice() { return price; }
}