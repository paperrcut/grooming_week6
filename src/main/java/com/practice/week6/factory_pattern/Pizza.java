package com.practice.week6.factory_pattern;


import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public abstract class Pizza{
    String name = null;
    String sauce=null;
    String dough=null;
    List<String> toppings = new ArrayList<>();

    public void prepare()
    {
        log.info("Preparing: "+name+"..");
        log.info("Using Dough: "+dough+"...");
        log.info("Using sauce: "+sauce+"...");
        log.info("Using toppings: "+toppings.stream().reduce((topping1, topping2)->(topping1+", "+topping2)).get());
    }

    public void bake()
    {
        log.info("Baking "+name+"...");
    }
    public void pack()
    {
        log.info("Packing "+name+"...");
    }
}
