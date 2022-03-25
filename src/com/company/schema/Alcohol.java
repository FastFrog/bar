package com.company.schema;

public class Alcohol extends Drink{
    private double spirit;

    public Alcohol(String name, double price, double volume, double spirit) {
        super(name, price, volume);
        this.spirit = spirit;
    }

    public double getSpirit() {
        return spirit;
    }

    public void setSpirit(double spirit) {
        this.spirit = spirit;
    }
}
