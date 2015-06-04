package application;



import javafx.application.Preloader;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Preloader1 extends Preloader {
	private Stage stage;
	private ProgressBar bar;
	
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root,400,400);
		this.stage = primaryStage;
		this.bar = new   ProgressBar();
		root.setCenter(bar);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	@Override
	public void handleProgressNotification(ProgressNotification info) {
		System.out.println("handleProgressNotification...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 bar.setProgress(info.getProgress());
	}
	@Override
	public void handleStateChangeNotification(StateChangeNotification info) {
		System.out.println("handleStateChangeNotification...");
		if(info.getType()== StateChangeNotification.Type.BEFORE_START){
				stage.hide();
		}
	}
}
