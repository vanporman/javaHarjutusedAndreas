package javaHarjutusedFX;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * 1. Joonista kast kasutades jooni 
 * 2. Joonista spiraal kasutades jooni (vaata ringi meetodi)
 * 3. Joonista propeller (nagu propeller.png) kasutades jooni
 */
public class Harjutus2_ringid extends Application {
	int aknaLaius = 300;
	int aknaK6rgus = 300;

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Scene scene = new Scene(pane, aknaLaius, aknaK6rgus);
		primaryStage.setScene(scene);
		
//		//Joontest ruut
//		 Line joon1 = new Line(20, 20, 250, 20);
//		 Line joon2 = new Line(250, 20, 250, 250);
//		 Line joon3 = new Line(250, 250, 20, 250);
//		 Line joon4 = new Line(20, 250, 20, 20);
//		 pane.getChildren().addAll(joon1, joon2, joon3, joon4);
		 
//		//Spiraal
//		int x = 140;
//		int y = 140;
//		int len = 20;
//		
//		  for (int i = 0; i < 6; i++){ 
//			  Line joon1 = new Line(x, y, x + len, y); //paremale 140, 140, 160, 140
//			  x = x + len; //140+20=160
//			  y = y - len; //140-20=120
//			  Line joon2 = new Line(x, y + len, x, y); //yles 160, 140, 160, 120
//			  len = len + 20; //20+20=40
//			  Line joon3 = new Line(x , y, x - len, y); //vasakule 160, 120, 120, 120
//			  x = x - len; //160-40=120
//			  Line joon4 = new Line(x, y, x, y + len); //alla 120, 120, 120, 160
//			  y = y + len; //120+40=160
//			  len = len + 20; //40+20=60
//			  
//		  pane.getChildren().addAll(joon1, joon2, joon3, joon4); }
		 
//		//Joontest ring
//		double keskkohtX = aknaLaius / 2;
//        double keskkohtY = aknaK6rgus / 2;
//        int raadius = 125;
//
//        for (double nurk = 0; nurk <= Math.PI * 2; nurk = nurk + 0.3) {
//            int algX = (int) (raadius * Math.cos(nurk));
//            int algY = (int) (raadius * Math.sin(nurk));
//            int loppX = (int) (raadius * Math.cos(nurk + 0.1));
//            int loppY = (int) (raadius * Math.sin(nurk + 0.1));
//            Line joon = new Line(keskkohtX + algX, keskkohtY + algY, keskkohtX + loppX, keskkohtY + loppY);
//            pane.getChildren().add(joon);
//        }
		
		//Joontest Propeller
		double keskkohtX = aknaLaius / 2;
        double keskkohtY = aknaK6rgus / 2;
        double raadius = 125;
        int count = 0;

        for (double nurk = 0; nurk <= Math.PI * 2; nurk = nurk + 0.1) {
            int algX = (int) (raadius * Math.cos(nurk));
            int algY = (int) (raadius * Math.sin(nurk));
            double loppX;
            double loppY;
            if (count % 2 == 0) {
                loppX = (int) (raadius * Math.cos(nurk + 0.1));
                loppY = (int) (raadius * Math.sin(nurk + 0.1));
            } else {
                loppX = 0;
                loppY = 0;
                Line joon = new Line(keskkohtX + algX, keskkohtY + algY, keskkohtX + loppX, keskkohtY + loppY);
                pane.getChildren().add(joon);
                algX = (int) (raadius * Math.cos(nurk + 0.1));
                algY = (int) (raadius * Math.sin(nurk + 0.1));
            }
            count++;
            Line joon = new Line(keskkohtX + algX, keskkohtY + algY, keskkohtX + loppX, keskkohtY + loppY);
            pane.getChildren().add(joon);
        }

		primaryStage.setTitle("Joontest spiraal");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
