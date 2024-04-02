package com.example.StudFinder.Controller;

import com.example.StudFinder.Model.House;
import com.example.StudFinder.Model.HouseSubComponents.Floor;
import com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.Wall;
import com.example.StudFinder.Repository.HouseRepo;
import com.example.StudFinder.supportEngines.ComponentLoader;
import com.example.StudFinder.supportEngines.EndPointSupportEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
class AppController {

    @Autowired
    HouseRepo repo;

    // Below is alternate endpoint design.
    @PostMapping("/addHouse")
    public String addHouse(@RequestBody House house){
        repo.save(house);
        return "saved house";
    }

    @RequestMapping(value = "/storeHouse", method = RequestMethod.POST)
    public String storeThing(@RequestBody House house){
        repo.save(house);
        return "saved house";
    }

    @RequestMapping(value = "/startNewHouse", method = RequestMethod.POST)
    public House createHouse(@RequestBody String address) {
        return new House(address);
    }

    @RequestMapping(value = "/addNewFloor", method = RequestMethod.POST)
    public House createFloor(@RequestBody double height, House house) {
        EndPointSupportEngine.addNewFloor(height, house);
        return house;
    }

    @RequestMapping(value = "/addNewWall", method = RequestMethod.POST)
    public House createWall(@RequestBody Wall wall, House house, int floorNumber) {
        EndPointSupportEngine.addNewWall(wall, house, floorNumber);
        return house;
    }

}