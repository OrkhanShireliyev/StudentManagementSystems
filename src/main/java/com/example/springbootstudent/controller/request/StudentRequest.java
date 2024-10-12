package com.example.springbootstudent.controller.request;

import lombok.Data;

@Data
public class StudentRequest {
    private String name;
    private String surname;
    private int age;
    private int score;
    private String groupName;

    private String imagePath;

    public StudentRequest() {
    }

    public StudentRequest(String name, String surname, int age, int score, String groupName) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.score = score;
        this.groupName = groupName;
    }

    public StudentRequest(String name, String surname, int age, int score, String groupName, String imagePath) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.score = score;
        this.groupName = groupName;
        this.imagePath = imagePath;
    }
}
