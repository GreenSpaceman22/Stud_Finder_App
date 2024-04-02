package com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.WallSubComponents;

public class Plate {

    //TODO: find out if it is a 2x4 or a 2x6
    private double lumberNumber;

    //TODO: refactor constructor to call a method instead of doing the logic in the constructor.
    public Plate(double length) {
        calculateLumberNumber(length);
        System.out.println("Calculating number for plates, plates = " + getLumberNumber());

    }
    private void calculateLumberNumber(double length) {
        length = Math.ceil(length / 20) * 20;
        double boardCount = length * 3;
        boardCount = boardCount / 20;

        setLumberNumber(boardCount);
    }

    // GETTERS/SETTERS
    public double getLumberNumber() {
        return lumberNumber;
    }

    public void setLumberNumber(double lumberNumber) {
        this.lumberNumber = lumberNumber;
    }
}