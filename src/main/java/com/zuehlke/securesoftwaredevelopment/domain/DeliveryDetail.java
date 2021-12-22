package com.zuehlke.securesoftwaredevelopment.domain;

public class DeliveryDetail {
    private int id;
    private int amount;
    private String foodName;
    private int price;

    public DeliveryDetail(int id, int amount, String foodName, int price) {
        this.id = id;
        this.amount = amount;
        this.foodName = foodName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
