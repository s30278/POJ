package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarFixService<REPAIR_ENGINE, REPAIR_WHEELS, REPAIR_BODY> {
    Enum REPAIR_ENGINE;
    Enum REPAIR_WHEELS;
    Enum REPAIR_BODY;

    public Car RepairCar(REPAIR_ENGINE, Car Honda, Engine){

        return Engine "Vtec"
    }
    public Car RepairCar(REPAIR_WHEELS, Car Honda, Wheels){

        return Wheels "230";
    }
    public Car RepairCar(REPAIR_BODY, Car Honda, Body){

        return Body; "Red";
    }


}
