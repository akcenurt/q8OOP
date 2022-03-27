package com.engeto.q8OOP;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass implements Description {
    private String className;
    private int grade;
    private Teacher classTeacher;
    StudentList studentList;

//    public SchoolClass (String className, int grade, Teacher classTeacher,)

    public SchoolClass(String className, int grade, Teacher classTeacher, StudentList studentList) {
        this.className = className;
        this.grade = grade;
        this.classTeacher = classTeacher;
        this.studentList = studentList;
    }

//    ####################################
//    Třída: 4.C (ročník: 4)
//    Třídní učitel: Novák, Jan
//    Počet studentů: 3
//
//            ####################################
//            # 1 # ID001 - Petr Svoboda (2011)
//# 2 # ID123 - Milan Říha (2010)
//# 3 # ID345 - Jindřich Nový (2012)

    @Override
    public String getDescriptionFormat1() {
        return "####################################\n" +
                "Třída: "+getClassName()+" (ročník: "+grade+")"+
                "\nTřídní učitel: "+classTeacher.getSurname()+", "+classTeacher.getName()+
                "\nPočet studentů: "+studentList.sizeOfList()+ //size+1?
                "\n\n####################################\n";
    }

    @Override
    public String getDescriptionFormat2() {
        return null;
    }

    @Override
    public String getDescriptionFormat3() {
        return null;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Teacher getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(Teacher classTeacher) {
        this.classTeacher = classTeacher;
    }


}
