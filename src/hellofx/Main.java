package hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the login UI for testing
        Parent root = FXMLLoader.load(getClass().getResource("BillingUI.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 2480, 1440));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}