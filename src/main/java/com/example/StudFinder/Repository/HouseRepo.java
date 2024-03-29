package com.example.StudFinder.Repository;

import com.example.StudFinder.Model.House;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HouseRepo extends MongoRepository<House, Integer> {

}
