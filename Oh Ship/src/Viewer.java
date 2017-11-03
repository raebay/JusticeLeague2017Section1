import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
//import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
//import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Viewer extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		initUI(primaryStage);
	}
	
	private void initUI(Stage stage) {
		//initial window pane and setting variables
		int windowSizeX = 600;
		int windowSizeY = 400;
		BorderPane root = new BorderPane();
		
		//console components
		VBox right = new VBox(10);
		right.setStyle(" -fx-background-color: #888888;");
		right.setPadding(new Insets(10,15,10,15));
		right.setSpacing(10);
		right.setPrefSize(windowSizeX/3, windowSizeY);
		TextField output = new TextField();
		output.setPrefHeight((3*windowSizeY)/4);
		TextField input = new TextField();
		input.setPrefHeight(windowSizeY/4);
		right.getChildren().add(output);
		right.getChildren().add(input);
		
		
		//map components
		Pane mapView = new Pane();
		Image imgLowest = new Image("LowestPart.png");
		ImageView viewLowest = new ImageView();
		viewLowest.setImage(imgLowest);
		viewLowest.setFitWidth(400);
		viewLowest.setPreserveRatio(true);
		mapView.getChildren().add(viewLowest);
		
		
		
		
		// lowest part gridpane
//		GridPane left = new GridPane();
//		left.setStyle(" -fx-background-color: #ffffff;");
//		left.setPadding(new Insets(10,15,10,15));
//		left.setGridLinesVisible(true);
//		left.setPrefSize((2*windowSizeX)/3, windowSizeY/6);
//		left.setAlignment(Pos.valueOf("CENTER"));
		

		
		
		// combo box list of maps
		ObservableList<String> maps = 
			    FXCollections.observableArrayList(
			        "Lowest Part",
			        "Lower Deck",
			        "Middle Deck",
			        "Upper Deck"
			    );
		
		//button bar 
		HBox bottom = new HBox();
		bottom.setPrefSize((2*windowSizeX)/3, windowSizeY/6);
		bottom.setPadding(new Insets(10, 15, 10, 15));
		bottom.setSpacing(10);
		bottom.setStyle(" -fx-background-color: #ADADAD;");
		Button btnExamine = new Button("Examine");
		Button btnSubmit = new Button("Submit");
		Button btnOptions = new Button("Options");
		ComboBox<String> mapList = new ComboBox<String>(maps);
		
		
		bottom.getChildren().add(mapList);
		bottom.getChildren().add(btnOptions);
		bottom.getChildren().add(btnExamine);
		bottom.getChildren().add(btnSubmit);
		
		
		
		
		
		//add panes to main window pane
		root.setRight(right);
		root.setLeft(mapView);
		root.setBottom(bottom);
		
		//setting stage
		Scene scene = new Scene(root, windowSizeX, windowSizeY);
		stage.setTitle("Oh Ship");
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
	

}
