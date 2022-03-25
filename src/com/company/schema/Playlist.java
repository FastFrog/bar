package com.company.schema;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<Track> TrackList;

    public Playlist(ArrayList<Track> trackList) {
        TrackList = trackList;
    }

    public ArrayList<Track> getTrackList() {
        return TrackList;
    }

    public void setTrackList(ArrayList<Track> trackList) {
        TrackList = trackList;
    }

    public void changeStatus(String status, int index){

    }

    @Override
    public String toString() {
        return "Playlist{" +
                "TrackList=" + TrackList +
                '}';
    }
}
