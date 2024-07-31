package com.cesar.curso.spingboot.webapp.springbootweb.models.dto;

import com.cesar.curso.spingboot.webapp.springbootweb.models.User;

public class UserDto {

    private String title;
    private User user;
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    
}
