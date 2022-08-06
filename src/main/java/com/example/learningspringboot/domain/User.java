package com.example.learningspringboot.domain;

public class User {
    private String fullName;
    private int age;
    private boolean employed;
    private String gender;

    public User(String fullName, int age, boolean employed, String gender) {
        this.fullName = fullName;
        this.age = age;
        this.employed = employed;
        this.gender = gender;
    }

    public User() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEmployed() {
        return employed;
    }

    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", employed=" + employed +
                ", gender='" + gender + '\'' +
                '}';
    }
}
