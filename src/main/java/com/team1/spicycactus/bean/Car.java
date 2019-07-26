package com.team1.spicycactus.bean;

/**
 * this is the Car object used by the database and services
 */
public class Car {
    private int car_id;
    private String model;
    private String color;
    private String license_plate;
    private int seat_count;
    private int rating;
    private String engine_type;
    //if true is auto
    private boolean transmission;
    private String car_type;
    private String manufacturer;


    /**
     * Constructors
     */
    public Car() {
    }

    public Car(int car_id, String model, String color, String license_plate, int seat_count, int rating, String engine_type, boolean transmission, String car_type, String manufacturer) {
        this.car_id = car_id;
        this.model = model;
        this.color = color;
        this.license_plate = license_plate;
        this.seat_count = seat_count;
        this.rating = rating;
        this.engine_type = engine_type;
        this.transmission = transmission;
        this.car_type = car_type;
        this.manufacturer = manufacturer;
    }

    /**
     * getters
     */
    public int getCar_id() {
        return car_id;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getLicense_plate() {
        return license_plate;
    }

    public int getSeat_count() {
        return seat_count;
    }

    public int getRating() {
        return rating;
    }

    public String getEngine_type() {
        return engine_type;
    }

    public String getCar_type() {
        return car_type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean isTransmission() {
        return transmission;
    }


    /**
     * Setters
     */
    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLicense_plate(String license_plate) {
        this.license_plate = license_plate;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public void setSeat_count(int seat_count) {
        this.seat_count = seat_count;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setEngine_type(String engine_type) {
        this.engine_type = engine_type;
    }

    public void setTransmission(boolean transmission) {
        this.transmission = transmission;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
