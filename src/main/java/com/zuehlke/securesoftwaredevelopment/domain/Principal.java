package com.zuehlke.securesoftwaredevelopment.domain;

public class Principal {
    Integer id;
    String username;
    String password;
    Object authorities;

    public Principal(Integer id, String username, String password, Object authorities) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Object getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Object authorities) {
        this.authorities = authorities;
    }
}
