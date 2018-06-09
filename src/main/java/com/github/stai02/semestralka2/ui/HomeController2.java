package com.github.stai02.semestralka2.ui;
import java.awt.event.ActionEvent;
import java.util.Optional;

import java.util.List;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
public class HomeController2 extends GridPane{

	@FXML public Button border;
	@FXML public Button bdriver;
	@FXML public Button borders;
	@FXML public Button end;
	@FXML public Button show;
	@FXML public ChoiceBox choice;
	
	ObservableList<String> choiceBoxItems = FXCollections.observableArrayList("car","driver","order","client");
	
	
	public void initialize() {
		show.setDisable(false); 
		choice.setItems(choiceBoxItems);
		choice.setTooltip(new Tooltip("Select what you want to find"));
	
    };
	
	public void insertOrder() {
		try{
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/github/stai02/semestralka2/main/Home1.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Insert order");
			stage.setScene(new Scene(root1));  
			stage.show();
	} catch (Exception e){
		System.out.println("New window can´t be loaded.");
	}
}
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
