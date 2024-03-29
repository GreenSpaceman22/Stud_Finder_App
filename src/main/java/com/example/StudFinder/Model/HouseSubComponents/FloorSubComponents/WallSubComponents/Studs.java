package com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.WallSubComponents;

import java.util.Map;

public class Studs {

    private double studs;

    public Studs(double length) {
        int studCount;
        int modCounter = (int) Math.ceil(length);
        modCounter = modCounter / 3;

    }

    public double getStuds() {
        return studs;
    }

    public void setStuds(int studs) {
        this.studs = studs;
    }
}