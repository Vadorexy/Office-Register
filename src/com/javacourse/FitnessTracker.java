package com.javacourse;

public class FitnessTracker {
    String fitnessActivity;
    int numberOfMins;
    String date;

    public FitnessTracker() {
        this.fitnessActivity = "running";
        this.numberOfMins = 0;
        this.date = "January 1, 2022";
    }

    public FitnessTracker(String fitnessActivity, int numberOfMins, String date) {
        this.fitnessActivity = fitnessActivity;
        this.numberOfMins = numberOfMins;
        this.date = date;
    }

    public String getFitnessActivity() {
        return fitnessActivity;
    }

    public int getNumberOfMins() {
        return numberOfMins;
    }

    public String getDate() {
        return date;
    }
}
