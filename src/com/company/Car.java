package com.company;

public class Car {
    private int id;
    private String number;

    public Car(int id, String number) {
        this.id = id;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{ " + "Id:" + id + " Number:" + number + "} ";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
