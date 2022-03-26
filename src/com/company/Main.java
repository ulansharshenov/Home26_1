package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(1, "01715ABC");

        CarData carData = new CarData(2018, "Toyota Camry 55", 10000, "White");

        Map<Car, CarData> map = new HashMap<>();
        map.put(car, carData);

        System.out.println(map.entrySet());
    }
}
