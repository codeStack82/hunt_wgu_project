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
        String un = "admin";
        String pw = "admin";

        String un_actual = txt_username.getText().trim();
        String pw_actual = txt_password.getText().trim();

        if (un.equalsIgnoreCase(un_actual) &&
                pw.equalsIgnoreCase(pw_actual)

        ){
            lbl_error.setText("admin logged in");
        }else{
            lbl_error.setText("admin NOT logged in");
        }
    }

}
