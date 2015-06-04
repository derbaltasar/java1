package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
/**
 * 
*	KeyAction
*	Java 1
* 	@author Dozent: Micha Schirmer
*	@04.02.2015
*	@d_fx_ue_Rechner0.9
*
 */
public class Main extends Application {
	private StringBuilder expressionBuilder = new StringBuilder();

	private static final String[][] labels = { { "C", "", "", "%" },
			{ "7", "8", "9", "/" }, { "4", "5", "6", "*" },
			{ "1", "2", "3", "-" }, { "0", ",", "=", "+" },

	};

	private TextField displayTF = new TextField();

	@Override
	public void start(Stage primaryStage) {
		try {

			BorderPane root = new BorderPane();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(
					getClass().getResource("application.css").toExternalForm());

			displayTF.setEditable(false);
			displayTF.setAlignment(Pos.BASELINE_RIGHT);
			displayTF.setOnKeyPressed(new KeyAction());
			root.setTop(displayTF);
			ControlPane cp = new ControlPane(labels, new ButtonAction());
			
			root.setCenter(cp);

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	class KeyAction implements EventHandler<KeyEvent> {

		@Override
		public void handle(KeyEvent event) {
			
			String token = event.getText();
			
			System.out.println(event.getCode()+" "+KeyCode.ENTER);
			boolean isEnter = event.getCode() == KeyCode.ENTER;
			if (isEnter) {
				token = "=";
			}
			if(isValidToken(token)||isEnter){
					scan(token);
			}
		}

	}

	class ButtonAction implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			Button b = (Button) event.getSource();
			String token = b.getText();
			scan(token);

		}

	}

	private void scan(String token) {
		token = token.equals(",") ? "." : token;
		if (token.equalsIgnoreCase("c")) {
			reset();
		} else if (token.equals("=")) {
			String result = Calculator.calc(expressionBuilder.toString());

			reset();
			displayTF.setText(result);
		} else {

			expressionBuilder.append(token);
			displayTF.setText(expressionBuilder.toString());
		}
	}

	private void reset() {
		expressionBuilder.setLength(0);
		displayTF.setText("");
	}

	private boolean isValidToken(String token) {
		return token.matches("[0-9+-/\\*]");
	}

	public static void main(String[] args) {
		launch(args);
	}
}
