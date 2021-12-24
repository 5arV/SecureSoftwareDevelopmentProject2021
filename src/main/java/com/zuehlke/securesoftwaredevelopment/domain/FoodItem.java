package com.zuehlke.securesoftwaredevelopment.domain;

public class FoodItem {
    private Integer amount;
    private Integer foodId;

    public FoodItem(Integer amount, Integer foodId) {
        this.amount = amount;
        this.foodId = foodId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }
}
