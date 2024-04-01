package com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.WallSubComponents;

public class Studs {

    //TODO: find out if it is a 2x4 or a 2x6
    private double lumberNumber;

    //TODO: refactor constructor to call a method instead of doing the logic in the constructor.
    public Studs(double length) {
        studCalculator(length);
        System.out.println("Calculating number for studs, studs = " + getLumberNumber());

    }

    private void studCalculator(double length) {
        int wholeStuds;
        wholeStuds = (((int) Math.ceil(length)) * 12) / 16;
        setLumberNumber(wholeStuds);
    }

    public double getLumberNumber() {
        return lumberNumber;
    }

    public void setLumberNumber(int lumberNumber) {
        this.lumberNumber = lumberNumber;
    }
}