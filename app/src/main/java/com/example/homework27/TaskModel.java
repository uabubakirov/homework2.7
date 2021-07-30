package com.example.homework27;

public class TaskModel {
    String title,desription;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesription() {
        return desription;
    }

    public void setDesription(String desroption) {
        this.desription = desroption;
    }

    public TaskModel(String title, String desroption) {
        this.title = title;
        this.desription = desroption;
    }
}
