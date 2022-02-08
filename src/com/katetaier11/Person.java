package com.katetaier11;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private double weight;
    private int height;

    public Person(String firstName, String lastName, int age, int height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName='" + firstName + '\'' + ", secondName=" + lastName + ", age=" + age + ", weight=" + weight + ", height=" + height + '}';
    }
}
