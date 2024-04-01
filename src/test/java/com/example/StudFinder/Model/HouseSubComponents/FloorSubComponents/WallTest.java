package com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WallTest {

    double length = 10;
    double height = 10;
    int backing = 4;
    int pointLoads = 4;
    double windowWidthOne = 6.0;
    double windowWidthTwo = 10.0;
    ArrayList<Double> windowWidths = new ArrayList<>();

    @Test
    void wallConstructor_shouldHaveLumberNumber_twentyTwo() {
        windowWidths.add(windowWidthOne);
        windowWidths.add(windowWidthTwo);
        Wall wall = new Wall(length, height, windowWidths, pointLoads, backing);
        System.out.println(wall.getLumberNumber2x4());
        assertEquals(22, wall.getLumberNumber2x4());
    }
}