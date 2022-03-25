package com.company;

import com.company.schema.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Client Liza = new Client("Liza", 16, 450, false);
        Client Fast = new Client("Angelina", 16, 200, false);
        Client Abo = new Client("Abylai", 20, 10000, true);

        Barmen Dana = new Barmen("Dana", 17, 3000);
        Bounced Duka = new Bounced("Duka", 19, 3000, 40);
        Alcohol Infusion = new Alcohol("Granat", 500, 0.25, 40);

        Dj Arulan = new Dj("A. Rai", 500, 100, true, 50);

        Track track1 = new Track("Child Walker", Arulan, 320);
        Track track2 = new Track("Relationship with You", Arulan, 650);
        Track track3 = new Track("I Wanna Live", Arulan, 210);

        ArrayList<Track> trackArrayList = new ArrayList<>();
        trackArrayList.add(track1); trackArrayList.add(track2); trackArrayList.add(track3);

        Playlist arulanPlaylist1 = new Playlist(trackArrayList);

        Arulan.setPlaylist(arulanPlaylist1);

        System.out.println(Arulan.getPlaylist());

        for (int i = 0; i < Arulan.getPlaylist().getTrackList().size(); i++) {
            System.out.println(Arulan.getPlaylist().getTrackList().get(i));
        }

        Arulan.getPlaylist().getTrackList().get(2).setStatus("play");
        System.out.println("\n");

        for (int i = 0; i < Arulan.getPlaylist().getTrackList().size(); i++) {
            System.out.println(Arulan.getPlaylist().getTrackList().get(i));
        }

        Track perfectGirl = new Track("Perfect Girl", Arulan, 60);
        Abo.OrderTrack(Arulan, perfectGirl);
        System.out.println("\n");

        for (int i = 0; i < Arulan.getPlaylist().getTrackList().size(); i++) {
            System.out.println(Arulan.getPlaylist().getTrackList().get(i));
        }

        System.out.println(Abo.getCash());



        System.out.println(Duka.faceControl(Abo));
        System.out.println(Abo.getDrink(Dana, Infusion).getName());
        System.out.println(Abo.getCash());

    }
}
