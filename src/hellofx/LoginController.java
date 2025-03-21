package hellofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label statusLabel;
    
    @FXML
    private void handleLoginAction() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        // Sample authentication: both username and password must be "admin"
        if ("admin".equals(username) && "admin".equals(password)) {
            statusLabel.setText("Login Successful!");
            // TODO: Add code to proceed to the next UI (e.g. telecom billing interface)
        } else {
            statusLabel.setText("Invalid credentials. Please try again.");
        }
    }
}