package com.example.StudFinder.supportEngines;

import com.example.StudFinder.Model.House;
import com.example.StudFinder.Model.HouseSubComponents.Floor;
import com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.Wall;
import com.example.StudFinder.Model.Request;

import java.util.ArrayList;

public class EndPointSupportEngine {

    public static House forNewFloorEndPoint(Request request) {
        House house = request.getHouse();
        ComponentEndPointConnectorEngine.addNewFloor(request.getHeight(), house);
        return house;
    }

    public static House forNewWallEndPoint(Request request) {
        ComponentEndPointConnectorEngine.buildExistingWalls(request);
        System.out.println("request = " + request);
        House house = request.getHouse();
        int floorNumber = request.getFloorNumber();
        Wall wall = ComponentEndPointConnectorEngine.createWall(request);
        if (house.getFloors().get(floorNumber) != null) {
            System.out.println("I'm in the if");
            ComponentEndPointConnectorEngine.addNewWall(wall, house, floorNumber);
        }
        else {
            System.out.println("I'm in the else");
            Floor floor = house.getFloors().get(floorNumber);
            ArrayList<Wall> walls = floor.getWalls();
            walls.add(wall);
            floor.setWalls(walls);
            ArrayList<Floor> floors = house.getFloors();
            floors.set(floorNumber, floor);
            house.setFloors(floors);
        }

        System.out.println("Successfully created and loaded wall.");
        return house;
    }
}