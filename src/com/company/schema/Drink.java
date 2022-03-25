package com.company.schema;

public class Drink {
    private String name;
    private double price;
    private double volume;

    public Drink(String name, double price, double volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public double percentPrice(){
        return price - 100;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
