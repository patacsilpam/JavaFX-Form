package com.example.first_desktop_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;



    public void getName(ActionEvent actionEvent) {
        String newFname = firstName.getText();
        String newLname = lastName.getText();
        welcomeText.setText(newFname + " " + newLname);
    }
}