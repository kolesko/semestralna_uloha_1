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


public class HomeController4 {
	
	@FXML
	private TextField name;
	private TextField surname;
	@FXML
	private TextField telephone;
	@FXML
	private TextField clientid;
	
	@FXML
	private Button bedit;
	@FXML
	private Button bsave;
	@FXML
	private Button bdelete;
	
	
	public void initialize() {
       edit(); 
		bdelete.setDisable(true);
	}
	
	public void edit() {
		bsave.setDisable(false);
		bedit.setDisable(true);
		bdelete.setDisable(false);
		telephone.setDisable(false);
		name.mouseTransparentProperty().set(false);
		surname.mouseTransparentProperty().set(false);
		clientid.mouseTransparentProperty().set(false);
		
	}
	
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