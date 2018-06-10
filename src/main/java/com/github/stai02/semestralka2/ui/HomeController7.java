package com.github.stai02.semestralka2.ui;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;

/**
 * The Class HomeController7 for control Home7.fxml. Window search results.
 */
public class HomeController7 {
	
	/** The detail. */
	@FXML
	public Button detail;
	@FXML public TextArea results;

	/**
	 * Initialize.
	 */
	public void initialize() {
		detail.setDisable(true);
	}
	
	public Connection dbConnection() throws ClassNotFoundException {
	 	   Class.forName("org.sqlite.JDBC");
	        Connection connection = null;
	        try
	        {
	          // create a database connection
	          connection = DriverManager.getConnection("jdbc:sqlite:./resources/main/java/com/github/stai02/semestralka2/main/db.db");
	          //System.out.println("connected");
	        }
	        catch(SQLException e)
	        {
	          // if the error message is "out of memory",
	          // it probably means no database file is found
	          System.err.println(e.getMessage());
	        }
	        return connection;
	    }
	
	public void result(String choice, String select, String selectText) {
		try {
			Connection conn = dbConnection();
			String query = "SELECT * FROM " + choice + " WHERE " + select + " = ?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1, selectText);
			ResultSet rs = pst.executeQuery();
			ResultSetMetaData metadata = rs.getMetaData();
		    int columnCount = metadata.getColumnCount();
			String row = "";
		    for (int i = 1; i < columnCount; i++) {
		        row += metadata.getColumnName(i) + ", ";      
		    }
		    row += metadata.getColumnName(columnCount) + "\n";
			while (rs.next()) {
		        for (int i = 1; i < columnCount; i++) {
		            row += rs.getString(i) + ", ";          
		        } 
		        row += rs.getString(columnCount) + "\n";
			}
			results.setText(row);
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
	 * Show detail.
	 */
	public void showDetail(){
		
	}
}
