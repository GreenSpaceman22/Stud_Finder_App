package com.example.StudFinder.Model.HouseSubComponents;

import com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.WallSubComponents.Door;
import com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.Wall;
import com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.WallSubComponents.Window;

import java.util.ArrayList;

public class Floor {


    private double height;
    private ArrayList<Wall> walls;

    public Floor(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public ArrayList<Wall> getWalls() {
        return walls;
    }

    public void setWalls(ArrayList<Wall> walls) {
        this.walls = walls;
    }
}