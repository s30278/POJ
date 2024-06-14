package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@NonNull


public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Honda", new Engine("Vtec","1800"), new Body("BLACK"), new Wheels(220)));
        cars.add(new Car("Toyota", new Engine("VVTL","1800"), new Body("RED"), new Wheels(200)));
        cars.add(new Car("Mitsubishi", new Engine("Tbi","2000"),new Body("WHITE"), new Wheels(180)));
        System.out.println(cars);

/**
 * Foreach
 * For
 * Strumienie
 **/

    }
}