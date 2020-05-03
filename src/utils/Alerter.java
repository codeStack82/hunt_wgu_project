package utils;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alerter {

    private String title = "Title";
    private String header = "header";
    private String content = "content";

    public Alerter() {
        Alert alert = new Alert(AlertType.ERROR);

        alert.setTitle("Test Alert");
        alert.setHeaderText("Help");
        alert.setContentText("Please Help me!");
        alert.showAndWait();
    }

    public Alerter(String title, String header, String content){
        this.title = title;
        this.header = header;
        this.content = content;

        Alert alert = new Alert(AlertType.NONE);

        alert.setTitle(this.title);
        alert.setHeaderText(this.header);
        alert.setContentText(this.content);
        alert.showAndWait();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
