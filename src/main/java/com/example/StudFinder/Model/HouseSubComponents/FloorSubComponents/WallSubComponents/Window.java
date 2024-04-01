package com.example.StudFinder.Model.HouseSubComponents.FloorSubComponents.WallSubComponents;

import java.util.ArrayList;

public class Window {

    //TODO: find out if it is a 2x4 or a 2x6
    private int lumberNumber;
    private int codeMultiplier;
    // TODO: make the front end so that they can creat a window,
    //  and ask how many of that same dimension of window there is
    private double height; // TODO: find out if and how height effects count
    private double width;

    //CONSTRUCTOR
    public Window(ArrayList<Double> windowWidths) {
        lumberLooper(windowWidths);
    }

    // loops through all the window widths to check if they are wider than 3 feet,
    // if they are, it changes the amount it adds each time to the lumber number
    // same as doing window count * codeMultiplier, but it accounts for windows of varying widths
    private void lumberLooper(ArrayList<Double> windowWidths) {
        for (double width : windowWidths) {
            lumberCountMod(width);
            setLumberNumber(getLumberNumber() + getCodeMultiplier());
        }
    }

    // checks window width to determine which number it should set the codeMultiplier to, either 4, 9, or 6,
    private void lumberCountMod(double windowWidth) {
        int codeNumber = 6;

        if (windowWidth >= 8) {
            codeNumber = 9;
            setCodeMultiplier(codeNumber);
        }
        else if (windowWidth <= 3) {
            codeNumber = 4;
            setLumberNumber(codeNumber);
        }
        else {
            setCodeMultiplier(codeNumber);
        }

    }

    // GETTERS/SETTERS
    public int getLumberNumber() {
        return lumberNumber;
    }

    public void setLumberNumber(int lumberNumber) {
        this.lumberNumber = lumberNumber;
    }

    public int getCodeMultiplier() {
        return codeMultiplier;
    }

    public void setCodeMultiplier(int codeMultiplier) {
        this.codeMultiplier = codeMultiplier;
    }


}