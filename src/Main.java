import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tests.TestRunner;

public class Main extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("views/login.fxml"));
            primaryStage.setTitle("Hunt WGU Project");
            primaryStage.setScene(new Scene(root, 800, 400));
            primaryStage.setResizable(false); ;
            primaryStage.show();
        }

        public static void main(String[] args) {
           // Run tests
            TestRunner tests = new TestRunner();
            tests.run();

            // Exits sys if running tests
            //System.exit(0);

            // Launch main app
            launch(args);

        }
    }
