package com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents;

import com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.WallSubComponents.*;

import java.util.ArrayList;
import java.util.List;

public class Wall {

    private int lumberNumber2x4;
    private int lumberNumber2x6;
    private double length;
    private double height;
    private double backing;
    // TODO: figure out plate count by the wall length.
    private double plateCount;
    private double studs;
    private int pointLoads;

    // CONSTRUCTORS

    // TODO: refactor to allow lumberCalculator to account for null windows
    // constructor with no windows
    public Wall(double length, double height, int backing, int pointLoads) {
        ArrayList<Double> noWindows = new ArrayList<>();
        noWindows.add(0.0);
        noWindows.add(0.0);
        Studs studs = new Studs(length);
        Window window = new Window(noWindows);
        Backing backings = new Backing(backing);
        PointLoads pointLoad = new PointLoads(pointLoads);
        Plate platesCount = new Plate(length);
        lumberCalculator(studs, window, backings, pointLoad, platesCount);
    }
    // constructor with windows
    public Wall(double length, double height, ArrayList<Double> windowWidths, int backing, int pointLoads) {
        Studs studs = new Studs(length);
        Window window = new Window(windowWidths);
        Backing backings = new Backing(backing);
        PointLoads pointLoad = new PointLoads(pointLoads);
        Plate platesCount = new Plate(length);
        lumberCalculator(studs, window, backings, pointLoad, platesCount);
    }

    // TODO: find out which ones need to get put into the 2x4s and which go to 2x6s
    // Calculates the lumber count for that wall based on all the potential subcomponents of it.
    private void lumberCalculator(Studs stud, Window window, Backing backing, PointLoads pointLoads, Plate plates) {
        double lumberCounter = stud.getLumberNumber() +
                window.getLumberNumber() +
                backing.getLumberNumber() +
                pointLoads.getLumberNumber() +
                plates.getLumberNumber();
        int roundedLumberCount = (int) Math.ceil(lumberCounter);
        setLumberNumber2x4(roundedLumberCount);
    }

    // GETTERS AND SETTERS

    public int getLumberNumber2x4() {
        return lumberNumber2x4;
    }

    public void setLumberNumber2x4(int lumberNumber2x4) {
        this.lumberNumber2x4 = lumberNumber2x4;
    }

    public int getLumberNumber2x6() {
        return lumberNumber2x6;
    }

    public void setLumberNumber2x6(int lumberNumber2x6) {
        this.lumberNumber2x6 = lumberNumber2x6;
    }

    public int getPointLoads() {
        return pointLoads;
    }

    public void setPointLoads(int pointLoads) {
        this.pointLoads = pointLoads;
    }

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