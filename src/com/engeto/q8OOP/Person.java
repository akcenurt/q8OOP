package com.engeto.q8OOP;

public abstract class Person {
    protected String name;
    protected String surname;

    public Person (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }



    public abstract String getName();

    public abstract void setName(String name);

    public abstract String getSurname();

    public abstract void setSurname(String surname);
}
