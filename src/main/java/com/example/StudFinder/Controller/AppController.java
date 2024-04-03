package com.example.StudFinder.Controller;

import com.example.StudFinder.Model.House;
import com.example.StudFinder.Model.Request;
import com.example.StudFinder.Repository.HouseRepo;
import com.example.StudFinder.supportEngines.EndPointSupportEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    // TODO: find out if I need to make it a request object, OR make it an array of random things.
    @RequestMapping(value = "/addNewFloor", method = RequestMethod.POST)
    public House createFloor(@RequestBody Request request) {
        House house = EndPointSupportEngine.forNewFloorEndPoint(request);
        return house;
    }

    @RequestMapping(value = "/addNewWall", method = RequestMethod.POST) //Wall wall, House house, int floorNumber
    public House createWall(@RequestBody Request request) {
        return EndPointSupportEngine.forNewWallEndPoint(request);
    }

}