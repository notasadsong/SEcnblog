package com.example.my_test6.ui.question;

public class list_item {
    private String username;
    private String title;

    public list_item(String ct) {
        this.title = ct;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public String gettitle() {
        return title;
    }
}
