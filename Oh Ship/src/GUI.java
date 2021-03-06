import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application
{
//comment
	Stage window; 
	Scene lowestPart, lowerDeck, middleDeck, upperDeck, bridge;
	ChoiceBox<String> mapChoices1 = new ChoiceBox<>();
	ChoiceBox<String> mapChoices2 = new ChoiceBox<>();
	ChoiceBox<String> mapChoices3 = new ChoiceBox<>();
	ChoiceBox<String> mapChoices4 = new ChoiceBox<>();
	ChoiceBox<String> mapChoices5 = new ChoiceBox<>();
	
	public static void main(String[] args)
	{
		launch(args); 

	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		window = primaryStage; 
		
		//Children for Layout 1
		Button examine1 = new Button("Examine"); 
		Button options1 = new Button("Options"); 
		mapChoices1.getItems().addAll("Lowest Part", "Lower Deck", "Middle Deck", "Upper Deck", "Bridge"); 
		mapChoices1.setOnAction(e ->
		{
			if (mapChoices1.getValue().equals("Lowest Part"))
			{
				window.setScene(lowestPart);
			}
			if (mapChoices1.getValue().equals("Lower Deck"))
			{
				window.setScene(lowerDeck);
			}
			if (mapChoices1.getValue().equals("Middle Deck"))
			{
				window.setScene(middleDeck);
			}
			if (mapChoices1.getValue().equals("Upper Deck"))
			{
				window.setScene(upperDeck);
			}
			if (mapChoices1.getValue().equals("Bridge"))
			{
				window.setScene(bridge);
			}
			
		}
		); 
		
		//Layout 1- Lowest Part
		GridPane layout1 = new GridPane(); 
		layout1.setPadding(new Insets(10,10,10,10));
		layout1.setVgap(8);
		layout1.setHgap(10);
		mapChoices1.setValue("Lowest Part");
		GridPane.setConstraints(mapChoices1, 5, 5);
		GridPane.setConstraints(examine1, 4, 5);
		GridPane.setConstraints(options1, 6, 5);
		layout1.getChildren().addAll(mapChoices1, examine1, options1); 
		lowestPart = new Scene(layout1, 500,500); 
		
		//Children for layout 2
		Button examine2 = new Button("Examine"); 
		Button options2 = new Button("Options"); 
		mapChoices2.getItems().addAll("Lowest Part", "Lower Deck", "Middle Deck", "Upper Deck", "Bridge"); 
		mapChoices2.setOnAction(e ->
		{
			if (mapChoices2.getValue().equals("Lowest Part"))
			{
				window.setScene(lowestPart);
			}
			if (mapChoices2.getValue().equals("Lower Deck"))
			{
				window.setScene(lowerDeck);
			}
			if (mapChoices2.getValue().equals("Middle Deck"))
			{
				window.setScene(middleDeck);
			}
			if (mapChoices2.getValue().equals("Upper Deck"))
			{
				window.setScene(upperDeck);
			}
			if (mapChoices2.getValue().equals("Bridge"))
			{
				window.setScene(bridge);
			}
			
		}
		); 
		
		//Layout 2- Lower Deck
		GridPane layout2 = new GridPane(); 
		layout2.setPadding(new Insets(10,10,10,10));
		layout2.setVgap(8);
		layout2.setHgap(10);
		mapChoices2.setValue("Lower Deck");
		GridPane.setConstraints(mapChoices2, 5, 5);
		GridPane.setConstraints(examine2, 4, 5);
		GridPane.setConstraints(options2, 6, 5);
		layout2.getChildren().addAll(mapChoices2, examine2, options2); 
		lowerDeck = new Scene(layout2, 500,500); 
		 
		//Children for layout 3
		Button examine3 = new Button("Examine"); 
		Button options3 = new Button("Options"); 
		mapChoices3.getItems().addAll("Lowest Part", "Lower Deck", "Middle Deck", "Upper Deck", "Bridge"); 
		mapChoices3.setOnAction(e ->
		{
			if (mapChoices3.getValue().equals("Lowest Part"))
			{
				window.setScene(lowestPart);
			}
			if (mapChoices3.getValue().equals("Lower Deck"))
			{
				window.setScene(lowerDeck);
			}
			if (mapChoices3.getValue().equals("Middle Deck"))
			{
				window.setScene(middleDeck);
			}
			if (mapChoices3.getValue().equals("Upper Deck"))
			{
				window.setScene(upperDeck);
			}
			if (mapChoices3.getValue().equals("Bridge"))
			{
				window.setScene(bridge);
			}
			
		}
		); 
		
		//Layout 3- Middle Deck
		GridPane layout3 = new GridPane(); 
		layout3.setPadding(new Insets(10,10,10,10));
		layout3.setVgap(8);
		layout3.setHgap(10);
		mapChoices3.setValue("Middle Deck");
		GridPane.setConstraints(mapChoices3, 5, 5);
		GridPane.setConstraints(examine3, 4, 5);
		GridPane.setConstraints(options3, 6, 5);		
		layout3.getChildren().addAll(mapChoices3, examine3, options3); 
		middleDeck = new Scene(layout3, 500,500); 
		
		//Children for layout 4
		Button examine4 = new Button("Examine"); 
		Button options4 = new Button("Options"); 
		mapChoices4.getItems().addAll("Lowest Part", "Lower Deck", "Middle Deck", "Upper Deck", "Bridge"); 
		mapChoices4.setOnAction(e ->
		{
			if (mapChoices4.getValue().equals("Lowest Part"))
			{
				window.setScene(lowestPart);
			}
			if (mapChoices4.getValue().equals("Lower Deck"))
			{
				window.setScene(lowerDeck);
			}
			if (mapChoices4.getValue().equals("Middle Deck"))
			{
				window.setScene(middleDeck);
			}
			if (mapChoices4.getValue().equals("Upper Deck"))
			{
				window.setScene(upperDeck);
			}
			if (mapChoices4.getValue().equals("Bridge"))
			{
				window.setScene(bridge);
			}
			
		}
		); 
		
		//Layout 4- Upper Deck
		GridPane layout4 = new GridPane(); 
		layout4.setPadding(new Insets(10,10,10,10));
		layout4.setVgap(8);
		layout4.setHgap(10);
		mapChoices4.setValue("Upper Deck");
		GridPane.setConstraints(mapChoices4, 5, 5);
		GridPane.setConstraints(examine4, 4, 5);
		GridPane.setConstraints(options4, 6, 5);
		layout4.getChildren().addAll(mapChoices4, examine4, options4); 
		upperDeck = new Scene(layout4, 500,500); 
		
		//Children for layout 5
		Button examine5 = new Button("Examine"); 
		Button options5 = new Button("Options"); 
		mapChoices5.getItems().addAll("Lowest Part", "Lower Deck", "Middle Deck", "Upper Deck", "Bridge"); 
		mapChoices5.setOnAction(e ->
		{
			if (mapChoices5.getValue().equals("Lowest Part"))
			{
				window.setScene(lowestPart);
			}
			if (mapChoices5.getValue().equals("Lower Deck"))
			{
				window.setScene(lowerDeck);
			}
			if (mapChoices5.getValue().equals("Middle Deck"))
			{
				window.setScene(middleDeck);
			}
			if (mapChoices5.getValue().equals("Upper Deck"))
			{
				window.setScene(upperDeck);
			}
			if (mapChoices5.getValue().equals("Bridge"))
			{
				window.setScene(bridge);
			}
			
		}
		); 
		
		//Layout 5- Bridge
		GridPane layout5 = new GridPane(); 
		layout5.setPadding(new Insets(10,10,10,10));
		layout5.setVgap(8);
		layout5.setHgap(10);
		mapChoices5.setValue("Bridge");
		GridPane.setConstraints(mapChoices5, 5, 5);
		GridPane.setConstraints(examine5, 4, 5);
		GridPane.setConstraints(options5, 6, 5);
		layout5.getChildren().addAll(mapChoices5, examine5, options5); 
		bridge = new Scene(layout5, 500,500); 
		
		window.setScene(lowestPart);
		window.setTitle("Oh Ship"); 
		window.show(); 
	}
	
	
	

}
