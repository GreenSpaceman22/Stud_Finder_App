package com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.WallSubComponents;

public class Backing {

    private double lumberNumber;
    private final int codeMultiplier = 2;

    public Backing(double count) {
        this.setLumberNumber(count * getCodeMultiplier());
    }

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