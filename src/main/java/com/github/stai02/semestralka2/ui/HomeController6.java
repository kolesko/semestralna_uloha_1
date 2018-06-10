package com.github.stai02.semestralka2.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

/**
 * The Class HomeController6 for control Home6.fxml. Window timetable of orders.
 */
public class HomeController6 {
	
	/** The detail. */
	@FXML
	public Button detail;
	@FXML TableColumn id;
	@FXML TableColumn date;
	@FXML TableColumn time;
	@FXML TableColumn place;
	@FXML TableColumn client;
	@FXML TableColumn car;

	/**
	 * Initialize.
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public void initialize() {
		detail.setDisable(true);
		Connection conn = dbConnection();
		String query = "select date,clientid,time_from,time_to,from_place,to_place,carid from orders";
		PreparedStatement pst = conn.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		//java.util.Date utilDate = new java.util.Date(sqlDate.getTime())
		while (rs.next()) {
			java.util.Date date = rs.getDate("date");
			String from = rs.getString("from_place");
			String to = rs.getString("to_place");
			int clientid = rs.getInt("clientid");
			int carid = rs.getInt("carid");
			System.out.println(date+" "+from+" "+to+" "+clientid+" "+carid);
			id.setCellValueFactory("1");
			
		}

	}

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
	
	/*
	 * tabulka orders
	 * 
	 * clientid, carid, date, time_from, time_to, driverid, client_in_car, from_place, to_place
	 * clientid, carid, driverid su id v tabulkach clients cars a drivers
	 * tabulka clients - id, name, surname, telephone, clientid(to je to co zadava pri vytvarani noveho podla coho sa potom robia tie comboboxy "prihlasovacie meno")
	 * tabulka cars - id, brand, model, license, carid, clientid(client id je primary key v tabulke clients a carid je SPZ tiez je v tom comboboxe na existujuce auta)
	 * tabulka drivers - id, name, surname, telephone, license, region, driverid(tiez nieco ako clientid takze "prihlasovacie meno")
	 * 
	 */
	
	/**
	 * Show detail.
	 */
	public void showDetail(){
		
	}
}
