package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class SampleController implements Initializable{
	
	
	@FXML
	ImageView imageView;
	
	
	
	@FXML
	private void openFile(ActionEvent e){
		System.out.println("open...");
		FileChooser fc = new  FileChooser();
		fc.setTitle("Open Resource File");
		fc.getExtensionFilters().add(new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"));
		File file = fc.showOpenDialog(null );
		imageView.setImage(new Image("file:///"+file.getAbsolutePath()));
	}

	@FXML
	private void fullscreen(){
		Stage stage =(Stage) imageView.getScene().getWindow();
		stage.setFullScreen(true);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//hier Platz zum initialisieren
		
		
	}
	

}
