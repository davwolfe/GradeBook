import java.util.Iterator;
import java.util.NoSuchElementException;


import stdlib.StdOut;
import stdlib.StdRandom;

public class Course {
    private int id;
    private int size;
    private Student[] enrolled;
    private Instructor prof;
    //private int courses;
    //private int coursestaken;
    private int credit;
    private String name;

    public Course(String name) { //constructor with name as an input
        this.name = name;
        credit = 0;
        id = 0;
        size = 0;
        enrolled = new Student[30];// max class size 30
        //coursestaken = 0;
    }



    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCREDIT(int credit) {
        this.credit = credit;
    }

    public int getSIZE() {
        return this.size;
    }

    public int getCREDIT() {
        return this.credit;
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

    public void listEnrolled() {// prints out all enrolled students' names
        for (int i = 0; i <= (size); i++) {// for loop to add 0s if number is less than 1000
            //enrolled[i].getNAME();
            StdOut.println(enrolled[i].getNAME());}
    }

    public void addStudent(Student s) {
        if (size>=29) {
            throw new IllegalArgumentException("Class is full");// this can be changed later
        }
        enrolled[size]= s;
        size++;
    }


}
