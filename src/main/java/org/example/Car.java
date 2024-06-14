package org.example;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Car{
    @NonNull private Model model;
    @NonNull private Engine engine;
    @NonNull private Body body;
    @NonNull private Wheels wheels;


}


