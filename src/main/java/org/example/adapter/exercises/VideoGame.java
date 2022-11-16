package org.example.adapter.exercises;

import org.example.factory.Game;

/**
 * Create a class called VideoGame
 * getPegiName() - Name
 * getAgeRating() -
 * coresNeeded() - int
 * pingTime() - int
 *
 * VideoGame -> In order for canBePlayedRemotley to be valid
 * it must have a ping less than 100ms
 *
 * Create an adapter to convert a Video Game object into a Game(PCGame) object
 */
public class VideoGame  {

    private String pegiName;
    private int ageRating;
    private int coresNeeded;
    private int pingTime;

    public VideoGame(String pegiName, int ageRating, int coresNeeded, int pingTime) {
        this.pegiName = pegiName;
        this.ageRating = ageRating;
        this.coresNeeded = coresNeeded;
        this.pingTime = pingTime;
    }

    public String getPegiName() {
        return pegiName;
    }

    public int getAgeRating() {
        return ageRating;
    }

    public int getCoresNeeded() {
        return coresNeeded;
    }

    public int getPingTime() {
        return pingTime;
    }
}
