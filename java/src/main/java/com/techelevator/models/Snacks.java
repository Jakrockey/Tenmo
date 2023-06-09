package com.techelevator.models;

import java.math.BigDecimal;

public class Snacks {
    private String location;
    private String name;
    private BigDecimal price;
    private String type;
    private int quantity;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Snacks(String location, String name, BigDecimal price, String type, int quantity) {
        this.location = location;
        this.name = name;
        this.price = price;
        this.type = type;
        this.quantity = quantity;


    }
}
