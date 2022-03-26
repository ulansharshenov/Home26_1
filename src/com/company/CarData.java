package com.company;

public class CarData {
    private int dateOfManufacturing;
    private String model;
    private int price;
    private String color;

    public CarData(int dateOfManufacturing, String model, int price, String color) {
        this.dateOfManufacturing = dateOfManufacturing;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getDateOfManufacturing() {
        return dateOfManufacturing;
    }

    public void setDateOfManufacturing(int dateOfManufacturing) {
        this.dateOfManufacturing = dateOfManufacturing;
    }

    @Override
    public String toString() {
        return " CarData{" +
                " Date of manufacturing:" + dateOfManufacturing +
                " Model:" + model +
                " Price:" + price +
                " Color:" + color + "} ";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
