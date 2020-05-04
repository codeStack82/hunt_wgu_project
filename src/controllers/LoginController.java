package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import utils.Alerter;
import javafx.scene.control.Alert.AlertType;

import javax.swing.*;
import java.util.ResourceBundle;


public class LoginController {

    @FXML
    private TextField txt_username;

    @FXML
    private PasswordField txt_password;

    @FXML
    private Button btn_submit;

    @FXML
    private Label lbl_error;

    @FXML
    private void loginSubmitAction(ActionEvent event) {
        lbl_error.setText("*** Wrong Please Try Again ***");

        Alerter a = new Alerter(
                "Test",
                "Hello",
                "Please Work",
                AlertType.INFORMATION // TODO: build enum
                );

    }

}
