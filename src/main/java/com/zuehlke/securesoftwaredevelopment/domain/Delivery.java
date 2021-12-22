package com.zuehlke.securesoftwaredevelopment.domain;

public class Delivery {
    private Integer id;
    private Boolean isDone;
    private Integer userId;
    private Integer restaurantId;


    public Delivery(Integer id, Boolean isDone, Integer userId, Integer restaurantId) {
        this.id = id;
        this.isDone = isDone;
        this.userId = userId;
        this.restaurantId = restaurantId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }
}

