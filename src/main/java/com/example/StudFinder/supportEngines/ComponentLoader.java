package com.example.StudFinder.supportEngines;

import com.example.StudFinder.Model.House;
import com.example.StudFinder.Model.HouseSubComponents.Floor;
import com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.Wall;

import java.util.ArrayList;

public class ComponentLoader {

    // support method for loading walls onto a floor
    public static void loadWall(Floor floor, Wall wall) {
        ArrayList<Wall> walls = floor.getWalls();
        walls.add(wall);
        floor.setWalls(walls);
    }

    // support method for loading floors onto a house
    public static void loadFloor(House house, Floor floor) {
        ArrayList<Floor> floors = house.getFloors();
        floors.add(floor);
        house.setFloors(floors);
    }


}