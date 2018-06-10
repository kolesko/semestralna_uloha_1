package com.github.stai02.semestralka2.ui;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;

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
import javafx.scene.control.MenuButton;

/**
 * The Class HomeController1. Control Home1, scene for insert order.
 *
 * @author Lenka Šťastná, Julia Loseeva, Matej Kolesár, Ivana Stanová
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
	private ComboBox<String> hourFrom;
	
	/** The placeto. */
	@FXML
	private TextField placeto;
	
	/** The daytime 1. */
	@FXML
	private ComboBox<String> daytime1;
	
	/** The daytime 2. */
	@FXML
	private ComboBox<String> daytime2;
	
	/** The minute from. */
	@FXML
	private ComboBox<String> minuteFrom;
	
	/** The hour to. */
	@FXML
	private ComboBox<String> hourTo;
	
	/** The minute to. */
	@FXML
	private ComboBox<String> minuteTo;
	
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
	@FXML private ComboBox<String> driverBox;
	
	
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
		daytime1.getSelectionModel().select("AM");
		daytime2.getSelectionModel().select("AM");
		try {
			Connection conn = dbConnection();
			String query = "select driverid from drivers";
			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			driverBox.getItems().clear();
			while(rs.next()) {
				driverBox.getItems().add(rs.getString("driverid"));
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	/**
	 * Insert order.
	 */
	public void insertOrder() {
		
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
		addClient();
		addCar();
		addOrder();
		Stage stage = (Stage) name.getScene().getWindow();
	    stage.close();
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
	
    
	public void addCar() {
		try {
			Connection conn = dbConnection();
			String query = "INSERT INTO cars (brand,model,license,spz,clientid) VALUES (?,?,?,?,?)";
			try {
				PreparedStatement pst = conn.prepareStatement(query);
				pst.setString(1,brand.getText());
				pst.setString(2,model.getText());
				pst.setString(3,license.getText());
				pst.setString(4,carid.getText());
				String query2 = "SELECT id FROM clients WHERE clientid = ?";
				PreparedStatement pst2 = conn.prepareStatement(query2);
				pst2.setString(1,clientid.getText());
				ResultSet rs = pst2.executeQuery();
				int id = 0;
				while (rs.next()) {
					id = rs.getInt("id");
				}
				pst.setInt(5,id);
				pst.execute();
				pst2.close();
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void addClient() {
		try {
			Connection conn = dbConnection();
			String query = "INSERT INTO clients (name,surname,telephone,clientid) VALUES (?,?,?,?)";
			try {
				PreparedStatement pst = conn.prepareStatement(query);
				pst.setString(1,name.getText());
				pst.setString(2,surname.getText());
				pst.setString(3,telephone.getText());
				pst.setString(4,clientid.getText());
				pst.execute();
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void addOrder() {
		try {
			Connection conn = dbConnection();
			String query = "INSERT INTO orders (date,time_from,time_to,client_in_car,from_place,to_place,clientid,carid,driverid) VALUES (?,?,?,?,?,?,?,?,?)";
			try {
				PreparedStatement pst = conn.prepareStatement(query);
				LocalDate localdate = date.getValue();
				Instant instant = Instant.from(localdate.atStartOfDay(ZoneId.systemDefault()));
				Date finalDate = Date.from(instant);
				java.sql.Date sqlDate = new java.sql.Date(finalDate.getTime());
				pst.setDate(1,sqlDate);
				int hourf = Integer.parseInt(hourFrom.getValue());
				if (daytime1.getValue() == "PM") {
					hourf += 12;
				}
				int hourt = Integer.parseInt(hourTo.getValue());
				if (daytime2.getValue() == "PM") {
					hourt += 12;
				}
				String timef = hourf + ":" + minuteFrom.getValue();
				String timet = hourt + ":" + minuteTo.getValue();
 				pst.setString(2,timef);
				pst.setString(3,timet);
				pst.setBoolean(4, driving.isSelected());
				pst.setString(5,placefrom.getText());
				pst.setString(6,placeto.getText());
				
				
				String query2 = "SELECT id FROM clients WHERE clientid = ?";
				PreparedStatement pst2 = conn.prepareStatement(query2);
				pst2.setString(1,clientid.getText());
				ResultSet rs = pst2.executeQuery();
				int id = 0;
				while (rs.next()) {
					id = rs.getInt("id");
				}
				pst2.close();
				pst.setInt(7,id);
				
				query2 = "SELECT id FROM cars WHERE spz = ?";
				pst2 = conn.prepareStatement(query2);
				pst2.setString(1,carid.getText());
				rs = pst2.executeQuery();
				int carid = 0;
				while (rs.next()) {
					carid = rs.getInt("id");
				}
				pst2.close();
				pst.setInt(8,carid);
				
				query2 = "SELECT id FROM drivers WHERE driverid = ?";
				pst2 = conn.prepareStatement(query2);
				pst2.setString(1,driverBox.getValue());
				rs = pst2.executeQuery();
				int driverid = 0;
				while (rs.next()) {
					driverid = rs.getInt("id");
				}
				pst2.close();
				pst.setInt(9,driverid);
				
				pst.execute();
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
