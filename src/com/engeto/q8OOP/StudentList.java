package com.engeto.q8OOP;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }


    public void addStudent (Student student) {students.add(student);}

    public void removeStudent (int index) {students.remove(index);}

    public int sizeOfList () {return students.size();}

    public Student getStudent (int index) {
        return students.get(index);
    }

    public void getDescription1 () {
        for (Student student : students) {
            System.out.println("# "+student.getID()+" # ID00"+student.getID()+" - "+student.getName()+" "+student.getSurname()+" ("+student.getBorn().getYear()+")");
        }
    }
}
