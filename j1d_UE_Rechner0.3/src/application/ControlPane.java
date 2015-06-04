package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class ControlPane extends GridPane {

	public ControlPane(String[][] labels, 
			EventHandler<ActionEvent> eh) {
		
		int row = labels.length;
		int col = labels[0].length;
		setHgap(4);
		setVgap(4);
		setAlignment(Pos.CENTER);

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				Button b = new Button(labels[i][j]);
				b.setOnAction(eh);
				b.setPrefSize(70, 70);
				add(b, j, i);
			}
		}

	}

}
