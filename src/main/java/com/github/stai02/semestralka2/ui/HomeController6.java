package com.github.stai02.semestralka2.ui;

import com.github.stai02.semestralka2.logic.Order;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * The Class HomeController6 for control Home6.fxml. Window timetable of orders.
 */
public class HomeController6 {
	
	/** The detail. */
	@FXML
	public Button delete;
	@FXML TableView<Order> tableview;
	@FXML TableColumn<Order, Integer> id;
	@FXML TableColumn<Order, String> date;
	@FXML TableColumn<Order, String> time;
	@FXML TableColumn<Order, String> place;
	@FXML TableColumn<Order, String> client;
	@FXML TableColumn<Order, String> car;
	
	/**
	 * Initialize.
     */
	
	//Order(int id,String date, String placeFrom, String placeTo, boolean clientGoes, String timeFrom, String timeTo, int carid)
	public void initialize() {
		id.setCellValueFactory(new PropertyValueFactory<>("ID"));
		date.setCellValueFactory(new PropertyValueFactory<>("date"));
		time.setCellValueFactory(new PropertyValueFactory<>("time"));
		place.setCellValueFactory(new PropertyValueFactory<>("place"));
		client.setCellValueFactory(new PropertyValueFactory<>("clientGoes"));
		car.setCellValueFactory(new PropertyValueFactory<>("carid"));
		addToTable();
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
	 * Show orders in a table.
     */
	
	public void addToTable() {
		try {
			Connection conn = dbConnection();
			String query = "select id,date,client_in_car,time_from,time_to,from_place,to_place,carid from orders";
			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			//java.util.Date utilDate = new java.util.Date(sqlDate.getTime())
			while (rs.next()) {
				int id = rs.getInt("id");
				String date = rs.getString("date");
				boolean client_in_car = rs.getBoolean("client_in_car");
				String timeFrom = rs.getString("time_from");
				String timeTo = rs.getString("time_to");
				String from = rs.getString("from_place");
				String to = rs.getString("to_place");
				int carid = rs.getInt("carid");
					String query2 = "SELECT carid FROM cars WHERE id = ?";
					PreparedStatement pst2 = conn.prepareStatement(query2);
					pst2.setInt(1, carid);
					ResultSet rs2 = pst2.executeQuery();
					String carids = "";
					while (rs2.next()) {
						carids = rs2.getString("carid");
					}
					pst2.close();

				//System.out.println(date+" "+timeFrom+" "+timeTo+" "+from+" "+to+" "+client_in_car+" "+carids);
				tableview.getItems().add(new Order(id,date.toString(),from,to,client_in_car,timeFrom,timeTo,carids));

			}
			pst.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Delete orders.
	 */
	public void delete(){
		int idOrder = tableview.getSelectionModel().getSelectedItem().getID();
		try {
			Connection conn = dbConnection();
			String query = "DELETE FROM orders WHERE id = ?;";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setInt(1, idOrder);
			pst.execute();
			pst.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tableview.getItems().clear();
		addToTable();
	}
}
