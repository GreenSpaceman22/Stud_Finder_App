package com.example.StudFinder.supportEngines;

import com.example.StudFinder.Model.House;
import com.example.StudFinder.Model.HouseSubComponents.Floor;
import com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.Wall;

import java.util.ArrayList;

public class ComponentLoaderEngine {

    public static void addNewWall(Wall wall, House house, int floorNumber) {
        ArrayList<Floor> floors = house.getFloors();
        ComponentLoader.loadWall(floors.get(floorNumber - 1), wall);
        house.setFloors(floors);
    }
    public static void addNewFloor(double height, House house) {
        Floor floor = new Floor(height);
        ComponentLoader.loadFloor(house, floor);
    }

}