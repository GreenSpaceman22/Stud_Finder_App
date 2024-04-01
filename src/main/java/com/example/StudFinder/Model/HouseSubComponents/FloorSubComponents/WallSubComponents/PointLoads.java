package com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.WallSubComponents;

public class PointLoads {

    private int lumberNumber;
    private final int codeMultiplier = 3;

    public PointLoads(int pointLoadCount) {
        pointLoadCalculator(pointLoadCount);
    }

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