package com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.WallSubComponents;

public class PointLoads {

    //TODO: find out if it is a 2x4 or a 2x6
    private int lumberNumber;
    private final int codeMultiplier = 3;

    public PointLoads(int pointLoadCount) {
        pointLoadCalculator(pointLoadCount);
    }

    // called in constructor,
    // calculates lumber based on number of pointloads * whatever the code specifies.
    // (in this case the code says to multiply by 3)
    private void pointLoadCalculator(int pointLoadCounter) {
        int lumberNewCount = pointLoadCounter * getCodeMultiplier();
        setLumberNumber(lumberNewCount);
    }

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