package com.company.schema;

import java.util.ArrayList;

public class Dj extends Employee{
    private boolean isActive;
    private Playlist playlist;
    private double TrackCost;

    public Dj(String name, int age, double salary, boolean isActive, Playlist playlist) {
        super(name, age, salary);
        this.isActive = isActive;
        this.playlist = playlist;
    }

    public Dj(String name, int age, double salary, boolean isActive, double trackCost) {
        super(name, age, salary);
        this.isActive = isActive;
        this.TrackCost = trackCost;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public double getTrackCost() {
        return TrackCost;
    }

    public void setTrackCost(double trackCost) {
        TrackCost = trackCost;
    }
}
