package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class Car {

    private String type;
    private String fuel;
    private String model;
    private int gears;

     Car(String type, String fuel,String model,int gears)
    {
        this.type=type;
        this.fuel=fuel;
        this.model=model;
        this.gears=gears;

    }


}
