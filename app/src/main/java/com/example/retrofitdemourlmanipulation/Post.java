package com.example.retrofitdemourlmanipulation;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int userID, id;

    private String title;

    @SerializedName("body")
    private String text;


    public Post(int userID, String title, String text) {
        this.userID = userID;
        this.title = title;
        this.text = text;
    }

    public Post(int userID, String title, String text, int id) {
        this.userID = userID;
        this.title = title;
        this.text = text;
        this.id = id;
    }

    public int getUserID() {
        return userID;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
