package com.github.stai02.semestralka2.ui;

import java.util.Optional;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

/**
 * The Class HomeController5 for control Home5.fxml. Window insert car.
 */
public class HomeController5 {
	
	/** The brand. */
	@FXML
	private TextField brand;
	
	/** The carid. */
	private TextField carid;
	
	/** The license. */
	@FXML
	private TextField license;
	
	
	/** The model. */
	@FXML
	private TextField model;
	
	/** The edit. */
	@FXML
	private Button edit;
	
	/** The save. */
	@FXML
	private Button save;
	
	/** The delete. */
	@FXML
	private Button delete;
	
	
	/**
	 * Initialize.
	 */
	public void inicializuj() {
     edit.setDisable(true);
	}
	
	/**
	 * Delete the car
	 */
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
