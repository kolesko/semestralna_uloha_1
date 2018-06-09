package com.github.stai02.semestralka2.ui;

import com.github.stai02.semestralka2.logic.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;

public class HomeController3 {
	
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
	}
	
	public void driverSetName (String name) {
	}

	public void driverSetSurname(String text) {
		// TODO Auto-generated method stub
		
	}

}
