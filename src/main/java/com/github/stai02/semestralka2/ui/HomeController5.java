package com.github.stai02.semestralka2.ui;

import java.util.Optional;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class HomeController5 {
	
	@FXML
	private TextField brand;
	private TextField carid;
	@FXML
	private TextField license;
	@FXML
	private TextField model;
	
	@FXML
	private Button edit;
	@FXML
	private Button save;
	@FXML
	private Button delete;
	
	
	public void inicializuj() {
     edit.setDisable(true);
	}
	
	public void delete() { 
		Alert al = new Alert(AlertType.CONFIRMATION, "Do you really want to delete data?");
		al.setHeaderText("Ending");
		Optional<ButtonType> result = al.showAndWait();
		if (result.get() == ButtonType.OK) {
			System.exit(0);
		}
		al.close();
	}

}