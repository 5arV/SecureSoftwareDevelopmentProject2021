package com.zuehlke.securesoftwaredevelopment.domain;

public class Restaurant {
    private int id;
    private String name;
    private String address;
    private String restaurantType;

    public Restaurant(int id, String name, String address, String restaurantType) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.restaurantType = restaurantType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRestaurantType() {
        return restaurantType;
    }

    public void setRestaurantType(String restaurantType) {
        this.restaurantType = restaurantType;
    }
}
