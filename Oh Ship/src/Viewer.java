import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Viewer extends Application implements EventHandler<ActionEvent> {
	
	
	TextArea output;
	TextField input;
	Button btnExamine;
	Button btnSubmit;
	Button btnOptions;
	ComboBox<String> mapList;
	ObservableList<String> maps;
	
	// put any models as field variables, this is the iffy part
	TestModel test;
	
	
	ImageView imgView;
	Image imgLowest;
	Image imgLower;
	Image imgMiddle;
	Image imgUpper;
	Image imgBridge;
	Image img1HLower;
	Image img1a;
	Image img1b;
	Image img1c;
	Image img1d;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Initialize any models you need to use <<<<
		test = new TestModel();
		initUI(primaryStage);
	}
	
	public static void main(String[] args) {
		launch(args);
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
		// output field
		output = new TextArea();
		output.setWrapText(true);
		output.setStyle("-fx-font-size: 0.8em;");
		output.setText("Holy smokes, this GUI is pretty poopy.");
		output.setEditable(false);
		output.setPrefHeight((3*windowSizeY)/4);
		// input field
		input = new TextField();
		input.setAlignment(Pos.TOP_LEFT);
		input.setPrefHeight(windowSizeY/4);
		// add input and output to VBOX
		right.getChildren().add(output);
		right.getChildren().add(input);
		
		
		// map components
		Pane mapView = new Pane();
		// initialize map images
		imgLowest = new Image("/resources/Lowest.png");
		imgLower = new Image("/resources/Lower.png");
		imgMiddle = new Image("/resources/Middle.png");
		imgUpper = new Image("/resources/Upper.png");
		imgBridge = new Image("/resources/Bridge.png");
		img1HLower = new Image("/resources/1H_Staircase1_Lower.png");
		img1a = new Image("/resources/1A_EngineRoom.png");
		img1b = new Image("/resources/1B_Hall.png");
		img1c = new Image("/resources/1C_EngineRoomB.png");
		img1d = new Image("/resources/1D_LockerRooms.png");


		
		// image view that displays selected map image
		imgView = new ImageView();
		imgView.setFitWidth(400);
		imgView.setPreserveRatio(true);
		mapView.getChildren().add(imgView);
		// combo box list of maps
		maps = 
			    FXCollections.observableArrayList(
			        "Lowest Part",
			        "Lower Deck",
			        "Middle Deck",
			        "Upper Deck",
			        "Bridge"
			    );
		
		
		//button bar 
		HBox bottom = new HBox();
		bottom.setPrefSize((2*windowSizeX)/3, windowSizeY/8);
		bottom.setPadding(new Insets(10, 15, 10, 15));
		bottom.setSpacing(10);
		bottom.setStyle(" -fx-background-color: #ADADAD;");
		// examine button
		btnExamine = new Button("Examine");
		btnExamine.setOnAction(this);
		// submit button
		btnSubmit = new Button("Submit");
		btnSubmit.setOnAction(this);
		// options button
		btnOptions = new Button("Options");
		btnOptions.setOnAction(this);
		// combo box for map list
		mapList = new ComboBox<String>(maps);
		mapList.setPromptText("Select map");
		mapList.setOnAction(this);
		// add buttons and list to HBOX
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

	@Override
	public void handle(ActionEvent event) 
	{
		
		// examine button event
		if(event.getSource() == btnExamine) 
		{
			System.out.println("Examine");
		}
		
		// submit button event
		// this is the part that communicates with the testmodel class
		// >>>>>>>>>>>>
		if(event.getSource() == btnSubmit)
		{
			
			// calls update in the model class
			String out = test.update(input.getText());
			// calls update in the view class
			updateConsole(out);
			input.setText("");
			
			//call method to update map view if player location has changed
			updateMapView();
			
		}
		
		// options button event
		if(event.getSource() == btnOptions)
		{
			System.out.println("Options");
		}
		
		
		// combo box event
		if(event.getSource() == mapList) 
		{
			if(mapList.getValue() == "Lowest Part") 
			{
				imgView.setImage(imgLowest);
			} 
			else if(mapList.getValue() == "Lower Deck") 
			{
				imgView.setImage(imgLower);
			} 
			else if(mapList.getValue() == "Middle Deck") 
			{
				imgView.setImage(imgMiddle);
			} 
			else if(mapList.getValue() == "Upper Deck") 
			{
				imgView.setImage(imgUpper);
			} 
			else if(mapList.getValue() == "Bridge") 
			{
				imgView.setImage(imgBridge);
			}
		}
		
		
	}

	public void updateMapView() {
		// finds the room the player currently is and displays the corresponding map.
		if (test.currentRoomID.equals("1.a")) {
			imgView.setImage(img1a);
		} else if (test.currentRoomID.equals("1.b")) {
			imgView.setImage(img1b);
		} else if (test.currentRoomID.equals("1.c")) {
			imgView.setImage(img1c);
		} else if (test.currentRoomID.equals("1.d")) {
			imgView.setImage(img1d);
		}
	}
	
	public void updateConsole(String out) 
	{
		output.setText(out);
//		String console = output.getText();
//		if (console != null) {
//			console = console + "\r\n";
//		}
//		String usrInput = "user: " + input.getText();
//		output.setText(console + usrInput);
//		input.setText("");
	}
	
	
	
	
	
	

}
