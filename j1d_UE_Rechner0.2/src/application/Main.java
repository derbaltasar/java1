package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	String[][] labels = {
			{"C","","","%"},
			{"7","8","9","*"},
			{"4","5","6","/"},
			{"1","2","3","+"},
			{"0",",","=","-"},
	};
	
	private TextField displayField = new TextField();
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//------------------------------------------------
		
			root.setTop(displayField);
			ControlPane cp = new ControlPane(labels, new ButtonAction());
			root.setCenter(cp);
			
			//----------------------------------------------------
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// eigentlich in einen Controller
	private class ButtonAction implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			System.out.println(event);
			// Rechnen
			
		}
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
