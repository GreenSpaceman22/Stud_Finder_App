package com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.WallSubComponents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointLoadTest {

    int pointLoads = 3;

    @Test
    void pointLoadConstructor_shouldSetLumberNumber_equalToNine_ifThreePassed() {
        PointLoad pointLoadCount = new PointLoad(pointLoads);

        assertEquals(9, pointLoadCount.getLumberNumber());
    }

    @Test
    void pointLoadConstructor_shouldSetLumberNumber_equalToZero_ifZeroPassed() {
        PointLoad pointLoadCount = new PointLoad(0);

        assertEquals(0, pointLoadCount.getLumberNumber());
    }
}