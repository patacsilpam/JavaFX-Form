package com.example.first_desktop_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class FormController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private Circle circle;

    private Stage stage;
    private Scene scene;
    private Parent parent;


   /* private void  switchToLoginForm(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private void  switchToSignUpForm(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("form-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }*/

    /*
    public void getName(ActionEvent actionEvent) {
        String newFname = firstName.getText();
        String newLname = lastName.getText();
        welcomeText.setText(newFname + " " + newLname);

        circle.setCenterX(100);
        circle.setCenterY(100);
    }*/
}