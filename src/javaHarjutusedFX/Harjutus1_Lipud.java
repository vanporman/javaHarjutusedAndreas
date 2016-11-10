package javaHarjutusedFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * 1. Joonista eesti lipp kasutades kolme Rectangle 2. Joonista Jaapani lipp
 * kasutades Rectangle ja Circle
 */
public class Harjutus1_Lipud extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Rectangle rec = new Rectangle(20, 20, 100, 60);
		rec.setFill(Color.TRANSPARENT);
		rec.setStroke(Color.BLACK);
		Rectangle rec1 = new Rectangle(20, 20, 100, 20);
		rec1.setFill(Color.BLUE);
		Rectangle rec2 = new Rectangle(20, 40, 100, 20);
		rec2.setFill(Color.BLACK);
		Rectangle rec3 = new Rectangle(20, 60, 100, 20);
		rec3.setFill(Color.WHITE);
		Rectangle rec4 = new Rectangle(140, 20, 100, 60);
		rec4.setFill(Color.TRANSPARENT);
		rec4.setStroke(Color.BLACK);
		rec4.setStrokeWidth(0.1);
		Circle ring = new Circle(20);
		ring.setFill(Color.RED);
		ring.setCenterX(190);
		ring.setCenterY(50);
		Pane pane = new Pane();
		pane.getChildren().addAll(rec, rec1, rec2, rec3, rec4, ring);
		Scene primaryScene = new Scene(pane, 500, 300);
		// seeStseen.setFill(Color.ALICEBLUE);

		primaryStage.setScene(primaryScene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
