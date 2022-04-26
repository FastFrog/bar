package com.company;

public class Barmen extends Employee{

    public Barmen(String name, int age, Role role, double salary) {
        super(name, age, role, salary);
    }

    public Drink getDrink(Client client, Drink drink){
        if (client.getCash() < drink.getPrice()){
            return null;
        }

        if (client.isOur()){
            drink.setPrice(drink.getPrice() - 100);
        }

        client.setCash(client.getCash() - drink.getPrice());

        return drink;
    }

}
