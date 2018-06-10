package com.github.stai02.semestralka2.ui;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceBox;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
// TODO: Auto-generated Javadoc

/**
 * The Class HomeController2, for controle Home2.fxml. Main window.
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
	
	/** The choice. */
	@FXML public ChoiceBox<String> choice;
	
	/** The select. */
	@FXML public ChoiceBox<String> select;
	
	/** The choice box items. */
	ObservableList<String> choiceBoxItems = FXCollections.observableArrayList("car","driver","order","client");
	
	
	/**
	 * Initialize.
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
	          	case "driver" : {
	          		try {
						Connection conn = dbConnection();
						String query = "select driverid from drivers";
						PreparedStatement pst = conn.prepareStatement(query);
						ResultSet rs = pst.executeQuery();
						select.getItems().clear();
						while(rs.next()) {
							select.getItems().add(rs.getString("driverid"));
						}
						conn.close();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	          	}
	          }
	        }
	      });
	
    };
	
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
	 * Show orders.
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
	 * Show results.
	 */
	public void showResults() {
		try{
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/github/stai02/semestralka2/main/Home7.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Results");
			stage.setScene(new Scene(root1));  
			stage.show();
	} catch (Exception e){
		System.out.println("New window can´t be loaded.");
	}
}
	
	
	
	
	/**
	 * Koniec.
	 */
	public void koniec() {
		Alert al = new Alert(AlertType.CONFIRMATION, "Do you really want to close the application?");
		al.setHeaderText("Ending");
		Optional<ButtonType> result = al.showAndWait();
		if (result.get() == ButtonType.OK) {
			System.exit(0);
		}
		al.close();
	}
	


}
