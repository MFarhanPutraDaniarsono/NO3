module com.example.uts1a {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uts1a to javafx.fxml;
    exports com.example.uts1a;
}