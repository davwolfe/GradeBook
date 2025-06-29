import java.util.Iterator;
import java.util.NoSuchElementException;


import stdlib.StdOut;
import stdlib.StdRandom;

public class Instructor {
    private int id;
    private int courses;
    //private int coursestaken;
    private double grade;
    private String name;

    public Instructor(String name) { //constructor with name as an input
        this.name = name;
        grade = 0.0;
        id = 0;
        courses = 0;
        //coursestaken = 0;
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


}
