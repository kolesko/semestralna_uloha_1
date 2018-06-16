package com.github.stai02.semestralka2.ui;
import java.util.Optional;

import javax.swing.JOptionPane;

import java.awt.Color;
import java.sql.*;
import com.github.stai02.semestralka2.ui.Validation;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.DatePicker;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tooltip;

/**
 * The Class HomeController3 for control Home3.fxml. Window insert driver.
 *
 * @author Ivana Stanová
 */
public class HomeController3 extends GridPane {
		
	
	/** The name. */
	@FXML
	private TextField name;
	
	/** The surname. */
	@FXML
	private TextField surname;
	
	/** The telephone. */
	@FXML
	private TextField telephone;
	
	/** The license. */
	@FXML
	private TextField license;
	
	/** The driverid. */
	@FXML
	private TextField driverid;

	/** The bedit. */
	@FXML public Button bedit;
	
	/** The bsave. */
	@FXML public Button bsave;
	
	/** The bdelete. */
	@FXML public Button bdelete;
	
	/** The region. */
	@FXML private ComboBox<String> region;
	
	/** The valid. */
	@FXML public Button valid;
	/** The time from available every day. */
	@FXML
	private TextField timeFrom;
	/** The time to available every day. */
	@FXML
	private TextField timeTo;
	
	
	
	/**
	 * Initialize.
	 */
	public void initialize() {
		edit(); 
		bdelete.setDisable(true);
		region.getItems().add("Jihomoravský kraj");
		region.getItems().add("Jihočeský kraj");
		region.getItems().add("Karlovarský kraj");
		region.getItems().add("Královéhradecký kraj");
		region.getItems().add("Liberecký kraj");
		region.getItems().add("Moravskoslezský kraj");
		region.getItems().add("Olomoucký kraj");
		region.getItems().add("Pardubický kraj");
		region.getItems().add("Plzeňský kraj");
		region.getItems().add("Praha");
		region.getItems().add("Středočeský kraj");
		region.getItems().add("Vysočina");
		region.getItems().add("Zlín");
				
		Tooltip tooltip = new Tooltip();

		tooltip.setText("Insert phone number as +42xxxxxxx");
		telephone.setTooltip(tooltip);
		Tooltip tooltip2 = new Tooltip();
		tooltip2.setText("Insert type of driver''s license as A/B/C/..");
		license.setTooltip(tooltip2);
		Tooltip tooltip3 = new Tooltip();
		tooltip3.setText("Insert from when the driver is available every day as hh:mm");
		timeFrom.setTooltip(tooltip3);
		Tooltip tooltip4 = new Tooltip();
		tooltip4.setText("Insert until when the driver is available every day as hh:mm");
		timeTo.setTooltip(tooltip4);
		
		
	}

   /**
    * Db connection.
    *
    * @return the connection
    * @throws ClassNotFoundException the class not found exception
    */
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
	
	/**
	 * Edit driver.
	 */
	public void edit() {
		bsave.setDisable(false);
		bedit.setDisable(true);
		bdelete.setDisable(false);
		region.setDisable(false);
		name.mouseTransparentProperty().set(false);
		surname.mouseTransparentProperty().set(false);
		driverid.mouseTransparentProperty().set(false);
		
	}
	
	/**
	 * Save driver.
	 *
	 * @throws ClassNotFoundException the class not found exception
	 */
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
	
	/**
	 * Delete driver.
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
		
	/**
	 * Insert driver.
	 *
	 * @throws ClassNotFoundException the class not found exception
	 */
	public void insertData() throws ClassNotFoundException {
		Connection conn = dbConnection();
		try {
			String query = "INSERT INTO drivers (name, surname, telephone, license, region, driverid) VALUES (?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1, name.getText());
			pst.setString(2, surname.getText());
			pst.setString(3, telephone.getText());
			pst.setString(4, license.getText());
			pst.setString(5, region.getValue());
			pst.setString(6, driverid.getText());
			pst.execute();
			conn.close();
		} catch (Exception e) {
			System.out.println("inserting data error " + e);
		}
	}
	
	public void vaidate() {
		
		String skutok = telephone.getText();
		String namee= "telephonee";
		boolean status=Validation.validate(namee, skutok);
		
		if(status=true) {
			telephone.setStyle("-fx-text-fill: black; -fx-font-size: 12px;");
		} else {
			telephone.setStyle("-fx-text-fill: red; -fx-font-size: 12px;");
		}}
		
		
	
}
