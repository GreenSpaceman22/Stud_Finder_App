package com.example.StudFinder.Model;

import com.example.StudFinder.Model.HouseSubComponents.Floor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Document
@Data
public class House {

    private String address;

    private ArrayList<Floor> floors;

    public House(String address) {
        ArrayList<Floor> floors = new ArrayList<>();
        setAddress(address);
        setFloors(floors);
    }

    public House(String address, ArrayList<Floor> floors) {
        setAddress(address);
        setFloors(floors);
    }

    // GETTERS/SETTERS
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Floor> getFloors() {
        return floors;
    }

    public void setFloors(ArrayList<Floor> floors) {
        this.floors = floors;
    }
}