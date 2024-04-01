package com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.WallSubComponents;

public class Studs {

    //TODO: find out if it is a 2x4 or a 2x6
    private double lumberNumber;

    //TODO: refactor constructor to call a method instead of doing the logic in the constructor.
    public Studs(double length) {
        int studCount;
        int modCounter = (int) Math.ceil(length);
        modCounter = modCounter / 3;

    }

    public double getLumberNumber() {
        return lumberNumber;
    }

    public void setLumberNumber(int lumberNumber) {
        this.lumberNumber = lumberNumber;
    }
}