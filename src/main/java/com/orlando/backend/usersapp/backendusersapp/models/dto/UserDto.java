package com.orlando.backend.usersapp.backendusersapp.models.dto;

public class UserDto {
    private Long id;
    private String username;
    private String email;
    private boolean admin;
    private String name;

    public UserDto(Long id, String username, String email, boolean admin, String name) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.admin = admin;
        this.name = name;
    }
    public UserDto() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isAdmin() {
        return admin;
    }
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
