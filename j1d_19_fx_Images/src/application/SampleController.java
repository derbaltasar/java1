package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SampleController {
	
	
	@FXML
	ImageView imgView;
	
	public void setImage(ActionEvent e){
		imgView.setImage(new Image("img/Penguins.jpg"));
	}
	
	
}
