package com.practice.week6.factory_pattern;

public class PizzaFactory {
    public Pizza createPizza(Pizza_Type type) {
        if (type.equals(Pizza_Type.Cheese))
            return new CheesePizza();
        else if (type.equals(Pizza_Type.Pineapple))
            return new PineapplePizza();
        else return null;
    }

    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();

        Pizza cheesePizza = pizzaFactory.createPizza(Pizza_Type.Cheese);
        Pizza pineapplePizza = pizzaFactory.createPizza(Pizza_Type.Pineapple);

        cheesePizza.prepare();
        cheesePizza.bake();
        cheesePizza.pack();

        pineapplePizza.prepare();
        pineapplePizza.bake();
        pineapplePizza.pack();
    }
}
