package com.github.stai02.semestralka2.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;

/**
 * The Class HomeController7 for control Home7.fxml. Window search results.
 */
public class HomeController7 {
	
	/** The detail. */
	@FXML public Button detail;
	
	/** The text area. */
	@FXML public TextArea results;

	/** The table. */
	@FXML public TableView table;
	
	/**
	 * Initialize.
	 */
	public void initialize() {
		detail.setDisable(true);
		TableView table = new TableView();
		table.setEditable(true);
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
		    Map<Integer,String> columnNames = new HashMap<Integer,String>();
		    for (int i = 1; i < columnCount; i++) {
		        columnNames.put(i, metadata.getColumnName(i));
		    }
		    /*row += metadata.getColumnName(columnCount) + "\n";
			while (rs.next()) {
		        for (int i = 1; i < columnCount; i++) {
		            row += rs.getString(i) + ", ";          
		        } 
		        row += rs.getString(columnCount) + "\n";
			}
			results.setText(row);*/
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
