package com.example.demo;

public class User {
    private static long counter = 1;

    private long id;
    private String username;
    private String password;

    public User() {
        this.id = counter++;
    }

    // Геттеры и сеттеры
    public long getId() { return id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
