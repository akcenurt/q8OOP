package com.engeto.q8OOP;

import java.time.LocalDate;

public class Student extends Teacher{
    private LocalDate born;
    private int ID;

    public Student (String name, String surname, LocalDate born, int ID) {
        super(name, surname);
        this.born = born;
        this.ID = ID;
    }

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
