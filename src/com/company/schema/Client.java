package com.company.schema;

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

    public boolean OrderTrack(Dj dj, Track track){
        if (getCash() < dj.getTrackCost()){
            return false;
        }

        track.setFrom(getName());
        dj.getPlaylist().getTrackList().add(track);
        setCash(this.getCash() - dj.getTrackCost());

        return true;
    }

    public Drink getDrink(Barmen barmen, Drink drink){
        if (getCash() < drink.getPrice()){
            return null;
        }

        double drinkPriceForOur = 0;
        if (isOur()){
            drinkPriceForOur = (drink.getPrice() - 100);
        }

        setCash(getCash() - drinkPriceForOur);

        return drink;
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
