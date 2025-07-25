package com.pluralsight;

public class Vehicle {
    private int vin;
    private int year;
    private String make;
    private String model;
    private String color;
    private int odometer;
    private double price;
    private String vehicleType;

    //Constructor
    public Vehicle(int vin, int year, String make, String model, String color, int odometer, double price, String vehicleType) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
        this.vehicleType = vehicleType;
    }

    //Getters
    public int getVin() {
        return vin;
    }
    public int getYear() {
        return year;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public String getColor() {
        return color;
    }

    //Setters
    public void setVin(int vin) {
        this.vin = vin;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOdometer() {
        return odometer;
    }
    public double getPrice() {
        return price;
    }

    //toString Method
    public String toString() {
        return vin + " " + year + " " + make + " " + model + " " + vehicleType + " " + color + " " + odometer + " " + price;
    }
}

