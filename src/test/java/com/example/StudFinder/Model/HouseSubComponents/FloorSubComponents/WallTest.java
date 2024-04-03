package com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WallTest {

    // TODO: figure out how to convert feet and inches to decimal format
    double length = 24.5;
    double height = 8.0;
    int backing = 3;
    int pointLoads = 0;
    double windowWidthOne = 2.5;
    double windowWidthTwo = 2.5;
    ArrayList<Double> windowWidths = new ArrayList<>();

    @Test
    void wallConstructor_shouldHaveLumberNumber_twentyTwo() {
        windowWidths.add(windowWidthOne);
        windowWidths.add(windowWidthTwo);
        Wall wall = new Wall(length, windowWidths, backing, pointLoads);
        System.out.println(wall.getLumberNumber2x4());
        assertEquals(34, wall.getLumberNumber2x4());
    }
}