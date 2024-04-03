package com.example.StudFinder.Model;

import com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.Wall;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Request {

    double height;
    House house;
    Wall wall;
    int floorNumber;
    double length;
    ArrayList<Double> windowWidths;
    int backing;
    int pointLoads;

}