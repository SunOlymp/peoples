package org.example;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder(){}

    public PersonBuilder(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalAccessException {
        if (age < 0) {
            throw new IllegalAccessException("Недопустимое значение возраста!");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder build() throws IllegalAccessException{
        if (name == null || surname == null){
            throw new IllegalAccessException("Передано пустое имя и/или фамилия");
        }
        return new PersonBuilder(name, surname, age);
    }
}
