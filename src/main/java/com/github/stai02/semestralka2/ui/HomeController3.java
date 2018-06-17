package com.github.stai02.semestralka2.ui;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tooltip;

/**
 * The Class HomeController3 for control Home3.fxml. Window insert driver.
 *
 * @author Ivana Stanová, Lenka Šťastná, Julia Loseeva, Matej Kolesár
 * @version June 2018
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
	
	/** The text field where fields with incorrectly inserted/selected values are displayed. */
	@FXML
	private TextField validateError;
	
	/** The variable used to store String values temporarily. */
	private String pomocna;
	
	/** The variable used to store String values temporarily. */
	private String vysl;
	
	
	
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
		bsave.setDisable(true);
				
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
		bsave.setDisable(true);
		bedit.setDisable(true);
		bdelete.setDisable(false);
		region.setDisable(false);
		name.setEditable(true);
		surname.setEditable(true);
		telephone.setEditable(true);
		license.setEditable(true);
		region.setDisable(false);
		driverid.setEditable(true);
		timeTo.setEditable(true);
		timeFrom.setEditable(true);
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
			String query = "SELECT * FROM drivers WHERE driverid= ?";
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setString(1, driverid.getText());
			ResultSet result = statement.executeQuery();
			String input ="";
			if (!result.next()) {
				input = "INSERT INTO drivers (name, surname, telephone, license, region, time_to, time_from, driverid) VALUES (?,?,?,?,?,?,?,?)";
			} else {
				input = "UPDATE drivers SET name=?, surname=?, telephone=?, license=?, region=?, time_to=?, time_from=? where driverid=?";
			}
			PreparedStatement pst = conn.prepareStatement(input);
			pst.setString(1, name.getText());
			pst.setString(2, surname.getText());
			pst.setString(3, telephone.getText());
			pst.setString(4, license.getText());
			pst.setString(5, region.getValue());
			pst.setString(6, timeTo.getText());
			pst.setString(7, timeFrom.getText());
			pst.setString(8, driverid.getText());
			pst.execute();
			conn.close();
		} catch (Exception e) {
			System.out.println("inserting data error " + e);
		}
	}
	
	/**
	 * Display driver.
	 *
	 * @throws ClassNotFoundException the class not found exception
	 */
	public void displayDriver(String driver) throws ClassNotFoundException {
		Connection conn = dbConnection();
		try {
			String query = "SELECT name, surname, telephone, license, region, driverid, time_from, time_to FROM drivers where driverid=?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1, driver);
			ResultSet rs = pst.executeQuery();
			name.setText(rs.getString("name"));
			surname.setText(rs.getString("surname"));
			telephone.setText(rs.getString("telephone"));
			license.setText(rs.getString("license"));
			region.setPromptText(rs.getString("region"));
			region.setValue(rs.getString("region"));
			driverid.setText(rs.getString("driverid"));
			timeTo.setText(rs.getString("time_to"));
			timeFrom.setText(rs.getString("time_from"));
			pst.execute();
			conn.close();
		} catch (Exception e) {
			System.out.println("inserting data error " + e);
		}
		bedit.setDisable(false);
		name.setEditable(false);
		surname.setEditable(false);
		telephone.setEditable(false);
		license.setEditable(false);
		region.setDisable(true);
		driverid.setEditable(false);
		timeTo.setEditable(false);
		timeFrom.setEditable(false);
	}
	
	
	/**
     * Validate method - the validation of choosen fields
     *
     * @return the names wrong filled fields are written into a field.
     */
	
	public void vaidate() {
		bsave.setDisable(false);
		vysl = "";
		List<String> list = new ArrayList<String>();
		list.add("name");
		list.add("surname");
		list.add("telephone");
		list.add("timeFrom");
		list.add("timeTo");
		
		for (int i = 0; i < list.size(); i++) {
			
			String pom = list.get(i);
			switch(pom){
				case "name":{
					 pomocna = name.getText();
					 break;
					 
				}
				case "surname":{
					 pomocna = surname.getText();
					 break;
				}
				case "telephone":{
					 pomocna = telephone.getText();
					 break;
				}
				case "timeFrom":{
					 pomocna = timeFrom.getText();
					 break;
				}
				case "timeTo":{
					 pomocna = timeTo.getText();
					 break;
				}
				
			}
			
			
			boolean status=Validation.validate(pom, pomocna);
			if(!status){
				vysl = vysl + " " + pom;
				
			}
		}
		validateError.setText(vysl);
		
	}
	
		
	
}
