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
            primaryStage.setTitle("Login");
            primaryStage.setScene(new Scene(root, 600, 300));
            primaryStage.setResizable(false); ;
            primaryStage.show();
        }

        public static void main(String[] args) {
            // Launch main app
            launch(args);

            //runTests();
        }

        //helper function to run tests
        public static void runTests(){
            TestRunner tests = new TestRunner();  // Create test runner
            tests.run();                          // Run tests
            System.exit(0);                // Exits sys if running tests
        }

    }
