package com.learning.javatrainingwheels.Objects.StaticFactoryMethods;

import com.learning.javatrainingwheels.Objects.StaticFactoryMethods.Building;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildingController {

    @GetMapping("/building")
    public Building getBuilding() {
        return Building.createStarterBuilding();
    }
}
