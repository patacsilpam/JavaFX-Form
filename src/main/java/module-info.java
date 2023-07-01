module com.example.first_desktop_app {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.first_desktop_app to javafx.fxml;
    exports com.example.first_desktop_app;
}