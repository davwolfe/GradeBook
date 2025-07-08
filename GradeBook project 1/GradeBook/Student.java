import javafx.beans.property.*;

public class Student {
    private final StringProperty name = new SimpleStringProperty();
    private final IntegerProperty id = new SimpleIntegerProperty();
    private final DoubleProperty gpa = new SimpleDoubleProperty();
    private int courses = 0;

    public Student(String name, String id) {
        setName(name);
        setID(0);
        setGPA(0.0);
    }

    // GPA Calculation
    public void addGrade(double grade) {
        if (grade > 4.0 || grade < 0.0) {
            throw new IllegalArgumentException("Illegal course grade");
        }
        courses++;
        double newGPA = (getGPA() * (courses - 1) + grade) / courses;
        setGPA(newGPA);
    }

    // ID string padded to 4 digits
    public String getIDString() {
        String idStr = String.valueOf(getID());
        return "0".repeat(4 - idStr.length()) + idStr;
    }

    // Getters and Setters for properties
    public String getName() { return name.get(); }
    public void setName(String value) { name.set(value); }
    public StringProperty nameProperty() { return name; }

    public int getID() { return id.get(); }
    public void setID(int value) {
        if (String.valueOf(value).length() > 4) {
            throw new IllegalArgumentException("Max ID length is 4");
        }
        id.set(value);
    }
    public IntegerProperty idProperty() { return id; }

    public double getGPA() { return gpa.get(); }
    public void setGPA(double value) { gpa.set(value); }
    public DoubleProperty gpaProperty() { return gpa; }
}

