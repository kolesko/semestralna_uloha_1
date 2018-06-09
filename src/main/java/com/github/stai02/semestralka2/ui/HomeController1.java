package com.github.stai02.semestralka2.ui;
import java.util.Optional;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.control.DatePicker;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuButton;

/**
 * @author Ivana Stanová
 *
 */
public class HomeController1 extends GridPane {
		
	@FXML
	private TextField brand;
	@FXML
	private TextField clientid;
	@FXML
	private TextField name;
	@FXML
	private TextField surname;
	@FXML
	private TextField telephone;
	@FXML
	private TextField carid;
	@FXML
	private TextField license;
	@FXML
	private TextField model;
	@FXML
	private TextField timeto;
	@FXML
	private TextField placeto;
	@FXML
	private TextField timefrom;
	@FXML
	private TextField placefrom;

	@FXML public Button edit;
	@FXML public Button bdelete;
	@FXML public Button save;
	@FXML private DatePicker date;
	@FXML private CheckBox driving;
	@FXML private MenuButton driverBox;
	
	
	public void initialize() {
		editOrder(); 
		bdelete.setDisable(true);
	}

	public void insertOrder() {
		name.getText();
	}
	
	public void editOrder() {
		save.setDisable(false);
		edit.setDisable(true);
		bdelete.setDisable(false);
		name.mouseTransparentProperty().set(false);;
		surname.mouseTransparentProperty().set(false);
		model.mouseTransparentProperty().set(false);
		brand.mouseTransparentProperty().set(false);
		telephone.mouseTransparentProperty().set(false);
		carid.mouseTransparentProperty().set(false);
		clientid.mouseTransparentProperty().set(false);
		placefrom.mouseTransparentProperty().set(false);
		placeto.mouseTransparentProperty().set(false);
		/*timefrom.mouseTransparentProperty().set(false);
		timeto.mouseTransparentProperty().set(false);*/
		license.mouseTransparentProperty().set(false);
		driving.setDisable(false);
		date.setDisable(false);
		driverBox.setDisable(false);
		
	}
	
	public void saveOrder() {
		save.setDisable(true);
		edit.setDisable(false);
		bdelete.setDisable(true);
		name.mouseTransparentProperty().set(true);
		surname.mouseTransparentProperty().set(true);
		model.mouseTransparentProperty().set(true);
		brand.mouseTransparentProperty().set(true);
		telephone.mouseTransparentProperty().set(true);
		carid.mouseTransparentProperty().set(true);
		clientid.mouseTransparentProperty().set(true);
		placefrom.mouseTransparentProperty().set(true);
		placeto.mouseTransparentProperty().set(true);
		timefrom.mouseTransparentProperty().set(true);
		timeto.mouseTransparentProperty().set(true);
		license.mouseTransparentProperty().set(true);
		date.setDisable(true);
		edit.requestFocus();
		driving.setDisable(true);
		driverBox.setDisable(true);
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
	
    
	/*public void addCar() {
		Auto auto = new Auto(carid.getText(),license.getText(),brand.getText(),model.getText());
	}
	
	public void addClient() {
		
	}
	
	public void addOrder() {
		
	}*/
}