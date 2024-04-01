package com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.WallSubComponents;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WindowTest {

    double wideWindow = 8;
    double smallWindow = 3;
    double regularWindow = 6;
    ArrayList<Double> windowWidths = new ArrayList<>();

    //passed
    @Test
    void windowConstructor_shouldSetLumberNumberToNineteen_ifWideSmallAndRegularWindowPassed() {
        windowWidths.add(wideWindow);
        windowWidths.add(smallWindow);
        windowWidths.add(regularWindow);
        Window window = new Window(windowWidths);
        assertEquals(19, window.getLumberNumber());
    }
}