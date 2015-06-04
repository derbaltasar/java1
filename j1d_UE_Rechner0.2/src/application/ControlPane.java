package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class ControlPane extends GridPane {

	/*
	 * bekommt Lables als String-Array 1. soviel Buttons wie String-labels
	 * erzeugen 2. an das GridPane bringen (an richtiger Position) 3. Buttons
	 * bekommen die richtige Beschriftung (Labels)
	 */
	public ControlPane(String[][] labels, EventHandler<ActionEvent> event) {
		setAlignment(Pos.CENTER);
		setHgap(5);
		setVgap(5);
		// TODO lh
		for (int i = 0; i < labels.length; i++) {
			for (int j = 0; j < labels[i].length; j++) {
				if (!"".equals(labels[i][j])) {
					Button b = new Button(labels[i][j]);// Buttons mit
														// Beschriftung
					b.setOnAction(event);
					b.setPrefSize(70, 70);

					add(b, j, i);
				}
			}
		}
	}

}
