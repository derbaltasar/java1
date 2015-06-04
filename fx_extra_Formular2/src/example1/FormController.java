package example1;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class FormController {
	
	@FXML
	ToggleGroup kundenTyp;
	
	@FXML
	TextField tfVorname;

	@FXML
	TextField tfNachname;
	
	@FXML
	CheckBox checkAGB;
	
	
	@FXML
	private void action(){
		RadioButton rb = (RadioButton) kundenTyp.getSelectedToggle();
		
		System.out.println("Kunde: "+rb.getText());
		System.out.println("Vorname: "+tfVorname.getText());
		System.out.println("Nachname: "+tfNachname.getText());
		System.out.println("AGB: "+checkAGB.isSelected());
	}

}
