package com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents;

import com.example.StudFinder.Model.HouseSubComponents.Floor;
import com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.WallSubComponents.Plate;

public class Wall {

    private double length;
    private double height;
    private double backing;
    private double plateCount;
    private double studs;

    public Wall(double length, int windows, int backing, double height) {

        Plate plate = new Plate(length);
        setPlateCount(plate.getCount());

        setHeight(height);

    }

    // GETTERS AND SETTERS


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBacking() {
        return backing;
    }

    public void setBacking(double backing) {
        this.backing = backing;
    }

    public double getPlateCount() {
        return plateCount;
    }

    public void setPlateCount(double plateCount) {
        this.plateCount = plateCount;
    }

    public double getStuds() {
        return studs;
    }

    public void setStuds(double studs) {
        this.studs = studs;
    }
}