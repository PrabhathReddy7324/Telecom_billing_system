package hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Change the resource to login.fxml for testing the login page
        Parent root = FXMLLoader.load(getClass().getResource("BillingUI.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 2944, 1840));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}