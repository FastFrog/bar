package com.company.schema;

public class Track {
    private String Title;
    private Person Author;
    private int Duration;
    private String Status; // play stop end new
    private String From;

    public Track(String title, Person author, int duration, String status, String from) {
        Title = title;
        Author = author;
        Duration = duration;
        Status = status;
        From = from;
    }

    public Track(String title, Person author, int duration, String status) {
        Title = title;
        Author = author;
        Duration = duration;
        Status = status;
    }

    public Track(String title, Person author, int duration) {
        Title = title;
        Author = author;
        Duration = duration;
        this.Status = "new";
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Person getAuthor() {
        return Author;
    }

    public void setAuthor(Person author) {
        Author = author;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "Track{" +
                "Title='" + Title + '\'' +
                ", Author=" + Author +
                ", Duration=" + String.format("%02d:%02d", (Duration / 3600 * 60 + ((Duration % 3600) / 60)), (Duration % 60)) +
                ", Status='" + Status + '\'' +
                ", From='" + From + '\'' +
                '}';
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }
}
