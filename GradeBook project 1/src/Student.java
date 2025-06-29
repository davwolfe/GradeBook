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
        int length = String.valueOf(s.id).length();
        String idString = "";
        if (length>4) {
            throw new IllegalArgumentException("Max ID length is 4");// this can be changed later
        }
        return s.id;
    }

    public String getIDString(Student s) {
        int length = String.valueOf(s.id).length();
        String idString = "";
        if (length>4) {
            throw new IllegalArgumentException("Max ID length is 4");// this can be changed later
        }
        for (int i = 0; i < (4-length); i++) {// for loop to add 0s if number is less than 1000
            idString = idString + "0";}
        idString = idString + String.valueOf(s.id);
        return idString;
    }

    public double addGrade(Student s, double grade) {
        if (grade > 4.0 || grade < 0.0){// grade ranges between 0 and 4
            throw new IllegalArgumentException("Illegal course grade");
        }
        courses++;
        s.grade = (s.grade + grade)/courses;
        return s.grade;
    }






}
