package com.github.stai02.semestralka2.ui;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Tooltip;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
// TODO: Auto-generated Javadoc

/**
 * The Class HomeController2, for controle Home2.fxml. Main window.
 * 
 * @author Lenka Šťastná, Julia Loseeva, Matej Kolesár, Ivana Stanová
 */
public class HomeController2 extends GridPane{

	/** The border. */
	@FXML public Button border;
	
	/** The bdriver. */
	@FXML public Button bdriver;
	
	/** The borders. */
	@FXML public Button borders;
	
	/** The end. */
	@FXML public Button end;
	
	/** The show. */
	@FXML public Button show;
	
	/** The advanced search. */
	@FXML public Button advancedSearch;
	
	/** The choice. */
	@FXML public ComboBox<String> choice;
	
	/** The select. */
	@FXML public ComboBox<String> select;
	
	/** The select text. */
	@FXML public TextField selectText;
	
	/** The pane. */
	@FXML Pane pane;
	
	/** The choice box items. */
	ObservableList<String> choiceBoxItems = FXCollections.observableArrayList("cars","drivers","orders","clients");
	
	
	/**
	 * Initialize and change.
	 * 
	 */
	public void initialize() {		
		show.setDisable(false); 
		choice.setItems(choiceBoxItems);
		choice.setTooltip(new Tooltip("Select what you want to find"));
		choice.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
	        @Override
	        public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
	          String value = choice.getItems().get((Integer) number2).toString();
	          switch(value) {
	          	case "drivers" : {
	          		select.getItems().clear();
	          		select.getItems().add("driverid");
	          		select.getItems().add("name");
	          		select.getItems().add("surname");
	          		select.getItems().add("telephone");
	          		select.getItems().add("license");
	          		select.getItems().add("region");
	          		break;
	          	}
	          	case "clients" : {
	          		select.getItems().clear();
	          		select.getItems().add("clientid");
	          		select.getItems().add("name");
	          		select.getItems().add("surname");
	          		select.getItems().add("telephone");
	          		break;
	          	}
	          	case "cars" : {
	          		select.getItems().clear();
	          		select.getItems().add("brand");
	          		select.getItems().add("model");
	          		select.getItems().add("license");
	          		select.getItems().add("carid");
	          		break;
	          	}
	          	case "orders" : {
	          		select.getItems().clear();
	          		select.getItems().add("date");
	          		break;
	          	}
	          }
	        }
	      });
	
    };
    
    /**
     * Showing the hidden pane after clicking on Search button.
     * 
     */
    public void search() {
    	if (pane.isVisible()) {
    		pane.setVisible(false);
    	} else {
    		pane.setVisible(true);
    	}
    	select.setValue(select.getPromptText());
    	choice.setValue(choice.getPromptText());
    	selectText.setText(null);
    }
	
    /**
     * Db connection.
     *
     * @return the connection
     * @throws ClassNotFoundException the class not found exception
     */
    public Connection dbConnection() throws ClassNotFoundException {
 	   Class.forName("org.sqlite.JDBC");
        Connection connection = null;
        try
        {
          // create a database connection
          connection = DriverManager.getConnection("jdbc:sqlite:./resources/main/java/com/github/stai02/semestralka2/main/db.db");
          System.out.println("connected");
        }
        catch(SQLException e)
        {
          // if the error message is "out of memory",
          // it probably means no database file is found
          System.err.println(e.getMessage());
        }
        return connection;
    }
    
    
	/**
	 * Insert order.
	 * 
	 * Connecting to Home1.
	 */
	public void insertOrder() {
		try{
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/github/stai02/semestralka2/main/Home1.fxml"));
			Parent root = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Insert Order");
			stage.setScene(new Scene(root));  
			stage.show();
			} catch (Exception e){
				System.out.println("New window can´t be loaded.");
			}
	}
	
	/**
	 * Insert driver.
	 * 
	 * Connecting to Home3.
	 */
	public void insertDriver() {
		try{
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/github/stai02/semestralka2/main/Home3.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Insert driver");
			stage.setScene(new Scene(root1));  
			stage.show();
		} catch (Exception e){
			System.out.println("New window can´t be loaded.");
		}
	}
	
	/**
	 * Show all orders.
	 * 
	 * Connecting to Home6.
	 */
	public void showOrders() {
		try{
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/github/stai02/semestralka2/main/Home6.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Orders");
			stage.setScene(new Scene(root1));  
			stage.show();
		} catch (Exception e){
			System.out.println("New window can´t be loaded.");
		}
	}
	
	/**
	 * Show search results.
	 * 
	 * Connecting to Home7
	 */
	public void showResults() {
		try{
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/github/stai02/semestralka2/main/Home7.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			HomeController7 c = (HomeController7) fxmlLoader.getController();
			if (!((choice.getValue().contains("Select Criterion")) || ((selectText.getText().isEmpty())))) {
			c.result(choice.getValue(), select.getValue(), selectText.getText());
			Stage stage = new Stage();
			stage.setTitle("Results");
			stage.setScene(new Scene(root1));  
			stage.show();
			}
		} catch (Exception e){
			System.out.println("New window can´t be loaded.");
		}
	}
	
	/**
	 * Exiting the application
	 * 
	 */
	public void koniec() {
		Alert al = new Alert(AlertType.CONFIRMATION, "Do you really want to close the application?");
		al.setHeaderText("Exit");
		Optional<ButtonType> result = al.showAndWait();
		if (result.get() == ButtonType.OK) {
			System.exit(0);
		}
		al.close();
	}	            
}
	



