import java.util.Iterator;
import java.util.NoSuchElementException;

import stdlib.StdOut;
import stdlib.StdRandom;

public class Student {
    private int id;
    private int courses;
    //private int coursestaken;
    private double grade;
    private String name;

    public Student(String name) { //constructor with name as an input
        this.name = name;
        grade = 0.0;
        id = 0;
        courses = 0;
        //coursestaken = 0;
    }


    public double getGPA() {
        return this.grade;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNAME() {
        return this.name;
    }
    public int getID() {
        int length = String.valueOf(this.id).length();
        String idString = "";
        if (length>4) {
            throw new IllegalArgumentException("Max ID length is 4");// this can be changed later
        }
        return this.id;
    }

    public String getIDString() {
        int length = String.valueOf(this.id).length();
        String idString = "";
        if (length>4) {
            throw new IllegalArgumentException("Max ID length is 4");// this can be changed later
        }
        for (int i = 0; i < (4-length); i++) {// for loop to add 0s if number is less than 1000
            idString = idString + "0";}
        idString = idString + String.valueOf(this.id);
        return idString;
    }

    public double addGrade(double grade) {
        if (grade > 4.0 || grade < 0.0){// grade ranges between 0 and 4
            throw new IllegalArgumentException("Illegal course grade");
        }
        courses++;
        this.grade = (this.grade + grade)/courses;
        return this.grade;
    }

    //tests  for  the program
    public static void main(String[] args) {
        Student q = new Student("Test Student");
        String newName = "2nd test name";
        double gpa1 = 3.0;
        double gpa2 = 2.3;
        int id1 = 319;
        int id2 = 4502;


        q.addGrade(gpa1);
        StdOut.println("gpa 1      = " + q.getGPA());
        q.addGrade(gpa2);
        StdOut.println("gpa 2      = " + q.getGPA());// should be 2.65

        q.setID(id1);
        StdOut.println("id1  = " + q.getIDString());
        StdOut.println("id no string  = " + q.getID());

        q.setID(id2);
        StdOut.println("id2  = " + q.getIDString());

        StdOut.println("Name is " + q.getNAME());

        q.setName(newName);
        StdOut.println("Name is " + q.getNAME());

    }

}
