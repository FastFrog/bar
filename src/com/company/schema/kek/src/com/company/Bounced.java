package com.company;

public class Bounced extends Employee{
    private double strength;

    public Bounced(String name, int age, Role role, double salary, double strength) {
        super(name, age, role, salary);
        this.strength = strength;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public boolean faceControl(Client client){
        return client.getAge() >= 18;
    }
}
