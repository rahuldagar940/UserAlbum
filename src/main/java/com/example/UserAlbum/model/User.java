package com.example.UserAlbum.model;

public class User {
    private int userID;
    private String name;
    private String email;
    private String profilePicURL;

    public User(String name, String email, String profilePicURL) {
        this.name = name;
        this.email = email;
        this.profilePicURL = profilePicURL;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePicURL() {
        return profilePicURL;
    }

    public void setProfilePicURL(String profilePicURL) {
        this.profilePicURL = profilePicURL;
    }
}
