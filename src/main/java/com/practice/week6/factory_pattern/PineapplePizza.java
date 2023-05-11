package com.practice.week6.factory_pattern;

public class PineapplePizza extends Pizza {
    public PineapplePizza() {
        name = "Pineapple Pizza";
        dough = "Sweet dough";
        sauce = "Chilli";
        toppings.add("Pineapple");
        toppings.add("Onion");
    }
}
