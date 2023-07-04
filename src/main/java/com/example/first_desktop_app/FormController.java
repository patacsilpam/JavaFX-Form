package com.example.first_desktop_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class FormController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private Circle circle;


    public void getName(ActionEvent actionEvent) {
        String newFname = firstName.getText();
        String newLname = lastName.getText();
        welcomeText.setText(newFname + " " + newLname);

        circle.setCenterX(100);
        circle.setCenterY(100);
    }
}