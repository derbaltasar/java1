package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {
	@FXML
	private TextField textfield1;
	@FXML
	private Label label1;

	// Event Listener on Button.onAction
	@FXML
	private void letsgo(ActionEvent event) {
		//Button b = (Button) event.getSource();
		
		label1.setText(textfield1.getText());
	}
}
