package com.practice.week6.factory_pattern;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Sour dough";
        sauce = "Tomato";
        toppings.add("Paneer");
        toppings.add("Corn");
    }
}
