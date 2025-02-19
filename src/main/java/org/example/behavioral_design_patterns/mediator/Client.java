package org.example.behavioral_design_patterns.mediator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Client extends Application {

	@Override
	public void start(final Stage primaryStage) throws Exception {
		final UIMediator mediator = new UIMediator();
		final Slider slider = new Slider(mediator);
		final TextBox box = new TextBox(mediator);
		final Label label = new Label(mediator);
		
		final GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(20);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.add(label, 0, 0);
		grid.add(slider, 0, 1);
		grid.add(box, 0, 2);
		final Scene scene = new Scene(grid, 500, 500);
		primaryStage.setTitle("Mediator Pattern");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args); 
	}
}
