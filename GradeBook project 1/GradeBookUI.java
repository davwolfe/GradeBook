import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class GradeBookUI extends Application {
    // Creates a dynamic list that will store students (automatically updates the table)
    private ObservableList<Student> studentList = FXCollections.observableArrayList();

    public void start(Stage primaryStage) {
        // Input Section
        // Creates a text field for entering the student's name
        TextField nameField = new TextField();
        nameField.setPromptText("Name");

        // Create a text field for entering the student's ID
        TextField idField = new TextField();
        idField.setPromptText("ID");

        // Button to add a student when clicked
        Button addButton = new Button("Add Student");

        // TableView Section
        // Creates a table that shows the list of students
        TableView<Student> table = new TableView<>(studentList);

        // Column for student name
        TableColumn<Student, String> nameCol = new TableColumn<>("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        // Column for student ID
        TableColumn<Student, String> idCol = new TableColumn<>("ID");
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));

        // Add both columns to the table
        table.getColumns().addAll(nameCol, idCol);
        // Automatically size the columns to fit the table
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        // Button Functionality
        // When the button is clicked:
        addButton.setOnAction(e -> {
                    String name = nameField.getText();
                    String id = idField.getText();
                    // Only add if both fields are filled
                    if (!name.isEmpty() && !id.isEmpty()) {
                        //Creates a new Student object
                        Student s = new Student(name, id);
                        // Add student to the list (table updates automatically)
                        studentList.add(s);

                        // Clear input fields for the next entry
                        nameField.clear();
                        idField.clear();
                    }
                });

        // Layout Design

        // HBox arranges input fields and button horizontally with 10px spacing
        HBox inputBox = new HBox(10, nameField, idField, addButton);

        // VBox arranges input row and table vertically with 10px spacing
        VBox layout = new VBox(10, inputBox, table);
        layout.setStyle("-fx-padding: 20;");

        // Set up the window
        primaryStage.setScene(new Scene(layout, 400, 300));
        primaryStage.setTitle("GradeBook - Student View");
        primaryStage.show(); // Display the window
    }
    public static void main(String[] args) {
        launch(args); // Launch the JavaFX app
    }
}

