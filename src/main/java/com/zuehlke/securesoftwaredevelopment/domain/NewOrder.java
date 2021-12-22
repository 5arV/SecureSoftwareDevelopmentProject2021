package com.zuehlke.securesoftwaredevelopment.domain;

import java.util.List;

public class NewOrder {
    int restaurantId;
    String comment;
    List<Integer> items;

    public NewOrder(int restaurantId, String comment, List<Integer> items) {
        this.restaurantId = restaurantId;
        this.comment = comment;
        this.items = items;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<Integer> getItems() {
        return items;
    }

    public void setItems(List<Integer> items) {
        this.items = items;
    }
}
