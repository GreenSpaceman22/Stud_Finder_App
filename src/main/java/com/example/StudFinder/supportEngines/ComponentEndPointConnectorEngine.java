package com.example.StudFinder.supportEngines;

import com.example.StudFinder.Model.House;
import com.example.StudFinder.Model.HouseSubComponents.Floor;
import com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.Wall;
import com.example.StudFinder.Model.Request;

import java.util.ArrayList;

public class ComponentEndPointConnectorEngine {

    public static void addNewWall(Wall wall, House house, int floorNumber) {
        ArrayList<Floor> floors = house.getFloors();
        ComponentLoader.loadWall(floors.get(floorNumber), wall);
        house.setFloors(floors);
    }
    public static void addNewFloor(double height, House house) {
        Floor floor = new Floor(height);
        ComponentLoader.loadFloor(house, floor);
    }

    public static Wall createWall(Request request) {
        return new Wall(request.getLength(), request.getWindowWidths(), request.getBacking(), request.getPointLoads());
    }
    public static void buildExistingWalls(Request request) {
        ArrayList<Wall> walls = request.getHouse().getFloors().get(request.getFloorNumber()).getWalls();
        for (Wall wall : walls) {
            System.out.println("yes");
        }
    }
}