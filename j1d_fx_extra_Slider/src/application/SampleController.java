package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class SampleController implements Initializable {

	@FXML
	private Slider slider1;
	@FXML
	private Slider slider3;
	@FXML
	private Slider slider2;
	@FXML
	private Slider slider4;
	@FXML
	private Label label1;
	@FXML
	private Label label2;
	@FXML
	private Label label3;
	
	@FXML
	private Label label4;
	
	@FXML
	ComboBox<String> combo;

	
	
	
	public void comboaction(ActionEvent e){
		System.out.println(combo.getSelectionModel().getSelectedItem());
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// ---------------- Slider mit Listener auswerten
		slider1.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable,
					Number oldValue, Number newValue) {
				label1.setText(newValue+"");

			}
		});
		
		//---------------- Slider mit Binding -----------------------
		
		label2.textProperty().bind(slider2.valueProperty().asString());
		label3.textProperty().bind(slider3.valueProperty().asString());
		label4.textProperty().bind(slider4.valueProperty().asString());

	}

}
