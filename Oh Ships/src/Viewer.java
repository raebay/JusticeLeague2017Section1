package Model;
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


public class Viewer extends Application implements EventHandler<ActionEvent> 
{
	
	
	TextArea output;
	TextField input;
	Button btnHelp;
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
	Image img1e;
	Image img1f;
	Image img1g;
	Image img1h;
	Image img2a;
	Image img2b;
	Image img2c;
	Image img2d;
	Image img2e;
	Image img2f;
	Image img2g;
	Image img2h;
	Image img2i;
	Image img2j;
	Image img3a;
	Image img3b;
	Image img3c;
	Image img3d;
	Image img3e;
	Image img4a;
	Image img4b;
	Image img4c;
	Image img4d;
	Image img4e;
	Image img4f;
	Image img4g;
	Image img4h;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		// Initialize any models you need to use <<<<
		test = new TestModel();
		initUI(primaryStage);
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
	
	private void initUI(Stage stage)
	{
		//initial window pane and setting variables
		int windowSizeX = 800;
		int windowSizeY = 400;
		BorderPane root = new BorderPane();
		
		//console components
		VBox right = new VBox(10);
		right.setStyle(" -fx-background-color: #888888;");
		right.setPadding(new Insets(10,15,10,15));
		right.setSpacing(10);
		right.setPrefSize(windowSizeX/2, windowSizeY);
		// output field
		output = new TextArea();
		output.setWrapText(true);
		output.setStyle("-fx-font-size: 0.8em;");
		output.setText("Oh Ship, press options to save, press help to get list of commands");
		output.setEditable(false);
		output.setPrefHeight((3*windowSizeY)/4);
		output.setScrollTop(Double.MAX_VALUE);
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
		img1e = new Image("/resources/1E_Hall2.png");
		img1f = new Image("/resources/1F_SupervisorsOffice.png");
		img1g = new Image("/resources/1G_UtilityCloset.png");
		img2a = new Image("/resources/2A_AccessRoom.png");
		img2b = new Image("/resources/2B_OpenRoom.png");
		img2c = new Image("/resources/2C_Hallway.png");
		img2d = new Image("/resources/2D_CrewQuarters.png");
		img2e = new Image("/resources/2E_OfficersQuarters.png");
		img2f = new Image("/resources/2F_MainLobby.png");
		img2g = new Image("/resources/2G_Hallway2.png");
		img2h = new Image("/resources/2H_DiningHall.png");
		img2i = new Image("/resources/2I_CargoArea.png");
		img2j = new Image("/resources/2J_Kitchen.png");
		img3a = new Image("/resources/3A_Staircase1_Middle.png");
		img3b = new Image("/resources/3B_Hall.png");
		img3c = new Image("/resources/3C_Kitchen.png");
		img3d = new Image("/resources/3D_StorageRoom.png");
		img3e = new Image("/resources/3E_Staircase2_Upper.png");
		img4a = new Image("/resources/4A_Deck.png");
		img4b = new Image("/resources/4B_Overlook.png");
		img4c = new Image("/resources/4C_LoungeArea.png");
		img4d = new Image("/resources/4D_Staircase4_Upper.png");
		img4e = new Image("/resources/4E_Hall.png");
		img4f = new Image("/resources/4F_Bridge.png");
		img4g = new Image("/resources/4G_CrewsNest.png");
		img4h = new Image("/resources/4H_Lifeboat.png");
		
		
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
		btnHelp = new Button("Help");
		btnHelp.setOnAction(this);
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
		bottom.getChildren().add(btnHelp);
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
		if(event.getSource() == btnHelp) 
		{
			String helpStr = ("\r\n"
					+ "- Commands List -"
					+ "\r\nGo to [RoomID]"
					+ "\r\nSearch"
					+ "\r\nPick up [item name]"
					+ "\r\nCheck inventory"
					+ "\r\nInspect [item name]");
			updateConsole(helpStr);
		}
		
		// submit button event
		// this is the part that communicates with the testmodel class
		// >>>>>>>>>>>>
		if(event.getSource() == btnSubmit)
		{
			String in = input.getText();
			updateConsole("PLAYER: " + in);
			// calls update in the model class
			String out = test.update(in);
			// calls update in the view class
			updateConsole(out);
			input.setText("");
			
			//call method to update map view if player location has changed
			if (in.contains("Go to") || in.contains("go to")) {
				updateMapView();
			}
			
		}
		
		// options button event
		if(event.getSource() == btnOptions)
		{
			String out = test.update("options");
			updateConsole(out);
			input.setText("");
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

	public void updateMapView() 
	{
		// finds the room the player currently is and displays the corresponding map.
		if (test.currentRoomID.equals("1.a")) {
			imgView.setImage(img1a);
		} else if (test.currentRoomID.equals("1.b")) {
			imgView.setImage(img1b);
		} else if (test.currentRoomID.equals("1.c")) {
			imgView.setImage(img1c);
		} else if (test.currentRoomID.equals("1.d")) {
			imgView.setImage(img1d);
		} else if (test.currentRoomID.equals("1.e")) {
			imgView.setImage(img1e);
		} else if (test.currentRoomID.equals("1.f")) {
			imgView.setImage(img1f);
		} else if (test.currentRoomID.equals("1.g")) {
			imgView.setImage(img1g);
		} else if (test.currentRoomID.equals("2.a")) {
			imgView.setImage(img2a);
		} else if (test.currentRoomID.equals("2.b")) {
			imgView.setImage(img2b);
		} else if (test.currentRoomID.equals("2.c")) {
			imgView.setImage(img2c);
		} else if (test.currentRoomID.equals("2.d")) {
			imgView.setImage(img2d);
		} else if (test.currentRoomID.equals("2.e")) {
			imgView.setImage(img2e);
		} else if (test.currentRoomID.equals("2.f")) {
			imgView.setImage(img2f);
		} else if (test.currentRoomID.equals("2.g")) {
			imgView.setImage(img2g);
		} else if (test.currentRoomID.equals("2.h")) {
			imgView.setImage(img2h);
		} else if (test.currentRoomID.equals("2.i")) {
			imgView.setImage(img2i);
		} else if (test.currentRoomID.equals("2.j")) {
			imgView.setImage(img2j);
		} else if (test.currentRoomID.equals("3.a")) {
			imgView.setImage(img3a);
		} else if (test.currentRoomID.equals("3.b")) {
			imgView.setImage(img3b);
		} else if (test.currentRoomID.equals("3.c")) {
			imgView.setImage(img3c);
		} else if (test.currentRoomID.equals("3.d")) {
			imgView.setImage(img3d);
		} else if (test.currentRoomID.equals("3.e")) {
			imgView.setImage(img3e);
		} else if (test.currentRoomID.equals("4.a")) {
			imgView.setImage(img4a);
		} else if (test.currentRoomID.equals("4.b")) {
			imgView.setImage(img4b);
		} else if (test.currentRoomID.equals("4.c")) {
			imgView.setImage(img4c);
		} else if (test.currentRoomID.equals("4.d")) {
			imgView.setImage(img4d);
		} else if (test.currentRoomID.equals("4.e")) {
			imgView.setImage(img4e);
		} else if (test.currentRoomID.equals("4.f")) {
			imgView.setImage(img4f);
		} else if (test.currentRoomID.equals("4.g")) {
			imgView.setImage(img4g);
		} else if (test.currentRoomID.equals("4.h")) {
			imgView.setImage(img4h);
		} 
		
		
		
	}
	
	public void updateConsole(String out) 
	{
		if (out.contains("PLAYER: ")) {
			output.appendText("\r\n" + "\r\n" + out + "\r\n");
		} else {
			output.appendText("\r\n" + out);
		}
		
		//output.appendText("\r\n" + out);
	}
	
	
	
	
	
	

}
