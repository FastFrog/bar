package com.company;

public class Client extends Person{
    private double cash;
    private boolean isOur;

    public Client(String name, int age, double cash, boolean isOur) {
        super(name, age);
        this.cash = cash;
        this.isOur = isOur;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public boolean isOur() {
        return isOur;
    }

    public void setOur(boolean our) {
        isOur = our;
    }

    @Override
    public String toString() {
        return "Client{" +
                "cash=" + cash +
                ", isOur=" + isOur +
                '}';
    }
}
