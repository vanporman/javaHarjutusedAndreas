package javaHarjutusedFX;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * 1. Joonista kast kasutades jooni 2. Joonista spiraal kasutades jooni (vaata
 * ringi meetodi) 3. Joonista propeller (nagu propeller.png) kasutades jooni
 */
public class Harjutus2_ringid extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setScene(scene);
		/*
		 * Line joon1 = new Line(20, 20, 250, 20); Line joon2 = new Line(250,
		 * 20, 250, 250); Line joon3 = new Line(250, 250, 20, 250); Line joon4 =
		 * new Line(20, 250, 20, 20); pane.getChildren().addAll(joon1, joon2,
		 * joon3, joon4);
		 */

		int x = 140;
		int y = 140;
		int len = 5;
		/*
		 * for (int i = 0; i < 6; i++){ Line joon1 = new Line(x, y, x + len,
		 * y);//paremale 140, 140, 160, 140 x = x + len;//140+20=160 y = y -
		 * len;//140-20=120 Line joon2 = new Line(x, y + len, x, y);//yles 160,
		 * 140, 160, 120 len = len + 20;//20+20=40 Line joon3 = new Line(x , y,
		 * x - len, y);//vasakule 160, 120, 120, 120 x = x - len;//160-40=120
		 * Line joon4 = new Line(x, y, x, y + len);//alla 120, 120, 120, 160 y =
		 * y + len;//120+40=160 len = len + 20;//40+20=60
		 * pane.getChildren().addAll(joon1, joon2, joon3, joon4); }
		 */
		for (int i = 0; i < 360; i++) {

		}

		primaryStage.setTitle("Joontest spiraal");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
