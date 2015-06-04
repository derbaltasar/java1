package application;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;



public class Main extends Application {
	
	Timeline timeline = new Timeline();
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			
			root.setStyle("-fx-background: #FFFFFF;");
			Scene scene = new Scene(root,800,800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			Button btnStart = new Button("Start");
			btnStart.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					timeline.play();
					
				}
			});
			Button btnStop = new Button("Stop");
			btnStop.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					timeline.stop();
				}
			});
			
			Image img1 = new Image(getClass().getResourceAsStream("auto.jpg"));
			ImageView imgView = new ImageView(img1);
			
			
			

			//----------------------------------------------
			
			timeline.setRate(20);
			timeline.getKeyFrames().addAll(
					new KeyFrame(Duration.ZERO, // set start position at 0
							new KeyValue(imgView.translateXProperty(), 0),
							new KeyValue(imgView.translateYProperty(), 0)
							
					),
					new KeyFrame(new Duration(30000), 
							new KeyValue(imgView.translateXProperty(), 700),
							new KeyValue(imgView.translateYProperty(), 0)
							
					),
					new KeyFrame(new Duration(60000), 
							new KeyValue(imgView.translateXProperty(), 0),
							new KeyValue(imgView.translateYProperty(), 0)
							
					)
					
			);
			
			//----------------------------------------
			
			root.setCenter(imgView);
			root.setLeft(btnStart);
			root.setRight(btnStop);
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
