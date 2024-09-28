package com.learning.javatrainingwheels.Objects.StaticFactoryMethods;

import lombok.Getter;
import lombok.Setter;

// Static factory methods are used to create new objects as an alternative to constructors.
// They're not mutually exclusive, you CAN have static factory methods AND public constructors if you'd like
@Getter
@Setter
public class Building {
    // TODO: Create static factory methods to be able to instantiate new objects that users can use instead of a constructor
    // TODO: Create methods to be able to create a fresh basic building, to create a building based on a string input parameter, and based on a series of expected props.

    private Integer width;
    private Integer height;

    private Building(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    public static Building createStarterBuilding() {
        return new Building(10, 10);
    }
}
