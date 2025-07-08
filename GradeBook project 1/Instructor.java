import javafx.beans.property.*;

public class Instructor {
    private final StringProperty name = new SimpleStringProperty();
    private final IntegerProperty id = new SimpleIntegerProperty();
    private final IntegerProperty courses = new SimpleIntegerProperty();
    private final DoubleProperty grade = new SimpleDoubleProperty();

    public Instructor(String name) {
        setName(name);
        setID(0);
        setCourses(0);
        setGrade(0.0);
    }

    // Format ID to 4-digit string
    public String getIDString() {
        String idStr = String.valueOf(getID());
        if (idStr.length() > 4) {
            throw new IllegalArgumentException("Max ID length is 4");
        }
        return "0".repeat(4 - idStr.length()) + idStr;
    }

    // Properties: JavaFX-compatible
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

    public int getCourses() { return courses.get(); }
    public void setCourses(int value) { courses.set(value); }
    public IntegerProperty coursesProperty() { return courses; }

    public double getGrade() { return grade.get(); }
    public void setGrade(double value) { grade.set(value); }
    public DoubleProperty gradeProperty() { return grade; }
}

