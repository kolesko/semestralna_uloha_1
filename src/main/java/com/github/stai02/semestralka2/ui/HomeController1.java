package com.github.stai02.semestralka2.ui;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


/**
 * @author Ivana Stanová
 *
 */
public class HomeController1 extends GridPane {
		
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
	private TextField brand;
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
	@FXML
	private TextField brand;
	@FXML
	private Button edit;
	@FXML
	private Button save;
	
	public void initialize() {
		save.setEditable(true); 
	}

	public String vypis() {
		String idcko = carid.getText();
		System.out.println(idcko);
	}
	
	/*public void addCar() {
		Auto auto = new Auto(carid.getText(),license.getText(),brand.getText(),model.getText());
	}
	
	public void addClient() {
		
	}
	
	public void addOrder() {
		
	}*/
}