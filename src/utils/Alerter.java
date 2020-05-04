package utils;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alerter {

    private String title = "Title";
    private String header = "header";
    private String content = "content";

    // TODO: Need to build overloads
    // TODO: Build enum for AlertTypes

    public Alerter(String title,
                   String header,
                   String content,
                    AlertType alertType ){

        this.title = title;
        this.header = header;
        this.content = content;

        Alert alert = new Alert(alertType);

        alert.setTitle(this.title);
        alert.setHeaderText(this.header);
        alert.setContentText(this.content);
        alert.show();
    }

}
