import java.util.Iterator;
import java.util.NoSuchElementException;

import stdlib.StdOut;
import stdlib.StdRandom;

public class Student {
    private int id;
    private int courses;
    private double grade;
    private String name;

    public Student(String name) { //constructor with name as an input
        this.name = name;
        grade = 0.0;
        id = 0;
        courses = 0;
    }


    public double getGPA(Student s) {
        return s.grade;
    }

    public void setID(Student s, int id) {
        s.id = id;
    }

    public void setName(Student s, String name) {
        s.name = name;
    }

    public String getNAME(Student s) {
        return s.name;
    }
    public int getID(Student s) {
        return s.id;
    }

    public double addGrade(Student s, double grade) {
        courses++;
        s.grade = (s.grade + grade)/courses;
        return s.grade;
    }






}
