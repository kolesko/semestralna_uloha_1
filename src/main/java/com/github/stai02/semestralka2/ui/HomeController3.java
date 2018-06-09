package com.github.stai02.semestralka2.ui;
import java.util.Optional;
import com.github.stai02.semestralka2.logic.*;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.control.DatePicker;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;

/**
 * @author Ivana Stanová
 *
 */

public class HomeController3 extends GridPane {
	
	@FXML public TextField driverName;
	@FXML public TextField driverSurname;
	@FXML public TextField driverTelephone;
	@FXML public TextField driverLicense;
	@FXML public TextField driverID;
	@FXML public Button driverSave;
	@FXML public Button driverDelete;
	@FXML public Button driverEdit;
	@FXML public MenuButton driverRegion;
	
	@FXML public void driverSetName() {
		driverSetName(driverName.getText());
	}
	
	@FXML public void driverSetSurname() {
		driverSetSurname(driverSurname.getText());
	}


	public void inicializuj() {
	driverName.setDisable(false);
	driverSurname.setEditable(true);
	driverTelephone.setEditable(true);
	driverLicense.setEditable(true);
  edit();  
	}
	
	public void driverSetName (String name) {
	}

	public void driverSetSurname(String text) {
		// TODO Auto-generated method stub
  }

	public void edit() {
		driverSave.setDisable(false);
		driverEdit.setDisable(true);
		driverDelete.setDisable(false);
		driverRegion.setDisable(false);
		driverName.mouseTransparentProperty().set(false);
		driverSurname.mouseTransparentProperty().set(false);
		driverID.mouseTransparentProperty().set(false);
		
	}
	
	public void save() {
		driverSave.setDisable(true);
		driverEdit.setDisable(false);
		driverDelete.setDisable(true);
		driverName.mouseTransparentProperty().set(true);
		driverSurname.mouseTransparentProperty().set(true);
		driverTelephone.mouseTransparentProperty().set(true);
		driverLicense.mouseTransparentProperty().set(true);
		driverRegion.setDisable(true);
		driverID.mouseTransparentProperty().set(true);
		driverEdit.requestFocus();
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