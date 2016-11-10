
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class javaFX_test extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox vbox = new VBox();
		Scene login = new Scene(vbox, 300, 300);
		primaryStage.setScene(login);
		primaryStage.show();
		
		Label pealkiri = new Label("Mis on pealkiri");
		TextField paroolField = new TextField();
		Button submit = new Button("Uus Nupp");
		
		vbox.getChildren().addAll(pealkiri, paroolField, submit);
		
		Circle ring = new Circle(100);
		Pane pane = new Pane();
		//Button tagasi = new Button("tagasi");
		pane.getChildren().addAll(ring);
		Scene seeStseen = new Scene(pane, 500, 300);
		ring.setCenterX(250);
		ring.setCenterY(150);
		
		
		
		submit.setOnAction(event ->{
			System.out.println("KLIKK");
			//primaryStage.setScene(seeStseen);
			String parool = paroolField.getText();
			if (parool.equals("minuParool")){
				System.out.println("See on mu parool");
				primaryStage.setScene(seeStseen);
			}
			else {
				System.out.println(parool);
			}
		});
		/*
		tagasi.setOnAction(event ->{
			System.out.println("KLIKK");
			primaryStage.setScene(login);
			String parool = paroolField.getText();
			if (parool.equals("minuParool")){
				System.out.println("See on mu parool");
				primaryStage.setScene(seeStseen);
			}
			else {
				System.out.println("Paroltsik on vale");
			}
		});
		*/
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
