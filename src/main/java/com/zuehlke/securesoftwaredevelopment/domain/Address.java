package com.zuehlke.securesoftwaredevelopment.domain;

public class Address {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address(int id, String name) {
        this.name = name;
        this.id = id;
    }
}

