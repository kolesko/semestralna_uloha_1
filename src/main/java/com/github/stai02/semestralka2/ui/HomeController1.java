package com.github.stai02.semestralka2.ui;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javafx.scene.control.Tooltip;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
	
	/** The destination. */
	@FXML
	private ComboBox<String> placeto;
	
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
	
	/** The starting location. */
	@FXML
	private ComboBox<String> placefrom;

	/** The edit. */
	@FXML public Button edit;
	
	/** The bdelete. */
	@FXML public Button bdelete;
	
	/** The save. */
	@FXML public Button save;
	
	/** The validate. */
	@FXML public Button valid;
	
	/** The date. */
	@FXML private DatePicker date;
	
	/** The driving. */
	@FXML private CheckBox driving;
	
	/** The driver box. */
	@FXML private ComboBox<String> driverBox;
	
	/** The validation field. */
	@FXML
	private TextField validateError;
	
	/** The validation field. */
	@FXML private ComboBox<String> clientType;
	
	/** The car type. */
	@FXML private ComboBox<String> carType;
	
	/** The existing clients. */
	@FXML private ComboBox<String> existingClientsBox;
	
	/** The cars available. */
	@FXML private ComboBox<String> existingCarsBox;
	
	private String vysl;
	private String pomocna;

	/**
	 * Initialize.
	 */
	public void initialize() {
		editOrder(); 
		save.setDisable(true);
		valid.setDisable(false);
		bdelete.setDisable(true);		
		hourFrom.getItems().removeAll(hourFrom.getItems());
		hourFrom.getItems().addAll("01","02","03","04","05","06","07","08","09","10","11","12");
		hourFrom.getSelectionModel().select("Praha");
		hourFrom.setPromptText("hh");
		
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
		
		clientType.getItems().addAll("New","Existing");
		carType.getItems().addAll("New","Existing");
		
		try {
			Connection conn = dbConnection();
			String query = "select district_name from districts";
			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			placefrom.getItems().clear();
			placeto.getItems().clear();
			while(rs.next()) {
				placeto.getItems().add(rs.getString("district_name"));
				placefrom.getItems().add(rs.getString("district_name"));
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
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
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Tooltip tooltip = new Tooltip();
		tooltip.setText("Enter telephone as +42xxxxxxx");
		telephone.setTooltip(tooltip);
		Tooltip tooltip2 = new Tooltip();
		tooltip2.setText("Transporation to city");
		placeto.setTooltip(tooltip2);
		Tooltip tooltip3 = new Tooltip();
		tooltip3.setText("Transporation from city");
		placefrom.setTooltip(tooltip3);
		Tooltip tooltip4 = new Tooltip();
		tooltip4.setText("Type of license car requires");
		license.setTooltip(tooltip4);
		Tooltip tooltip5 = new Tooltip();
		tooltip5.setText("Select date of the transportation.");
		date.setTooltip(tooltip5);
		Tooltip tooltip6 = new Tooltip();
		tooltip6.setText("Will the client be in the car?");
		driving.setTooltip(tooltip6);
		Tooltip tooltip7 = new Tooltip();
		tooltip7.setText("Validation errors:");
		validateError.setTooltip(tooltip7);
		
		
	}
	
	
	/**
	 * Entering the information about client
	 */
	public void clientType() {
		String value = clientType.getValue();
		switch(value) {
			case "New" : {
				carType.getItems().clear();
				carType.getItems().add("New");
				clientid.setVisible(true);
				name.setVisible(true);
				surname.setVisible(true);
				telephone.setVisible(true);
				existingClientsBox.setVisible(false);
				valid.setDisable(false);
				break;
			}
			case "Existing" : {
				valid.setDisable(true);
				carType.getItems().clear();
				carType.getItems().addAll("New","Existing");
				clientid.setVisible(false);
				name.setVisible(false);
				surname.setVisible(false);
				telephone.setVisible(false);
				existingClientsBox.setVisible(true);
				existingClientsBox.setOnMouseClicked(event -> {
					existingCarsBox.getItems().clear();
				});
				try {
					Connection conn = dbConnection();
					String query = "select clientid from clients";
					PreparedStatement pst = conn.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					existingClientsBox.getItems().clear();
					while(rs.next()) {
						existingClientsBox.getItems().add(rs.getString("clientid"));
					}
					pst.close();
					conn.close();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;				
			}
		}
	}
	
	
	/**
	 * Selecting client by conditions.
	 */
	public void updateDriver() {
		placeto.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override public void changed(ObservableValue <? extends String> observableValue, String string, String string2) {
				Connection conn;
				try {
				conn = dbConnection();
				String query = "select driverid from drivers where time_from <= ? and time_to >= ? and region in (select region from districts where district_name=?)";
				PreparedStatement pst = conn.prepareStatement(query);
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
				String place = placefrom.getValue().toString();
				pst.setString(1, timef);
				pst.setString(2, timet);
				pst.setString(3, place);
					ResultSet rs = pst.executeQuery();
				driverBox.getItems().clear();
				while(rs.next()) {
					driverBox.getItems().add(rs.getString("driverid"));
				}
				conn.close();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
	});}
	
	/**
	 * Entering car.
	 */
	public void carType() {
		String value = carType.getValue();
		if (value != null) {
		switch(value) {
			case "New" : {
				valid.setDisable(false);
				brand.setVisible(true);
				carid.setVisible(true);
				model.setVisible(true);
				license.setVisible(true);
				existingCarsBox.setVisible(false);
				break;
			}
			case "Existing" : {
				brand.setVisible(false);
				valid.setDisable(true);
				save.setDisable(false);
				carid.setVisible(false);
				model.setVisible(false);
				license.setVisible(false);
				existingCarsBox.setVisible(true);
				existingCarsBox.setOnMouseClicked(event -> {
					try {
						Connection conn = dbConnection();
						String query = "select carid from cars where clientid = ?";
						PreparedStatement pst = conn.prepareStatement(query);
							String query2 = "SELECT id FROM clients WHERE clientid = ?";
							PreparedStatement pst2 = conn.prepareStatement(query2);
							pst2.setString(1,existingClientsBox.getValue());
							ResultSet rs = pst2.executeQuery();
							int id = 0;
							while (rs.next()) {
								id = rs.getInt("id");
							}
							pst2.close();
						pst.setInt(1,id);
						rs = pst.executeQuery();
						existingCarsBox.getItems().clear();
						while(rs.next()) {
							existingCarsBox.getItems().add(rs.getString("carid"));
						}
						pst.close();
						conn.close();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				});
				
				break;
			}
		} 
		}else {
			brand.setVisible(false);
			carid.setVisible(false);
			model.setVisible(false);
			license.setVisible(false);
			existingCarsBox.setVisible(false);
		}
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
		if (clientType.getValue().equals("New")) {
			addClient();
		}
		if (carType.getValue().equals("New")) {
			addCar();
		}
		if(addOrder()) {			
			Stage stage = (Stage) name.getScene().getWindow();
	      		stage.close();
		}
		
		
	}
	
	/**
	 * Edit the order.
	 */
	public void editOrder() {
		save.setDisable(false);
		edit.setDisable(true);
		bdelete.setDisable(true);
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
		insertOrder();
	}
	
	/**
	 * Delete order.
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
     * Adding car to database.
     *
     */
	public void addCar() {
		try {
			Connection conn = dbConnection();
			String query = "INSERT INTO cars (brand,model,license,carid,clientid) VALUES (?,?,?,?,?)";
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
				e.printStackTrace();
			}
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
     * Adding client to database.
     *
     */
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
				e.printStackTrace();
			}
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
     * Adding order to database.
     *
     */
	public Boolean addOrder() {
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
				int minf = Integer.parseInt(minuteFrom.getValue());
				int mint = Integer.parseInt(minuteTo.getValue());
				if (hourf < hourt ) {
				String timef = hourf + ":" + minuteFrom.getValue();
				String timet = hourt + ":" + minuteTo.getValue();
 				pst.setString(2,timef);
				pst.setString(3,timet);
				}
				else if (hourf==hourt && minf < mint) {
					String timef = hourf + ":" + minuteFrom.getValue();
					String timet = hourt + ":" + minuteTo.getValue();
	 				pst.setString(2,timef);
					pst.setString(3,timet);
				}
				else {
					Alert al = new Alert(AlertType.INFORMATION, "Wrong time, you should change the time to or time from.");
					al.setHeaderText("Alert");
					Optional<ButtonType> result = al.showAndWait();
					al.close();	
					editOrder();
					return false;
				}
				pst.setBoolean(4, driving.isSelected());
				pst.setString(5,placefrom.getValue().toString());	
				pst.setString(6,placeto.getValue().toString()); 
				
				
				String query2 = "SELECT id FROM clients WHERE clientid = ?";
				PreparedStatement pst2 = conn.prepareStatement(query2);
				if (clientType.getValue().equals("New")) {
					pst2.setString(1,clientid.getText());
				} else {
					pst2.setString(1,existingClientsBox.getValue());
				}
				ResultSet rs = pst2.executeQuery();
				int id = 0;
				while (rs.next()) {
					id = rs.getInt("id");
				}
				pst2.close();
				pst.setInt(7,id);
				
				query2 = "SELECT id,license FROM cars WHERE carid = ?";
				pst2 = conn.prepareStatement(query2);
				if (carType.getValue().equals("New")) {
					pst2.setString(1,carid.getText());
				} else {
					pst2.setString(1,existingCarsBox.getValue());
				}
				rs = pst2.executeQuery();
				int carid = 0;
				String licenseC = "";
				while (rs.next()) {
					carid = rs.getInt("id");
					licenseC = rs.getString("license");
				}
				pst2.close();
				pst.setInt(8,carid);
				
				query2 = "SELECT id,license FROM drivers WHERE driverid = ?";
				pst2 = conn.prepareStatement(query2);
				pst2.setString(1,driverBox.getValue());
				rs = pst2.executeQuery();
				int driverid = 0;
				String license = "";
				while (rs.next()) {
					driverid = rs.getInt("id");
					license = rs.getString("license");
				}
				pst2.close();
				if (license.equals(licenseC)) {
					pst.setInt(9,driverid);
					pst.execute();
					pst.close();
					conn.close();
					return true;
				}
				else {
					Alert al = new Alert(AlertType.INFORMATION, "Car license and driver license do not match, you should change driver.");
					al.setHeaderText("Alert");
					Optional<ButtonType> result = al.showAndWait();
					al.close();	
					editOrder();
					return false;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return true;
	}	
	
	
	/**
     * Validate method - the validation of choosen fields
     *
     * @return the names wrong filled fields are written into a field.
     */
	
	public void vaidate() {
	 save.setDisable(true);
		vysl = "";
		List<String> list = new ArrayList<String>();
	
		if (carType.getValue().equals("New")) {
		list.add("model");
		list.add("brand");
		} else {return;}
		if (clientType.getValue().equals("New")) {
		list.add("telephone");
		list.add("name");
		list.add("surname");
		}
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
				case "brand":{
					 pomocna = brand.getText();
					 break;
				}
				case "model":{
					 pomocna = model.getText();
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
