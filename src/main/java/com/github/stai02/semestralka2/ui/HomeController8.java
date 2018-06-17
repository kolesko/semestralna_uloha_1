package com.github.stai02.semestralka2.ui;

import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

/**
 * @author Ivana Stanová, Matej Kolesár, Lenka Šťastná, Julia Loseeva
 *
 */


public class HomeController8 {

	@FXML private TextField username;
	@FXML private PasswordField password;
	@FXML private Button login;
	@FXML private Tooltip tooltip;
	
	public void initialize() {
		
	}
	
	/** 
	 * Log into the application.
	 * 
	 * @throws ClassNotFoundException the class not found exception
	 */	
	public void login() throws ClassNotFoundException {
		Connection conn = dbConnection();
		
		try {
			String query = "select (SELECT EXISTS(SELECT * FROM users WHERE username = ?)), password, role from users where username=?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1, username.getText());
			pst.setString(2, username.getText());
			ResultSet rs =	pst.executeQuery();
			if (rs.next() && rs.getString(2).equals(password.getText())) {
				// CHECKS USER'S ROLE
				if (rs.getString(3).equals("driver")) {
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/github/stai02/semestralka2/main/Home3.fxml"));
					Parent root = (Parent) fxmlLoader.load();
					HomeController3 c = (HomeController3) fxmlLoader.getController();
					c.displayDriver(username.getText());
					Platform.runLater( () -> root.requestFocus() );
					Stage stage = new Stage();
					stage.setTitle("Driver details");
					stage.setScene(new Scene(root));  
					stage.show();	
					Stage currentWindow = (Stage) username.getScene().getWindow();
					currentWindow.close();
				} else if (rs.getString(3).equals("employee")) {
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/github/stai02/semestralka2/main/Home2.fxml"));
					Parent root = (Parent) fxmlLoader.load();
					Stage stage = new Stage();
					stage.setTitle("Menu");
					stage.setScene(new Scene(root));  
					stage.show();	
					Stage currentWindow = (Stage) username.getScene().getWindow();
					currentWindow.close();
			} else {
				Alert alert = new Alert(AlertType.WARNING);
				alert.setTitle("Warning Dialog");
				alert.setContentText("Enter a valid username and password.");
				alert.showAndWait();
			}
			conn.close();
		} 
			} catch (Exception e) {
			System.out.println("select data error " + e);
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
}
