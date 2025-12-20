package com.example.demo;

public class TodoWithoutLombok {
    private int id;
    private String name;
    private boolean isDone;

    // All Arg Constructor
    public TodoWithoutLombok(int id, String name, boolean isDone) {
        this.id = id;
        this.name = name;
        this.isDone = isDone;
    }

    // Single Arg Constructor
    public TodoWithoutLombok(int id) {
        this.id = id;
    }

    //No Arg Constructor
    public TodoWithoutLombok() {
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    // ToString method
    @Override
    public String toString() {
        return "TodoWithoutLombok{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isDone=" + isDone +
                '}';
    }
}
