
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class javaFXLaevadePommitamineUX extends Application {
	GridPane manguLaud;
	int lauaPikkusLaevades = 9;
	int laevaPikkusPx = 50;
	Stage mainGameStage;
	Image piraadiLaev = new Image("pirate.png");
	ImagePattern laevaPildiMuster = new ImagePattern(piraadiLaev);
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		seadistaLava();
		sisestaLaevad();
		reageeriKlikile();
		
	}

	private void reageeriKlikile() {
		manguLaud.setOnMouseClicked(event -> {
			//System.out.println("KLIKK");
			Rectangle ruut = (Rectangle) event.getTarget();
			String tyyp = ruut.getId();
			if(tyyp.equals("meri")){
				System.out.println("KLIKK MÖÖDA");
				ruut.setFill(Color.DARKBLUE);
			}else if (tyyp.equals("laev")){
				System.out.println("KLIKK PIHTA");
				ruut.setFill(laevaPildiMuster);
				ruut.setId("põhjas");
			}
			
			if(!laevasidOnAlles()){
				gameOver();
			}
			
		});
		
		
	}

	private void gameOver() {
		mainGameStage.close();
		StackPane stack = new StackPane();
		Label go = new Label("V6itsid!!!");
		stack.getChildren().add(go);
		Scene scene = new Scene(stack, 300, 150);
		Stage goStage = new Stage();
		goStage.setScene(scene);
		goStage.show();
		
	}

	private boolean laevasidOnAlles() {
		for(Node ruut : manguLaud.getChildren()){
			if(ruut.getId().equals("laev")){
				return true;
			}
		}
		return false;
	}

	private void sisestaLaevad() {
		for(int i=0; i < lauaPikkusLaevades; i++){
			for(int j=0; j < lauaPikkusLaevades; j++){
				// Siia tulen 9 * 9 korda MAATRIKS
				Rectangle ruut = new Rectangle(laevaPikkusPx, laevaPikkusPx);
				int randLaev = (int) (Math.random() * 1.3);
				if (randLaev == 1){
					ruut.setId("laev");
				}else{
					ruut.setId("meri");
				}
				ruut.setFill(Color.BLUE);
				//ruut.setStroke(Color.GREENYELLOW);
				manguLaud.add(ruut, i, j);
			}
		}
		
	}

	private void seadistaLava() {
		manguLaud = new GridPane();
		Scene scene = new Scene(manguLaud, (laevaPikkusPx*lauaPikkusLaevades), (laevaPikkusPx*lauaPikkusLaevades));
		mainGameStage = new Stage();
		scene.setFill(Color.DARKBLUE);
		mainGameStage.setScene(scene);
		mainGameStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
