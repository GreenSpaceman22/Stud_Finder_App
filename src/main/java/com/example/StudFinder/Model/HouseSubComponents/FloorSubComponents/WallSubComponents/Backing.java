package com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.WallSubComponents;

public class Backing {

    //TODO: find out if it is a 2x4 or a 2x6
    private double lumberNumber;
    private final int codeMultiplier = 2;

    public Backing(double backingCount) {
        calculateLumberNumber(backingCount);
        System.out.println("Calculating number for backings, backings = " + getLumberNumber());
    }

    private void calculateLumberNumber(double backingCount) {
        backingCount = backingCount * getCodeMultiplier();
        setLumberNumber(backingCount);
    }

    // GETTERS/SETTERS
    public double getLumberNumber() {
        return lumberNumber;
    }

    public void setLumberNumber(double lumberNumber) {
        this.lumberNumber = lumberNumber;
    }

    public int getCodeMultiplier() {
        return codeMultiplier;
    }
}