package com.techelevator.models;

import java.math.BigDecimal;

public class Drink extends Snacks{

    public Drink(String location, String name, BigDecimal price, String type, int quantity) {
        super(location, name, price, type, quantity);
    }
}
