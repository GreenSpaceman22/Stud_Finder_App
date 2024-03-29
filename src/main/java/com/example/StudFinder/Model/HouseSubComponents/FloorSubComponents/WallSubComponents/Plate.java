package com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.WallSubComponents;

public class Plate {

    private double count;

    public Plate(double length) {
        length = Math.ceil(length / 20) * 20;
        double boardCount = length * 3;
        boardCount = boardCount / 20;

        setCount(boardCount);
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }
}