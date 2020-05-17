package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class LoginController implements Initializable {

    @FXML
    private TextField txt_username;

    @FXML
    private PasswordField txt_password;

    @FXML
    private Button btn_submit;

    @FXML
    private Label lbl_error;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void loginSubmitAction(ActionEvent event) {
        String un = "admin";
        String pw = "admin";

        String un_actual = txt_username.getText().trim();
        String pw_actual = txt_password.getText().trim();

        if (un.equalsIgnoreCase(un_actual) && pw.equalsIgnoreCase(pw_actual)){

            lbl_error.setText(un + " logged in");
           //TODO: Switch to home scene

        }else{
            lbl_error.setText(un + " NOT logged in");
        }
    }
}
