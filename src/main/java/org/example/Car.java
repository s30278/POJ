package org.example;

import lombok.Getter;

@Getter
public class Car{
    private Model model;
    private Engine engine;
    private Body body;
    private Wheels wheels;

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", engine=" + engine +
                ", body=" + body +
                ", wheels=" + wheels +
                '}';
    }
}


