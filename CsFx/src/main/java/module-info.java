module com.example.csfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csfx to javafx.fxml;
    exports com.example.csfx;
}