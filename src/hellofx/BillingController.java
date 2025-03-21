package hellofx;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BillingController {
    
    @FXML private TextField customerIdField;
    @FXML private TextField customerNameField;
    @FXML private TextField phoneField;
    @FXML private ComboBox<String> planComboBox;
    @FXML private TextField usageField;
    @FXML private TextField rateField;
    @FXML private TextField totalBillField;
    @FXML private Label statusLabel;
    
    // Define available telecom plans
    private final ObservableList<String> plans = FXCollections.observableArrayList("Basic", "Premium", "Business");
    
    // Define rate per minute for each plan
    private final double BASIC_RATE = 0.5;
    private final double PREMIUM_RATE = 0.75;
    private final double BUSINESS_RATE = 1.0;
    
    @FXML
    public void initialize() {
        // Populate the plan selection ComboBox
        planComboBox.setItems(plans);
        planComboBox.getSelectionModel().selectFirst();
        updateRateField();
        
        // Update rate when the plan changes
        planComboBox.setOnAction(e -> updateRateField());
    }
    
    private void updateRateField() {
        String selectedPlan = planComboBox.getSelectionModel().getSelectedItem();
        double rate = 0;
        if ("Basic".equals(selectedPlan)) {
            rate = BASIC_RATE;
        } else if ("Premium".equals(selectedPlan)) {
            rate = PREMIUM_RATE;
        } else if ("Business".equals(selectedPlan)) {
            rate = BUSINESS_RATE;
        }
        rateField.setText(String.valueOf(rate));
    }
    
    @FXML
    private void handleCalculateBill() {
        try {
            double usage = Double.parseDouble(usageField.getText());
            double rate = Double.parseDouble(rateField.getText());
            double total = usage * rate;
            totalBillField.setText(String.format("%.2f", total));
            statusLabel.setText("Bill calculated successfully!");
        } catch (NumberFormatException e) {
            statusLabel.setText("Invalid input for usage. Please enter a valid number.");
        }
    }
    
    @FXML
    private void handleSubmitPayment() {
        // Place payment processing logic here. For now, just update the status.
        statusLabel.setText("Payment submitted successfully!");
    }
}