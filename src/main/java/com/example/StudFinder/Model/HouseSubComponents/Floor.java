package com.example.StudFinder.Model.HouseSubComponents;

import com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.WallSubComponents.Door;
import com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.Wall;
import com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.WallSubComponents.Window;

import java.util.ArrayList;

public class Floor {


    private static double height;
    private static ArrayList<Wall> walls;
    private static ArrayList<Window> windows;
    private static ArrayList<Door> doors;


    public Floor(double height, ArrayList<Wall> walls, ArrayList<Door> doors) {

    }

    public static double getHeight() {
        return height;
    }

    public static void setHeight(double height) {
        Floor.height = height;
    }

    public static ArrayList<Wall> getWalls() {
        return walls;
    }

    public static void setWalls(ArrayList<Wall> walls) {
        Floor.walls = walls;
    }

    public static ArrayList<Window> getWindows() {
        return windows;
    }

    public static void setWindows(ArrayList<Window> windows) {
        Floor.windows = windows;
    }

    public static ArrayList<Door> getDoors() {
        return doors;
    }

    public static void setDoors(ArrayList<Door> doors) {
        Floor.doors = doors;
    }

}