package utils;

import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class Alerter {

    public Alerter() {
        Alert alert = new Alert(AlertType.ERROR);

        alert.setTitle("Test Alert");
        alert.setHeaderText("Help");
        alert.setContentText("Please Help me!");
        alert.showAndWait();
    }
}
