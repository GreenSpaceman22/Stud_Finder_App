package com.example.StudFinder.Controller;

import com.example.StudFinder.Model.House;
import com.example.StudFinder.Repository.HouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
class AppController {

    @Autowired
    HouseRepo repo;

    @GetMapping("/")
    public String render() {
        return "Ah, yes, General Kenobi";
        // change return String of HTML file thats been read? I guess.
        //TODO: read up on how to read an HTML doc into a string format, make a method and return that to the web PORT 8080
    }

    @PostMapping("/addHouse")
    public String addHouse(@RequestBody House house){
        repo.save(house);
        return "saved house";
    }

    @RequestMapping(value = "/storeThing", method = RequestMethod.POST)
    public String storeThing(@RequestBody House thing){
        repo.save(thing);
        return "saved house";
    }

}