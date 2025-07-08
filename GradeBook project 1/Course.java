import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Course {
    private final StringProperty name = new SimpleStringProperty();
    private final IntegerProperty id = new SimpleIntegerProperty();
    private final IntegerProperty credit = new SimpleIntegerProperty();
    private final IntegerProperty size = new SimpleIntegerProperty(0);

    private final ObservableList<Student> enrolled = FXCollections.observableArrayList();
    private Instructor prof; // Optional: add this in the UI later

    public Course(String name) {
        setName(name);
        setID(0);
        setCredit(0);
    }

    // Add student to course
    public void addStudent(Student s) {
        if (enrolled.size() >= 30) {
            throw new IllegalArgumentException("Class is full");
        }
        enrolled.add(s);
        setSize(enrolled.size());
    }

    // Get padded ID string
    public String getIDString() {
        String idStr = String.valueOf(getID());
        return "0".repeat(4 - idStr.length()) + idStr;
    }

    // JavaFX-friendly getters and setters

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

    public int getCredit() { return credit.get(); }
    public void setCredit(int value) { credit.set(value); }
    public IntegerProperty creditProperty() { return credit; }

    public int getSize() { return size.get(); }
    public void setSize(int value) { size.set(value); }
    public IntegerProperty sizeProperty() { return size; }

    public ObservableList<Student> getEnrolled() { return enrolled; }

    // Instructor-related logic can be added later
    public Instructor getProf() { return prof; }
    public void setProf(Instructor prof) { this.prof = prof; }
}

