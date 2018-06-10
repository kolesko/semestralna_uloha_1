package com.github.stai02.semestralka2.ui;

import java.util.Optional;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.control.DatePicker;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.Button;


// TODO: Auto-generated Javadoc
/**
 * The Class HomeController4.
 */
public class HomeController4 {
	
	/** The name. */
	@FXML
	private TextField name;
	
	/** The surname. */
	private TextField surname;
	
	/** The telephone. */
	@FXML
	private TextField telephone;
	
	/** The clientid. */
	@FXML
	private TextField clientid;
	
	/** The bedit. */
	@FXML
	private Button bedit;
	
	/** The bsave. */
	@FXML
	private Button bsave;
	
	/** The bdelete. */
	@FXML
	private Button bdelete;
	
	
	/**
	 * Initialize.
	 */
	public void initialize() {
       edit(); 
		bdelete.setDisable(true);
	}
	
	/**
	 * Edits the.
	 */
	public void edit() {
		bsave.setDisable(false);
		bedit.setDisable(true);
		bdelete.setDisable(false);
		telephone.setDisable(false);
		name.mouseTransparentProperty().set(false);
		surname.mouseTransparentProperty().set(false);
		clientid.mouseTransparentProperty().set(false);
		
	}
	
	/**
	 * Save.
	 */
	public void save() {
		bsave.setDisable(true);
		bedit.setDisable(false);
		bdelete.setDisable(true);
		name.mouseTransparentProperty().set(true);
		surname.mouseTransparentProperty().set(true);
		telephone.mouseTransparentProperty().set(true);
		clientid.mouseTransparentProperty().set(true);
		bedit.requestFocus();
	}
	
	
	/**
	 * Delete.
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