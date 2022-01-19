package com.company;

public class CarFactory {
public static Car makeCar(int option){
    return switch (option) {
        case 1 -> new SportsCar();
        case 2 -> new FamilyCar();
        case 3 -> new SmallCar();
        default -> throw new RuntimeException("Wrong input. Choose between 1-3");
    };

}}
