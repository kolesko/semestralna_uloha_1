package com.github.stai02.semestralka2.ui;
import java.util.Optional;
import java.sql.*;
import com.github.stai02.semestralka2.logic.*;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
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
	

	public void initialize() {
		edit(); 
		bdelete.setDisable(true);
		
	}

   public Connection dbConnection() throws ClassNotFoundException {
	   Class.forName("org.sqlite.JDBC");
       Connection connection = null;
       try
       {
         // create a database connection
         connection = DriverManager.getConnection("jdbc:sqlite:./resources/main/java/com/github/stai02/semestralka2/main/db.db");
         System.out.println("connected");
       }
       catch(SQLException e)
       {
         // if the error message is "out of memory",
         // it probably means no database file is found
         System.err.println(e.getMessage());
       }
       return connection;
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
	
	public void save() throws ClassNotFoundException {
		bsave.setDisable(true);
		bedit.setDisable(false);
		bdelete.setDisable(true);
		name.mouseTransparentProperty().set(true);
		surname.mouseTransparentProperty().set(true);
		telephone.mouseTransparentProperty().set(true);
		license.mouseTransparentProperty().set(true);
		region.setDisable(true);
		driverid.mouseTransparentProperty().set(true);
		bedit.requestFocus();
		insertData();
		Stage stage = (Stage) name.getScene().getWindow();
	    stage.close();
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
		
	public void insertData() throws ClassNotFoundException {
		Connection conn = dbConnection();
		try {
			String query = "INSERT INTO drivers (name, surname, telephone, license, region, driverid) VALUES (?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1, name.getText());
			pst.setString(2, surname.getText());
			pst.setString(3, telephone.getText());
			pst.setString(4, license.getText());
			pst.setString(5, region.getText());
			pst.setString(6, driverid.getText());
			pst.execute();
			conn.close();
		} catch (Exception e) {
			System.out.println("inserting data error " + e);
		}
	}

}