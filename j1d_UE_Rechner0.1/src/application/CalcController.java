package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcController {
	
	private String expression="";
	@FXML
	private TextField displayField;

	// Event Listener on Button.onAction
	@FXML
	public void handleButtons(ActionEvent event) {
		Button b = (Button) event.getSource();
		String buttonText = b.getText();
		expression+=buttonText;//alle Zeichen sammeln
		displayField.setText(expression);
		
	}
	
	@FXML
	private void handleEqualsButton(ActionEvent event){
		try {
		Button b = (Button) event.getSource();
		String buttonText = b.getText();
		System.out.println(buttonText);
		//rechnen
		String result = Rechner.rechne(expression);
			
		displayField.setText(result);
		expression = result;
		} catch (ExpressionException e) {
// Verhindern des blockierens der GUI
//			Platform.runLater(new Runnable() {
//				
//				@Override
//					displayField.setText("falscher Ausdruck!");
//					
//				}
//			});
			
			displayField.setText("falscher Ausdruck!");
			expression="";
		
		//	e.printStackTrace();
		}
	}
	@FXML
	private void handleClear(ActionEvent event){
		expression="";
		displayField.setText("");
	}
	
	
}