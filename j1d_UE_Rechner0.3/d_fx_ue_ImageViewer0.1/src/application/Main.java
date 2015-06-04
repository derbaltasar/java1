package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
/*
 * ImageViewer0.1:
 * - Menü: open File, exit
 * - open: FileChooser wird geöffnet
 * - nur Bilder zulassen
 * - nach auswahl eines Bildes wird es auf einer ImageView angezeigt
 */

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			


			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
		
			
			Scene scene = new Scene(root,550,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
