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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuButton;


/**
 * The Class HomeController1. Control Home1, scene for insert order.
 *
 * @author Ivana Stanová
 */
public class HomeController1 extends GridPane {
		
	/** The brand. */
	@FXML
	private TextField brand;
	
	/** The clientid. */
	@FXML
	private TextField clientid;
	
	/** The name. */
	@FXML
	private TextField name;
	
	/** The surname. */
	@FXML
	private TextField surname;
	
	/** The telephone. */
	@FXML
	private TextField telephone;
	
	/** The carid. */
	@FXML
	private TextField carid;
	
	/** The license. */
	@FXML
	private TextField license;
	
	/** The model. */
	@FXML
	private TextField model;
	
	/** The hour from. */
	@FXML
	private ComboBox hourFrom;
	
	/** The placeto. */
	@FXML
	private TextField placeto;
	
	/** The daytime 1. */
	@FXML
	private ComboBox daytime1;
	
	/** The daytime 2. */
	@FXML
	private ComboBox daytime2;
	
	/** The minute from. */
	@FXML
	private ComboBox minuteFrom;
	
	/** The hour to. */
	@FXML
	private ComboBox hourTo;
	
	/** The minute to. */
	@FXML
	private ComboBox minuteTo;
	
	/** The placefrom. */
	@FXML
	private TextField placefrom;

	/** The edit. */
	@FXML public Button edit;
	
	/** The bdelete. */
	@FXML public Button bdelete;
	
	/** The save. */
	@FXML public Button save;
	
	/** The date. */
	@FXML private DatePicker date;
	
	/** The driving. */
	@FXML private CheckBox driving;
	
	/** The driver box. */
	@FXML private MenuButton driverBox;
	
	
	/**
	 * Initialize.
	 */
	public void initialize() {
		editOrder(); 
		bdelete.setDisable(true);
		
		hourFrom.getItems().removeAll(hourFrom.getItems());
		hourFrom.getItems().addAll("01","02","03","04","05","06","07","08","09","10","11","12");
		hourFrom.getSelectionModel().select("01");
	//	hourFrom.setPromptText(hourFrom.getSelectionModel().getSelectedItem().toString());
		
		minuteFrom.getItems().removeAll(hourFrom.getItems());
		minuteFrom.getItems().addAll("00","15","30","45");
		minuteFrom.getSelectionModel().select("00");
		
		hourTo.getItems().removeAll(hourFrom.getItems());
		hourTo.getItems().addAll("01","02","03","04","05","06","07","08","09","10","11","12");
		hourTo.getSelectionModel().select("01");
		
		minuteTo.getItems().removeAll(hourFrom.getItems());
		minuteTo.getItems().addAll("00","15","30","45");
		minuteTo.getSelectionModel().select("00");
		
		daytime1.getItems().addAll("AM","PM");
		daytime2.getItems().addAll("AM","PM");
	}

	/**
	 * Insert order.
	 */
	public void insertOrder() {
		name.getText();
	}
	
	/**
	 * Edits the order.
	 */
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
		license.mouseTransparentProperty().set(false);
		driving.setDisable(false);
		date.setDisable(false);
		driverBox.setDisable(false);
		
	}
	
	/**
	 * Save order.
	 */
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
		license.mouseTransparentProperty().set(true);
		date.setDisable(true);
		edit.requestFocus();
		driving.setDisable(true);
		driverBox.setDisable(true);
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
	
    
	/*public void addCar() {
		Car auto = new Car(carid.getText(),license.getText(),brand.getText(),model.getText());
	}
	
	public void addClient() {
		
	}
	
	public void addOrder() {
		
	}*/
}
