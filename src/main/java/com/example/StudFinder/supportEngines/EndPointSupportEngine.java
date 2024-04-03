package com.example.StudFinder.supportEngines;

import com.example.StudFinder.Model.House;
import com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.Wall;
import com.example.StudFinder.Model.Request;

public class EndPointSupportEngine {

    public static House forNewFloorEndPoint(Request request) {
        House house = request.getHouse();
        ComponentLoaderEngine.addNewFloor(request.getHeight(), house);
        return house;
    }

    public static House forNewWallEndPoint(Request request) {
        House house = request.getHouse();
        int floorNumber = request.getFloorNumber();
        Wall wall = request.getWall();

        ComponentLoaderEngine.addNewWall(wall, house, floorNumber);
        return house;
    }
}