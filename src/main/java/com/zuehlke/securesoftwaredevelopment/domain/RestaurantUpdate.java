package com.zuehlke.securesoftwaredevelopment.domain;

public class RestaurantUpdate {
    private int id;
    private String name;
    private String address;
    private int restaurantType;

    public RestaurantUpdate(int id, String name, String address, int restaurantType) {
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

    public int getRestaurantType() {
        return restaurantType;
    }

    public void setRestaurantType(int restaurantType) {
        this.restaurantType = restaurantType;
    }
}
