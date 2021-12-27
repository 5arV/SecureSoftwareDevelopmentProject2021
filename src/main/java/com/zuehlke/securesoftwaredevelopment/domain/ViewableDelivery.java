package com.zuehlke.securesoftwaredevelopment.domain;


import java.sql.Date;

public class ViewableDelivery {
    private String restaurantType;
    private int id;
    private boolean isDone;
    private String username;
    private String address;
    private String restaurantName;
    private Date date;
    private String comment;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRestaurantType() {
        return restaurantType;
    }

    public void setRestaurantType(String restaurantType) {
        this.restaurantType = restaurantType;
    }

    public ViewableDelivery(int id, boolean isDone, Date date, String comment, String username, String address, String restaurantName, String restaurantType) {
        this.id = id;
        this.isDone = isDone;
        this.username = username;
        this.address = address;
        this.restaurantName = restaurantName;
        this.date = date;
        this.comment = comment;
        this.restaurantType = restaurantType;
    }
}
