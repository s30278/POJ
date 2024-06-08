package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@NonNull


public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car());
        cars.add(new Car());
        cars.add(new Car("Honda", new Engine ("Vtec"), new Body("BLACK"), new Wheels("220"));
        System.out.println(cars);

/**
 * Foreach
 * For
 * Strumienie
 **/

    }
}