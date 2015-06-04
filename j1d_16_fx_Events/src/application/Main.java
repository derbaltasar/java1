package application;
	


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FlowPane root = new FlowPane();
			Scene scene = new Scene(root,400,400);
			Button b1 = new Button("Button1");
			Button b2 = new Button("Button2");
			Button b3 = new Button("Button3");
				
			b1.setId("B1");
			b2.setId("B2");
			b3.setId("B3");
			
			b2.setOnAction(new ButtonAction());			
			b3.setOnAction(new ButtonAction());
			
			
			TextField tf1 = new TextField();
			Label label1 = new Label();
			
			
			//---Events-------------------------------------
			// Eventhandler anonym erzeugen
			b1.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent e) {
					
					Button b  = (Button) e.getSource();//liefert das Event-Objekt (Button)
					System.out.println(b.getId()+b.getText());// Eigenschaften von Button
					
					//--------------Text aus TextFiled auf Label
					label1.setText(tf1.getText());
					
				}
			});
			
			//-------------------------------------------------
			root.getChildren().addAll(b1,tf1, label1,b2,b3);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	private class ButtonAction implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent event) {
			System.out.println("ActionEvent: "+event);
			
			Button b = (Button) event.getSource(); // aktueller Button
			b.setEffect(null);
			if(b.getId().equals("B2")){
				System.out.println("B2...");
				
			}else if(b.getId().equals("B3")){
				System.out.println("B3...");
				
				b.setEffect(new DropShadow());
			
			}
			
		}
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
}
