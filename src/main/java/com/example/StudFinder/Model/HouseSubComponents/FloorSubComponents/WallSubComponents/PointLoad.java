package com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.WallSubComponents;

public class PointLoad {

    //TODO: find out if it is a 2x4 or a 2x6
    private int lumberNumber;
    private final int codeMultiplier = 3;

    public PointLoad(int pointLoadCount) {
        calculateLumberNumber(pointLoadCount);
    }

    // called in constructor,
    // calculates lumber based on number of pointloads * whatever the code specifies.
    // (in this case the code says to multiply by 3)
    private void calculateLumberNumber(int pointLoadCounter) {
        pointLoadCounter = pointLoadCounter * getCodeMultiplier();
        setLumberNumber(pointLoadCounter);
        System.out.println("Calculating number for point loads, point loads = " + getLumberNumber());

    }

    // GETTERS/SETTERS
    public int getLumberNumber() {
        return lumberNumber;
    }

    public void setLumberNumber(int lumberNumber) {
        this.lumberNumber = lumberNumber;
    }

    public int getCodeMultiplier() {
        return codeMultiplier;
    }
}