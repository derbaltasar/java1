package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

public class SampleController implements Initializable{

	// open Datei
	@FXML
	public void open(ActionEvent event) {
		FileChooser fc = new FileChooser();
		fc.setTitle("Open...");
		File file = fc.showOpenDialog(null);//null-> Elternelement
		System.out.println(file.getAbsolutePath());
	}
	
	
	/*
	 * open Ordner
	 */
	@FXML
	public void openDir(ActionEvent event) {
		
		DirectoryChooser fc = new DirectoryChooser();
		fc.setTitle("Open Directory...");
		File file = fc.showDialog(null);//null-> Elternelement
		System.out.println(file.getAbsolutePath());
	}
	
	
	
	
	
	// Event Listener on MenuItem.onAction
	@FXML
	public void exit(ActionEvent event) {
		// TODO Autogenerated
		
		System.exit(0);
	}
	
	
	/*
	 * Methode zum initialisieren von... 
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("initialize...");
		
	}
}
