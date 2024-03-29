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
@NoArgsConstructor
@AllArgsConstructor
public class House {

    private String name;

    private String address;

    private ArrayList<Floor> floors;


}