package com.engeto.q8OOP;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
//	Student student1 = new Student("Jan", "Trun", LocalDate.of(1993, 02, 02), 01);
//        System.out.println(student1.getName());

        Teacher teacher7A = new Teacher("Jan", "Trunečka");

        StudentList studenti7A = new StudentList();

        Student studentA = new Student("Adalbert", "Áčko", LocalDate.of(2008, 8, 2), 1);
        Student studentB = new Student("Bartolomeo", "Béčko", LocalDate.of(2006, 8, 2), 2);
        Student studentC = new Student("Cecil", "Céčko", LocalDate.of(2007, 8, 2), 3);
        Student studentD = new Student("Deoklecián", "Déčko", LocalDate.of(2009, 8, 2), 4);

        
        studenti7A.addStudent(studentA);
        studenti7A.addStudent(studentB);
        studenti7A.addStudent(studentC);
        studenti7A.addStudent(studentD);

        SchoolClass trida7A = new SchoolClass("7.A", 7, teacher7A, studenti7A);
        System.out.println(trida7A.getDescriptionFormat1());
        studenti7A.getDescription1();





    }
}
